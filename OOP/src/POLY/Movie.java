package POLY;

public class Movie {

	private String title;
	public Movie(String title) {
		this.title=title;
		
	}
	public void Watchmovie() {
		String instance=this.getClass().getSimpleName();
		System.out.println(title+"  is a "+instance);
		
		
		
	}
	
}

class Advan extends Movie{
 public Advan (String title) {
	super (title);

	//override
 }
 @Override
 public void Watchmovie() {
	 super.Watchmovie();
	System.out.println("override method is implement"); 
 }
 
}