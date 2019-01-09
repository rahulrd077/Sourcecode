package feb.Fine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keywords {
static FirefoxDriver driver ;
static FileInputStream file;
static Properties prop;
public void openbrowser() throws Exception {
	
	System.setProperty("webdriver.gecko.driver","D:\\n\\Gecko\\geckodriver.exe");
	
	driver = new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	file = new FileInputStream ("D:\\Eclipse\\Workspace\\Fine\\objectrepository.properties");
	prop = new Properties();
	prop.load(file);

}

public void navigate (String data){
	
	driver.get(data);
	
}
public void input (String data, String objectName) {
	
	driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(data);
}
public void inputs (String data, String objectName) {
	
	driver.findElement(By.xpath(prop.getProperty(objectName))).sendKeys(data);
}

public void click( String objectName) {
	
	driver.findElement(By.xpath(prop.getProperty(objectName))).click();
}


}