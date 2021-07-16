package co.yedam.generic;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) {
		String path = PropertiesExample.class.getResource("../../db.properties").getPath();
		Properties prop = new Properties(); 
		try {
			prop.load(new FileReader(path));
			String id = prop.getProperty("id");
			String name = prop.getProperty("name");
			String pass = prop.getProperty("password");

			System.out.println(id + "," + name + "," + pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}