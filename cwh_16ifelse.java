import java.util.Scanner;

public class cwh_16ifelse {
    public static void main(String[] args) {
        // System.out.println("jai shree name ");
        //  if else program 
        Scanner sc =new Scanner(System.in);
        int age =sc.nextInt();
        boolean cond =(age >=18);


        if (cond){
            System.out.println("yes your age is like a teenagers");
        }
        else {
            System.out.println("you can't fuck because your cannot match the age ");
        }



    }
    
}
