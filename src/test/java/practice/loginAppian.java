package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.dom.model.ShapeOutsideInfo;

public class loginAppian {

    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://gfeu-l01.appiancloud.com/suite/";
        //mac driver path
        System.setProperty("webdriver.chrome.driver", "/Users/anil/Documents/swdtools/driver/chromedriver");

        //windows driver path
        //System.setProperty("webdriver.chrome.driver", "C:\\swdtools\\driver\\chromedriver.exe");

        //Declaration
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);  //hit url
        driver.manage().window().maximize();
        System.out.println("URL Entered");
        String currentURL = driver.getCurrentUrl();
        String pageTitle = driver.getTitle();
        System.out.println("CurrentURL: "+currentURL);
        System.out.println("PageTitle: "+pageTitle);

        //Enter Username
   //     <input placeholder="Username" id="un" name="un" type="text" value="" size="34" autocomplete="off"
 //   autocorrect="off" autocapitalize="off" spellcheck="false">
        driver.findElement(By.id("un")).sendKeys("test.user3");
      //  driver.findElement(By.name("un")).sendKeys("test.user3"); //alternative

        // driver.findElement(By.linkText("Forgot your password?")).click();
      //  driver.findElement(By.partialLinkText("Forgot")).click();

        //Enter Password
        /*
        <input placeholder="Password" id="pw" name="pw" type="password" size="34"
        autocomplete="off" autocorrect="off" autocapitalize="off" spellcheck="false">
         */
        driver.findElement(By.name("pw")).sendKeys("Admin@123");
        Thread.sleep(10000);

        //Click on button
   /*     <input type="submit" class="btn primary" value="Sign In"
    onclick="return login_jsp.saveRemember &amp;&amp; login_jsp.saveRemember() || true;">*/
        //xpath syntax
        //  "//tagname[@attribute='value']"
        //  "//input[@type='submit']"

     driver.findElement(By.xpath("//input[@type='submit']")).click();

     //pratice
        /*
        <input type="text" class="sbq" id="yschsp" name="p" value=""
        autocomplete="off" autofocus="" tabindex="1" role="combobox" aria-autocomplete="both">
         */
        //xpath syntax
        //  "//tagname[@attribute='value']"
        //    "//input[@id='yschsp']"
     //   driver.findElement(By.xpath("//input[@id='yschsp']")).sendKeys();
     //   “//input[@id=‘login1’]”  "
     //   "//input[@id='login1']"
       // go to console , $x("//input[@id='login1']")        press enter

        /*
        Selenium Locators
        1] By.id()
        2] By.name()
        3]By.className()
        4]By.linkText()
        5]By.partialLinkText()
        6]By.cssSelector()

         */
        String errorMessage = driver.findElement(By.xpath("//div[@class='message']")).getText();
        System.out.println("Error msg displayed is: "+errorMessage);
        /* Selenium Actions
          1] .click      - click action-button, link click
          2] .sendKeys   - sending/writing text
          3] .getText()  - read
          4].clear()
         */


    }

}
