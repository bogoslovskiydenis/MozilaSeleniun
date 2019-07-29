import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        //connection and work with the FirefoxDriver
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\bogos\\IdeaProjects\\Mozilaseleniun\\driver\\geckodriver.exe"); // путь

        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // TimeWait

        driver.manage().window().maximize(); // maximize browser
        driver.manage().window().setSize(new Dimension(900, 500)); // browser size 900/500

        driver.get("https://rozetka.com.ua/"); //dl first url
        driver.navigate().to("https://github.com/"); // dl two url
        driver.navigate().back(); // back to rozetka
        driver.navigate().forward(); // back to github
        driver.navigate().refresh(); // refresh page
        System.out.println(driver.getCurrentUrl()); //get URL
        System.out.println(driver.getTitle());  //getTitle

        driver.quit();
    }
}
