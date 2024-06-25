
class employee{

    int id;
    String name;
    public void printDetails(){
        System.out.println("my id " +" " + id);
        System.out.println("my name" +" " + name );
    }

}


public class cwh_38_customclass {
    
 
    
    public static void main(String[] args) {
        System.out.println("jai shree ram");

        // instantiating a new employee object 

        employee sarthak = new employee();
        employee john = new employee();

        // setting the attribute 

        sarthak.id=31;
        sarthak.name="VDSinghal";

        john.id=32;
        john.name="John singhal ";

        //printing tthe  attribute 
        sarthak.printDetails();
        john.printDetails();


            }

    
}
