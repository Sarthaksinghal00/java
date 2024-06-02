import java.util.Scanner;
public class cwh_18 {
    public static void main(String[] args) {
        System.out.println("jai shree ram ");
        System.out.println("switch case stament in jave");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value :- ");
        int age =sc.nextInt();

        switch (age){
            case 18:
            System.out.println(" your are expercience");
            break;
            case 23:
            System.out.println("your going to job ");
            break;
            case 60:
            System.out.println("your going to  retired! ");
            break;
            case 65:
            System.out.println("your going to bsdk ");
            break;
            default:
            System.out.println("enjoy your life ");


        }
        System.out.println(" thanks for using java code");
         




       /*
        if (age >18 ){
            System.out.println(" your are expercience");

        }
        else if (age >46){
            System.out.println( " your are semi experiance ");

        }
        else if (age> 30){
            System.out.println(" your are just start up");

        }
        else if (age >21){
            System.out.println(" well done your are choose  good choice ");

        }
        else {
            System.out.println(" chlo start kro coding ko baccha !");
        }
        */




    }

    
}
