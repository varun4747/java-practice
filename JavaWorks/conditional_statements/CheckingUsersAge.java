package conditional_statements;
import java.util.Scanner;

public class CheckingUsersAge {

    public void ageChecking(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int ageStore= sc.nextInt();

        switch (ageStore) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("toddler");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            System.out.println("child");
                break;        
            default:
            System.out.println("you are younger");
                break;
                
        }
        sc.close();
    }
    public static void main(String[] args) {
        CheckingUsersAge obj=new CheckingUsersAge();
        obj.ageChecking();
    }
    
}
