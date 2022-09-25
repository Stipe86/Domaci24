package domaci24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        /*
Napisati program koji na sajtu:
http://automationpractice.com
dodaje najmanje 3 proizvoda u cart, nastavlja do cart-a, izbacuje jedan proizvod, a drugom povecava kolicinu za 1.

Sajt je malo usporen i bagovit, pa stavljajte malo vece wait-ere

         */

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://automationpractice.com");
     //   driver.manage().window().maximize();

        WebElement addBtn = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span"));
        addBtn.click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));

        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")));

        WebElement continueBtn = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span"));
        continueBtn.click();

        WebElement addBtn2 = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[1]/span"));
        addBtn2.click();

        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")));

        WebElement xBtn = driver.findElement(By.className("cross"));

        xBtn.click();
//        continueBtn.click();

//        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(15));
//
//        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span")));
//
//
//        WebElement closeBtn = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span"));
//        closeBtn.click();

        WebElement addBtn3 = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[3]/div/div[2]/div[2]/a[1]/span"));
        addBtn3.click();

        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")));
        continueBtn.click();
   //     xBtn.click();

        WebElement cart = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
        cart.click();

//        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cart_quantity_down_6_31_0_0\"]")));
//
//        WebElement minus1 = driver.findElement(By.xpath("//*[@id=\"cart_quantity_down_6_31_0_0\"]"));
//        minus1.click();

//        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"product_6_31_0_0\"]/td[7]")));
        WebElement delete1 = driver.findElement(By.xpath("//*[@id=\"1_1_0_0\"]/i"));
        delete1.click();


       /* wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"cart_quantity_up_6_31_0_0\"]")));
        WebElement plus1 = driver.findElement(By.xpath("//*[@id=\"cart_quantity_up_6_31_0_0\"]"));*/


        WebElement plus1 = driver.findElement(By.xpath("//*[@id=\"cart_quantity_up_2_7_0_0\"]/span/i"));

        plus1.click();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.quit();


    }
}
