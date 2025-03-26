import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contolller {
    private List<User> users;

    public Contolller() {
        this.users = new ArrayList<>();
    }

    public void createUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! Lets create your account.");

        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter your email: ");
        String email = input.nextLine();

        System.out.print("Enter your new password: ");
        String password = input.nextLine();

        System.out.print("Enter your phone number: ");
        int phoneNum = input.nextInt();

        User newUser = new User(firstName, lastName, email, password, phoneNum);
        users.add(newUser);
        System.out.println("User created successfully!\n");
        System.out.println(newUser.printUserDetails());
    }

    public void listUsers() {
        if (users.isEmpty()) {
            System.out.println("No users available.");
            return;
        }
        System.out.println("User List:");
        for (User user : users) {
            System.out.println(user.printUserDetails());
        }
    }
}
