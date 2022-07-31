import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.net.MalformedURLException;
import java.net.URL;

public class HomeworkLesson13RachelAizen {

    //1
    @BeforeClass
    public void Assignment1() throws MalformedURLException
    {DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("username", "oauth-246rcl-6f7d9");
    capabilities.setCapability("accessKey", "af7e1352-47ce-4fd2-8717-a86ecc6ea50d");
    capabilities.setCapability("browserName", "Chrome");
    capabilities.setCapability("platform", "Windows 10");
    capabilities.setCapability("version", "80");
    capabilities.setCapability("build", "Onboarding Sample App - Java-TestNG");
    capabilities.setCapability("name", "3-cross-browser");
    RemoteWebDriver driver = new RemoteWebDriver(new URL("https://oauth-246rcl-6f7d9:af7e1352-47ce-4fd2-8717-a86ecc6ea50d@ondemand.eu-central-1.saucelabs.com:443/wd/hub"), capabilities);
    driver.get("https://translate.google.com");
    driver.findElement(By.id("source")).sendKeys("Hello!");
    driver.quit();}

    //2
    @Test
    public void Assignment2() throws AWTException, InterruptedException
    {Robot robot = new Robot();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double width = screenSize.getWidth();
    double height = screenSize.getHeight();

    robot.mouseMove((int)width,0);
    Thread.sleep(5000);
    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);

    robot.mouseMove(0,(int)height);
    Thread.sleep(5000);
    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);}

    //3
    //Yes, mvn -Dtest=<CLASS NAME>#<TEST NAME> test
}
