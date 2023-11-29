package passchecker;

import java.util.Objects;
import java.util.Scanner;

public class PassChecker {

    private final Scanner stream;
    private final String password;

    public PassChecker() {
        this.stream = new Scanner(System.in);
        System.out.println("Set your password: ");

        this.password = this.stream.nextLine();
    }

    private boolean checkPassword(){
        String attempt = this.stream.nextLine();
        return Objects.equals(attempt, this.password);
    }

    public void tryConnect() {
        while (true){
            System.out.println("Please enter your password: ");
            String attempt = this.stream.nextLine();
            if (Objects.equals(attempt, this.password)) {
                break;
            }
            System.out.println("Sorry, your try incorrect");
        }
    }
}
