package Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Day2 {

	public static void main(String[] args) throws InterruptedException {
		//TODO Auto-generated method stub
     ChromeDriver driver=new ChromeDriver();
     //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     //WebDriverWait my= new WebDriverWait(driver,Duration.ofSeconds(10));
    //driver.get("https://www.youtube.com/");
     //driver.get("https://ui.vision/demo/webtest/frames/");
     //driver.get("http://127.0.0.1:5500/gh.html");
     //driver.get("https://testautomationpractice.blogspot.com/");
     //driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
    // driver.get("https://text-compare.com/");
    // driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
     //driver.get("https://demo.opencart.com/");
     //driver.get("https://www.youtube.com/watch?v=wUXg7e-PBaI");
     //driver.get("https://www.flipkart.com/");
     //driver.get("https://www.w3schools.com/tags/ref_canvas.asp");
     //Thread.sleep(5000);
     //driver.findElement(By.name("q")).sendKeys("max");
     //boolean b=driver.findElement(By.linkText("Become a Seller")).isDisplayed();
     //System.out.println(b);
    //List<WebElement> g=driver.findElements(By.className("_2msBFL"));
    //System.out.println("size"+g.size());
    //driver.findElement(By.cssSelector("input.Pke_EE[title='Search for Products, Brands and More']")).sendKeys("max");
    // System.out.println(f);
     //driver.findElement(By.name("search_query")).sendKeys("bgmi");
     //WebElement button = driver.findElement(By.id("search-icon-legacy"));
     //button.click();
    // driver.findElement(By.xpath("//*[@id='container']")).click();
     //String d=driver.getTitle();
     //String d=driver.getCurrentUrl();
     //String d=driver.getPageSource();
     //String d=driver.getWindowHandle();
     //driver.findElement(By.linkText("Try it Yourself »")).click();
     
    //Set<String> d1=driver.getWindowHandles();
     //System.out.println(d1);
     //WebElement x=my.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"leftmenuinnerinner\"]/a[3]")));
     //WebElement x=my.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"leftmenuinnerinner\"]/a[11]")));
     //boolean t=x.isDisplayed();
     //System.out.println(t);x
     //x.click();
    //driver.navigate().to("https://www.instagram.com/accounts/login/?hl=en");
     //driver.navigate().to("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=17312381180771355764&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9303805&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
     //driver.navigate().back();
     //driver.navigate().forward();
     //driver.navigate().refresh();
    //List<String> windows=new ArrayList(d1);
    //String p=windows.get(0);
    //String c=windows.get(1);
    //driver.switchTo().window(c);
     //driver.switchTo().newWindow(WindowType.TAB); on switching to new window and switching to new tab automatically
    //System.out.println(driver.getTitle());
     //driver.close();
    /* driver.findElement(By.xpath("//html/body/form/input[1]")).click();
     driver.findElement(By.xpath("//html/body/form/input[3]")).click();
     driver.findElement(By.xpath("/html/body/form/input[4]")).click();*/
    // List<WebElement> t=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	/*for(int i=4;i<t.size();i++)
     {
    	 t.get(i).click();
     }  //selecting checkboxes  
	Thread.sleep(2000);
      for(WebElement checkbox:t)
{
	checkbox.click();
}*/
     //driver.findElement(By.xpath("/html/body/button")).click();
     //Alert a=driver.switchTo().alert();
     //driver.switchTo().alert().accept(); //to close alert using ok button
     //driver.switchTo().alert().dissmis(); //to close alert using cancel button
     //System.out.println(a.getText());
    // a.accept();     
     //WebElement f2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));//firts swithcing to frame 
     //driver.switchTo().frame(f2);
     //Thread.sleep(5000);
    // driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("hello");//then finding webelements in that frame
     //driver.switchTo().defaultContent();//again switching main frame to switch to another frame
     /*WebElement f=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
     driver.switchTo().frame(f);
       driver.switchTo().frame(0);
     driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();//inner frames*/
     /* WebElement testDropDown = driver.findElement(By.xpath("//select[@id='country']")); 
     Select dropdown = new Select(testDropDown);
     //dropdown.selectByIndex(5);
     List<WebElement> p=dropdown.getOptions();
     System.out.println(p.size());
     for(int i=0;i<p.size();i++)
     {
    	 System.out.println(p.get(i).getText());
     }*/ //listing dropdowns
     //List<WebElement> c=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
      /*int c=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
      int d=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
     //System.out.println(c.size());
     //String b=driver.findElement(By.xpath("//table[@name='BookTable']//tbody[1]//tr[2]//td[3]")).getText();
     //System.out.println(b);
     // System.out.println("bk"+"\t"+"st"+"\t"+"bj"+"\t"+"hj"+" ");
     for(int i=2;i<=c;i++)
     {
    	 for(int j=1;j<=d;j++)
    	 {
    		 String b=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
    		 System.out.print(b+"\t");
    	 }
    	 System.out.println();
     } 
     */ //this usedto print the elemnts of the table
     //WebElement z=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
     //WebElement v=driver.findElement(By.xpath("//a[normalize-space()='PC (0)']"));
     //Actions s= new Actions(driver);
     //s.moveToElement(z).moveToElement(v).click().build().perform();
     
    // s.moveToElement(z).moveToElement(v).perform(); //fuction for mouse hover
     //s.contextClick(buttonname).perform(); //for rightclick function
     //driver.findElement(By.xpath("//button[@title='Play (k)']")).click();
     //driver.findElement(By.xpath("//button[@title='Full screen (f)']")).click();
    Actions s= new Actions(driver);
     //driver.findElement(By.xpath("//button[@title='Exit full screen (f)']")).click();
     //driver.findElement(By.xpath("//video[@class='video-stream html5-main-video']")).click();
     //WebElement q=driver.findElement(By.xpath("//video[@class='video-stream html5-main-video']"));
     //s.doubleClick(q).perform();
     //s.contextClick(q).perform(); 
     //WebElement y=driver.findElement(By.xpath("//div[@id='draggable']")); //darg and drop
     //WebElement q=driver.findElement(By.xpath("//div[@id='droppable']"));
     //s.dragAndDrop(y,q).perform();
    //WebElement p=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]")); 
    //s.dragAndDropBy(p, 100, 173).perform();
   //System.out.println(p.getLocation());
   //Thread.sleep(4000);
   //s.dragAndDropBy(p, -90, 173).perform();
   //System.out.println(p.getLocation());
   /*driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Virat");
   s.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
   s.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
   driver.findElement(By.xpath("//textarea[@id='inputText2']")).sendKeys("");
   s.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();*/
  /*JavascriptExecutor j=(JavascriptExecutor)driver;
  j.executeScript("window.scrollBy(0,10)", ""); //javascript executor uses to scrolldownpage as scrollbar is not a webelement
  System.out.println(j.executeScript("return window.Yoffset;"));*/
    //driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\GOVARADHAN\\OneDrive\\Documents\\abstract.pdf");
    
    
    
	}
	
}
