public class cwh_33varagrs {

    static int sum ( int... arr){
        int result=0;
        for (int a : arr){
            result +=a;
        }
         return result;
    }

    public static void main(String[] args) {
        System.out.println("jai shree ram ");
        System.out.println(sum(1,4,5,6));
    }
}