import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\i.salem.ext\\Desktop\\ibrahim\\My chrom driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
		
		
//            Date currenDate = new Date (); 
//		
//		    String TheActualDate = currenDate.toString().replace(":", "-");
//			TakesScreenshot scr =((TakesScreenshot)driver);
//			File SrcFile=scr.getScreenshotAs((OutputType.FILE));
//			File Dest =new File(".\\mypic/"+TheActualDate+".png");
//			FileUtils.copyFile(SrcFile,Dest);
		

		List <WebElement> thestudents= driver.findElements(By.tagName("option"));
		int theTotalNumberOfStudents=thestudents.size();
		
		System.out.print((theTotalNumberOfStudents+"this is original number"));
		
		int HowManyItems=1;
		
		System.out.print((HowManyItems+"this is original number of items want removed"));

		
		for(int i=0;i<HowManyItems;i++) {
			
		driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
			
		}
		
        List<WebElement> theStudentsAfterRemove=driver.findElements(By.tagName("option"));
		int ActualNumber=theStudentsAfterRemove.size();
		
		System.out.print(("this is the new actual number"+ActualNumber));
		
		int expectedITems=theTotalNumberOfStudents-HowManyItems;
		
		System.out.print((expectedITems+"this is the expecteditems"));
		


	}

}
