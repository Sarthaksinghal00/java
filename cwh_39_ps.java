class Employee{
    int salary;
    String name;

    public int getsalary(){
        return salary;

    }
    public String getname(){
        return name;
    }

    public void setname(String n){
        name =n;
    }
    



}

public class cwh_39_ps {
  
    public static void main(String[] args) {
        System.out.println("jai shree ram /n 39");
        Employee sarthak= new Employee();
        sarthak.setname("sarthak singhal So deepak singhal");
        sarthak.salary=1000000000;
        System.out.println(sarthak.getsalary());
        System.out.println(sarthak.getname());



        
    }
    
}
