class Employee
{
    int empno;
    String name; 
    float sal; 
    Employee() { 
        System.out.println("Employee details");
        empno= 452;
        name= "Rahul";
        sal= 43000;
    }
    public void display_details() {
        System.out.println("Employee number is:"+empno+" Employee name is:"+name+" Employee's salary is:"+sal);
    }
}
class Main 
{
   public static void main(String[]args)
   {
    Employee e1 = new Employee();
    e1.display_details(); 
    
   }
}
   
