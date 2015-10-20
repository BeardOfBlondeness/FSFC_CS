package thisisapackage;

public class Controller {
	public static void main(String[] args) {
		float nOne, nTwo, nThree;

		ShapeArea michaelCalculator = new ShapeArea();
		
		
		nOne =Float.parseFloat(args[0]);
		nTwo =Float.parseFloat(args[1]);
		nThree =Float.parseFloat(args[2]);
		
		michaelCalculator.setdiam(nOne);
		michaelCalculator.setheight(nTwo);
		michaelCalculator.setlength(nThree);
		
		
		System.out.println("Circle area: " + michaelCalculator.circle());
		System.out.println("sphere volume: " + michaelCalculator.sphere());
		System.out.println("cuboid volume: " + michaelCalculator.cuboid());
		System.out.println("square area: " + michaelCalculator.square());
	}
}
