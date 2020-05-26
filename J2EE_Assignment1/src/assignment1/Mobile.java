package assignment1;

public class Mobile implements Product
{
	
	@Override
	public void productType() 
	{
		System.out.println("PRODUCT TYPE IS MOBILE");
	}

	@Override
	public void productCost(double price) 
	{
		double gstamt = price*0.10;
		System.out.println("gst amount is:" +gstamt);
		double tp= price + gstamt;
		System.out.println("Total price with gst: "+tp);
	}
	
}
