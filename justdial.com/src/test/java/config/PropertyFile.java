package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyFile 
{
	public static void main(String[] args) throws Exception

	{
		
		getProperties();

	}
	public static void getProperties() throws IOException 
	{
		try 
		{


			Properties prop = new Properties();
			InputStream input = new FileInputStream("C:\\Users\\DELL USER\\eclipse-workspace\\moneypurse\\src\\main\\java\\config\\config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println( browser);

		}

		catch(Exception exp )
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}

	}
	
	public static void setProperties() throws IOException 
	{
		try {


			Properties prop = new Properties();
			OutputStream output = new FileOutputStream("C:\\Users\\DELL USER\\eclipse-workspace\\demo\\src\\test\\java\\config\\config.properties");
			prop.setProperty("browser", "chrome");
			prop.store(output, null);


		}catch(Exception exp )
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}

	}

}