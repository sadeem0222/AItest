import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.RectangleSize;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisualTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        Eyes eyes = new Eyes();
        eyes.setApiKey("123538e"); // Replace with your actual Applitools API key


        try {
            eyes.open(driver, "Sadeem Visual Project", "Homepage Visual Test",
                    new RectangleSize(1200, 700));

            driver.get("https://demo.applitools.com");

            eyes.checkWindow("Homepage");

            eyes.close();
        } finally {
            eyes.abortIfNotClosed();
            driver.quit();
        }
    }
}
