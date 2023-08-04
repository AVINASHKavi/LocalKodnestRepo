class Student
{
	String name;
	int id;
	int age;
 void eat()
 {
	System.out.println("student is eating");
 }
 void sleep()
 { 
	System.out.println("student is sleeping");
 }
 void study()
 {
	System.out.println("student is studying");
 }
}
class Studentapp
{
 	public static void main(String[]args)
	{
	  Student s1 = new Student();
	  Student s2 = new Student();
	  Student s3 = new Student();
		s1.eat();
		s2.sleep();
		s3.study();
	}
}