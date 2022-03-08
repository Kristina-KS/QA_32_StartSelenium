import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class StartPhoneBook {
        WebDriver wd;



    @Test
    public void startPhoneBook() {
        wd = new ChromeDriver();
        ///Users/kristina/IdeaProjects/NewProject/chromedriver
       // System.setProperty("webdriver.chrome.driver","/Users/kristina/IdeaProjects/NewProject/chromedriver");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.manage().window().maximize();
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        wd.findElement(By.tagName("a"));
        WebElement login = elements.get(2);
        login.click();
        WebElement element = wd.findElement(By.tagName("body"));
        WebElement element1 = wd.findElement(By.tagName("div"));
        WebElement element2 = wd.findElement(By.tagName("input"));
        WebElement element3 = wd.findElement(By.tagName("h1"));
        WebElement element4 = wd.findElement(By.tagName("a"));
        WebElement element5 = wd.findElement(By.tagName("button"));
        WebElement element6 = wd.findElement(By.tagName("br"));
        WebElement element7 = wd.findElement(By.id("root"));
        WebElement element8 = wd.findElement(By.className("container"));
        WebElement element9 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement element10 = wd.findElement(By.className("active"));
        WebElement element11 = wd.findElement(By.className("login_login__3EHKB"));
        //wd.quit();
    }
    @Test
    public void cssLocatorsTest() {
        wd = new ChromeDriver();
        ///Users/kristina/IdeaProjects/NewProject/chromedriver
        //System.setProperty("webdriver.chrome.driver","/Users/kristina/Documents/GitHub/QA_32_StartSelenium/Project/chromedriver");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.manage().window().maximize();
        wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.xpath("//*[@class = 'login_login__3EHKB']"));
        wd.findElement(By.xpath("//*[@id = 'root']"));
        wd.findElement(By.cssSelector("[placeholder]"));
        wd.findElement(By.xpath("//*[@placeholder]"));
        wd.findElement(By.xpath("//*[@placeholder = 'Password']"));
        wd.findElement(By.xpath("//*[contains(@placeholder, 'Password')]"));






    }
}