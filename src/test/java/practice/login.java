package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

    public static void main(String[] args) {
        String baseUrl = "https://www.google.com/";
        //mac driver path
        System.setProperty("webdriver.chrome.driver", "/Users/anil/Documents/swdtools/driver/chromedriver");

        //windows driver path
        //System.setProperty("webdriver.chrome.driver", "C:\\swdtools\\driver\\chromedriver.exe");

        //Declaration
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);  //hit url
        driver.manage().window().maximize();
        System.out.println("URL Entered");
    }

}
