package canIwinn.winnium;

import java.net.MalformedURLException;

import java.net.URL;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.winium.DesktopOptions;
 
import org.openqa.selenium.winium.WiniumDriver;

public class App 
{
    public static void main( String[] args ) throws InterruptedException, MalformedURLException
    {
    	DesktopOptions option = new DesktopOptions();
    	 
    	option.setApplicationPath("C:\\Program Files\\ATOMI\\ActivePresenter\\ActivePresenter.exe");
    	// C:\\Windows\\System32\\calc.exe
    	//
    	
    	WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
    	 
    	Thread.sleep(5000);
    	 
//    	driver.findElement(By.name("Seven")).click();
    	driver.findElement(By.name("Blank Project")).click();
    	 
//    	driver.findElement(By.name("Plus")).click();
    	driver.findElement(By.name("Insert")).click();
    	 
//    	driver.findElement(By.name("Eight")).click();
    	 
//    	driver.findElement(By.name("Equals")).click();
    	 
    	Thread.sleep(5000);
    	 
//    	String output = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");
    	 
//    	System.out.println("Result after addition is: "+output);
    	 
    	//driver.close();
    }
}
