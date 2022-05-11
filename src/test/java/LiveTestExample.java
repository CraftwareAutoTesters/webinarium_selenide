import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LiveTestExample {

    public static void main(String[] args) {
        open("https://www.way2automation.com/way2auto_jquery/index.php");
        // Name
        $(By.xpath("//input[@name='name']")).setValue("Michal");
        // Phone
        $(By.xpath("//fieldset/input[@type='tel']")).setValue("1234567890");
        // Email
        $(By.name("email")).setValue("test@email.com");
        // Country
        $(By.xpath("//select[@name='country']")).click();
        // Select country
        $(By.xpath("//option[text()='Poland']")).click();
        // City
        $(By.xpath("//input[@name='city']")).setValue("Warsaw");
        //Username
        $(By.xpath("(//input[@name='username'])[2]")).setValue("Michal1");
        // Password
        $(By.xpath("(//input[@name='password'])[2]")).setValue("1234");
        // Submit
        $(By.xpath("(//input[@class='button'])[2]")).click();
        // Assertion
        $(By.xpath("//p[@id='alert']")).shouldBe(Condition.text("This is just a dummy form, you just clicked SUBMIT BUTTON"));
        // Implicit wait
        sleep(5000);
    }
}
