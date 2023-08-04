class Fan
{
	String color;
	int cost;
	int no_of_blades;
 void rotate()
{
	System.out.println("fan is rotating");
}
void blowsair()
{
	System.out.println("fan is blowing");
}
}
class Fanapp
{
public static void main(String[]args)
{
Fan f1 = new Fan();
Fan f2 = new Fan();
Fan f3 = new Fan();
f1.rotate();
f2.blowsair();
f3.rotate();
}
}