import java.util.Random;
import java.util.Scanner ;
public class cwh_19 {
    public static void main(String[] args) {
        System.out.println("jai shree ram ");
        Scanner sc =new Scanner(System.in);

        // ouestion 1

        // int a =10;
        // if (a == 11){
        //     System.out.println("i am 11");

        // }
        // else{
        //     System.out.println(" i am not 11");
        // }

        // ouestion 2 

        // System.out.println( " enter the maths marks  :- " );
        // int math = sc.nextInt();
        // System.out.println( " enter the  science  :- " );
        // int science = sc.nextInt();
        // System.out.println( " enter the  sst  :- " );
        // int sst = sc.nextInt();
        // float sum =  ((math + science + sst) /300f) *100f;
        // // System.out.println( "your marks is "+sum +"%" );

        // if (sum >= 40 && math >=33 && science >=33 && sst>33 ){
        //     System.out.println(" you pass " + sum);
        // }
         
        // else{
        //     System.out.println(" ohh betr luck next time " + sum + " % ");
        // }

        // question 5 
        // System.out.println("enter your year :- ");
        // int y =sc.nextInt();

        // if (y%100!=0){

        //     System.out.println("not leap year ");

            
        // }
        // if (y%400 ==0 ){
        //     System.out.println(" leap year");
        // }
      
       
        // if(y%4==0) {
        //     System.out.println(" leap year");

        // }

        // question 6
      
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Display options to the user
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter your choice: 0 for Rock, 1 for Paper, 2 for Scissors");

        // Get user's choice
        int userChoice = scanner.nextInt();

        // Validate user input
        if (userChoice < 0 || userChoice > 2) {
            System.out.println("Invalid choice! Please enter 0, 1, or 2.");
            return;
        }

        // Generate computer's choice
        int computerChoice = random.nextInt(3);

        // Display choices
        System.out.println("You chose: " + choiceToString(userChoice));
        System.out.println("Computer chose: " + choiceToString(computerChoice));

        // Determine the winner
        String result = determineWinner(userChoice, computerChoice);

        // Display the result
        System.out.println(result);

        scanner.close();
    }

    // Function to convert choice number to string
    public static String choiceToString(int choice) {
        switch (choice) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissors";
            default:
                return "Invalid choice";
        }
    }

    // Function to determine the winner
    public static String determineWinner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return "It's a tie!";
        } else if ((userChoice == 0 && computerChoice == 2) ||
                   (userChoice == 1 && computerChoice == 0) ||
                   (userChoice == 2 && computerChoice == 1)) {
            return "You win!";
        } else {
            return "You lose!";
        }
    }
}




        

    