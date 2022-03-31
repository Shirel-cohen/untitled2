import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RealEstate relEstate = new RealEstate();
        int userChoice;
        do{
            System.out.println("Choose  your action");
            System.out.println("1 - Sign up");
            System.out.println("2 - Sign in");
            System.out.println("3 - Exit");
            userChoice=scanner.nextInt();
            switch (userChoice){
                case 1:
                    relEstate.createUser();
                    break;
                case 2:
                    User user = relEstate.login();
                    if (user == null){
                        System.out.println("Wrong credentials!");
                    } else {
                        System.out.println("Choose an action:");
                        System.out.println("1 - Post new property");
                        userChoice = scanner.nextInt();
                        switch (userChoice){
                            case 1:
                                break;
                            case 2:
                                break;
                        }

                    }
                    break;
                case 3:
                    break;
            }
        } while (userChoice !=3);

    }
}
