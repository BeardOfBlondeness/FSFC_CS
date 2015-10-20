package thisisapackage;

public class ShapeArea {
private float diam, height, length; 


public ShapeArea() { 
}


public float getdiam() {
	return this.diam; 
}
public void setdiam(float nOne)
{
	this.diam = nOne;
}


public float getheight() {
	return this.height;
}


public void setheight(float nTwo)
{
	this.height = nTwo;
}

public float getlength() {
	return this.length;
}


public void setlength(float nThree)
{
	this.length = nThree;
}



public double circle() {
	return (diam*3.14)*(diam*3.14);
}

public float square() { 
	return diam*height; 
}

public float cuboid() { 
return (diam*height)*length;	
}
			
public double sphere() { 
return (1.33)*((3.14)*((diam/2)*(diam/2)*(diam/2)));	
}
	
}







