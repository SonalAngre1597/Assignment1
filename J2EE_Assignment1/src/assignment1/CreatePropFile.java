package assignment1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class CreatePropFile
{
	public static void main(String[] args)
	{
		FileWriter fw = null;
		Properties prop = new Properties();
		
		try
		{
			fw = new FileWriter("C:\\Users\\KIRAN-PC\\Desktop\\SONAL_CORE JAVA\\J2EE\\assignment1.properties");
			prop.setProperty("employeeName", "Sachin");
			prop.setProperty("employeeAge","26");
			prop.store(fw, "External file");
			
			System.out.println("Properties file created successfully....");
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			if(fw!= null)
			{
				try 
				{
					fw.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}
