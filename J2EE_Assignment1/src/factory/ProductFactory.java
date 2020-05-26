package factory;

import assignment1.Laptop;
import assignment1.Mobile;
import assignment1.Product;

public class ProductFactory 
{
	public Product getProduct(int producttype)
	{
		Product p1=null;
		switch(producttype)
		{
			case 1: p1=new Laptop();
					break;
			
			case 2: p1=new Mobile();
					break;
		}
		
		return p1;
	}
}
