
public class Calculator {
private float numOne, numTwo; 

public Calculator() { 
}


public float getNumOne() {
	return this.numOne;
}


public void setNumOne(float nOne)
{
	this.numOne = nOne;
}

public float getNumTwo() {
	return this.numTwo;
}


public void setNumTwo(float nTwo)
{
	this.numTwo = nTwo;
}



public float add() { 
	return numOne+numTwo; 
	
}

public float takeAway() { 
	return numOne-numTwo;
	
}

public float divide() { 
	
	return numOne/numTwo;
}

public float multiply() { 
	return numOne*numTwo; 
	
}


}
