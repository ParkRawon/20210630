package co.yedam.inheritance;

public class ArtistExample {
	public static void main(String[] args) { //다형성
		
		Shape shape = new Shape();
		Triangle tri = new Triangle();
		Circle cir = new Circle();
		Rectangle rect = new Rectangle();
		
		
		Artist artist = new Artist();
		artist.paint(rect); //(매개변수)매개변수의 다형성.
	}

}