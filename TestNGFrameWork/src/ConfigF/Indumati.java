package ConfigF;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class Indumati {

	@Test

	public void FileInput() throws Exception {

		File src = new File(
				"/Users/reenupanwar/Documents/SeleniumPrograms/TestNGFrameWork/Configuration/Configure.property");

		FileInputStream fis = new FileInputStream(src);

		Properties pro = new Properties();

		pro.load(fis);

		String ChromePath = pro.getProperty("ChromeDriver");

		System.out.println("Hey the chromepath is " + ChromePath);
	}

}
