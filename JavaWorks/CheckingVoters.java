import java.util.Scanner;

public class CheckingVoters {

    public void votersChecking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String nameResult = sc.nextLine();
        System.out.println("enter your age:");
        int result = sc.nextInt();

        if (result < 18) {
            System.out.println(nameResult + " " + "you are not eligible to vote");
        } else if (result > 18) {
            System.out.println(nameResult + " " + "you are  eligible to vote");
        } else {
            System.out.println(nameResult + " " + "just one year ahead");
        }
        sc.close();
    }

    public static void main(String[] args) {
        CheckingVoters obj = new CheckingVoters();
        obj.votersChecking();
    }
}
