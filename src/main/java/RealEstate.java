import java.util.LinkedList;
import java.util.Scanner;

public class RealEstate {

    private LinkedList<User> users;
    private LinkedList<Property> properties;
    private LinkedList<Address> addresses;
public RealEstate(){
    this.users = new LinkedList<>();
    this.properties = new LinkedList<>();
    this.addresses = new LinkedList<>();
}
    public void createUser(){
        Scanner scanner = new Scanner(System.in);
        boolean usernameTaken = false;
        String username= null;
        do{
            System.out.println("Enter username:");
             username = scanner.nextLine();
            usernameTaken = this.doesUserNameExist(username);
        }while(usernameTaken);
        boolean strongPassword=false;
        String password = null;
        do{
            System.out.println("Enter a strong password: ");
             password = scanner.nextLine();
            strongPassword = this.checkIfStrongPassword(password);
        } while (!strongPassword);
      boolean validIsraeliPhone = false;
      String phoneNumber = null;
      do{
          System.out.println("Enter your cell phone number: ");
           phoneNumber = scanner.nextLine();
          validIsraeliPhone = this.validatePhone (phoneNumber);
      } while (!validIsraeliPhone);
        System.out.println("Are you a real estate broker?");
        String answer = scanner.nextLine();
        boolean broker = false;
        if (answer.equals("Yes")){
            broker = true;
        }
        User newUser = new User(username,password,phoneNumber,broker);
        this.users.add(newUser);
        System.out.println("User was added!");

    }
    private boolean validatePhone(String phoneToCheck){
    boolean valid = false;
    if (phoneToCheck.length()==10 && phoneToCheck.startsWith("05")){
        valid = true;
    }
    return valid;

    }
    private boolean doesUserNameExist(String usernameToCheck){
        boolean exits = false;
        for (User currentUser : this.users){
            if (currentUser.getUserName().equals(usernameToCheck)){
                exits = true;
                break;
            }
        }
        return exits;
    }
    private boolean checkIfStrongPassword(String password){
    boolean strong = false;
    if (password.length()>=4){
        strong = true;
    }
    return strong;
    }

    public User login (){
    User found = null;
    Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your username");
        String username = scanner.nextLine();
        System.out.println("Enter your password");
        String password = scanner.nextLine();
        for (User currentUser : this.users){
            if (currentUser.getUserName().equals(username) && currentUser.getPassword().equals(password)){
                found = currentUser;
                break;
            }
        }
        return found;
    }
}