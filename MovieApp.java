class Movie
{
  String name;
  int id;
  String hero;
  String heroine;
  int no_of_actors;

  void make()
  {
	System.out.println("movie  make in karnataka");
  }

  void watch()
  {
	System.out.println("movie  watched in hassan");
  }
}

class MovieApp
{
	public static void main(String[]args)
	{
	  Movie m1 = new Movie();
	  Movie m2 = new Movie();
	

	m1.name="kgf3";
	m1.id=23;
	m1.hero="yash";
	m1.heroine="radhika";
	m1.no_of_actors=200;
	
	System.out.println(m1.name);
	System.out.println(m1.id);
	System.out.println(m1.hero);
	System.out.println(m1.heroine);
	System.out.println(m1.no_of_actors);


	  m1.make();
	  m1.watch();

	m2.name="ssf";
	m2.id=24;
	m2.hero="yash";
	m2.heroine="radhika";
	m2.no_of_actors=150;


System.out.println(m2.name);
System.out.println(m2.id);
System.out.println(m2.hero);
System.out.println(m2.heroine);
System.out.println(m2.no_of_actors);

	  m2.make();
	  m2.watch();
}
}
