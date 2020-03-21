package bootcampfinal;

public class InfoAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals info = new Cat2 ();
		info.animalsinfo();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Animals cats = new Cat2 ();
		cats.animalsinfo();
		cats.eat();
		cats.move();
		cats.hunt();
	}

}
