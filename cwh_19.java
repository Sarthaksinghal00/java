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

        System.out.println( " enter the maths marks  :- " );
        int math = sc.nextInt();

        if (math < 33)   {
           
            System.out.println(" pls next time better marks ");
            
        }
    
        else{
            System.out.println(" good");
        }
          

        System.out.println( " enter the  science  :- " );
        int science = sc.nextInt();
        if (science < 33)   {
           
            System.out.println(" pls next time better marks ");
            
        }
    
        else{
            System.out.println(" good");
        }

        System.out.println( " enter the  sst  :- " );
        int sst = sc.nextInt();

        if (sst < 33)   {
           
            System.out.println(" pls next time better marks ");
            
        }
    
        else{
            System.out.println(" good");
        }

        float sum =  ((math + science + sst) /300f) *100f;
        // System.out.println( "your marks is "+sum +"%" );

        if (sum >= 33){
            System.out.println(" you pass " + sum);
        }
         
        else{
            System.out.println(" ohh betr luck next time ");
        }




    }
}
