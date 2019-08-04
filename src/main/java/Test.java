import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    WebDriver driver;
@org.testng.annotations.Test
    public void test11(){
    System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\IdeaProjects\\Selenium\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://www.google.com");
    driver.close();
    }
}
