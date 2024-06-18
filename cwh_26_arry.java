public class cwh_26_arry {
    public static void main(String[] args) {
        System.out.println("jai shree ram ");
        System.out.println("array");
// 26 viedo code with harry 
        // int [] marks ={98,99,87,75,75,98};
        // System.out.println(marks[4]);


        //  27 viedo code with harry =========
        // int [] marks ={98,99,87,75,75,98};
         

      
        // disply array using for loop 
        // for (int i=0; i<marks.length;i++){
        //     System.out.println(marks[i]);
        // }

        // display th array using for each loop
        // for(int element:marks){
        //     System.out.println(element);
        // }
        // 28 viedo code with harry multidimensinal or 2-d arry  in java 
        // type[][] arryName =new type[row][columns]
        // examle
        int [][] number =new int[2][3];
        number[0][0]=101;number[0][1]=101;number[0][2]=101;
        number[1][0]=101;number[1][1]=101;number[1][2]=101;
        for (int i=0; i<number.length;i++){
            for(int j=0;j<number[i].length;j++){
                System.out.print(number[i][j]);
                System.out.print("  ");
            }
            System.out.println(" ");
             
            }







    }
}
