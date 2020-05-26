package assignment1;

public class Laptop implements Product
{
	//double gstamt = 0.05;
	@Override
	public void productType() 
	{
		System.out.println("PRODUCT TYPE IS LAPOP");
	}

	@Override
	public void productCost(double price) 
	{
		double gstamt = price*0.05;
		System.out.println("gst amount is:" +gstamt);
		double tp= price + gstamt;
		System.out.println("Total price with gst: "+tp);
	}
	
}
