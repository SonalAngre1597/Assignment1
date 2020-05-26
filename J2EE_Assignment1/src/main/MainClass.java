package main;

import java.util.Scanner;
import assignment1.Product;
import factory.ProductFactory;

public class MainClass
{
		@SuppressWarnings("resource")
		public static void main(String[] args)
		{
			Scanner sc1=new Scanner(System.in);
			System.out.println("SELECT PRODUCT");
			System.out.println("1: LAPTOP");
			System.out.println("2: MOBILE");
			
			int choice=sc1.nextInt();
			
			ProductFactory p1=new ProductFactory();
			Product v1=p1.getProduct(choice);
			
			System.out.println("ENTER PRODUCT PRICE");
			double price=sc1.nextDouble();
			
			v1.productType();
			v1.productCost(price);
		}
}
