class Employee{
String name,city;
int age;
void display(){
System.out.println("The Name is "+name);
System.out.println("The Age is "+age);
System.out.println("The City is "+city);
}
}
public class Assign1{
public static void main(String[] args)
{
Employee e1=new Employee();
System.out.println("---------------------------------------------");
e1.name="Pratiksha";
e1.city="Pune";
e1.age=20;
e1.display();
System.out.println("---------------------------------------------");
Employee e2=new Employee();
e1.name="Divya";
e1.city="Pune";                    
e1.age=25;                                                                        
e1.display(); 
System.out.println("---------------------------------------------");
}
}