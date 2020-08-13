package stepDefinition_AmazonClash;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AmazonClash_Property_Load {
	
	public static void AmazonClash_prop() throws IOException {
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\application.properties");
		obj.load(objfile);
	
	String  login = obj.getProperty("login");
}
}
