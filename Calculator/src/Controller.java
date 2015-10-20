
public class Controller {
public static void main(String[] args) {
	float nOne, nTwo;
	Calculator michaelCalculator = new Calculator();
	
	
	nOne =Float.parseFloat(args[0]);
	nTwo =Float.parseFloat(args[1]);
	
	
	michaelCalculator.setNumOne(nOne);
	michaelCalculator.setNumTwo(nTwo);
	
	System.out.println("Adding: " + michaelCalculator.add());
	System.out.println("Subtract: " + michaelCalculator.takeAway());
	System.out.println("Divide: " + michaelCalculator.divide());
	System.out.println("Multiply: " + michaelCalculator.multiply());
}
}
