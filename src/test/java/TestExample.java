import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;


public class TestExample {

    public static void main(String[] args) {

        open("https://craftware.pl/"); //Otwieramy stronę Craftware

        $(By.id("cookie_action_close_header")).click(); //zamykamy cookies
        $(By.xpath("//span[text()='Staffing']")).click(); //klikamy na "Staffing"
        $(By.xpath("//span[text()='Tester automatyzujący']")).click(); //klikamy na "tester autmatyzujący"
        $(By.xpath("//div[@class='pageHeader__main']//h1")).shouldHave(Condition.text("Tester automatyzujący")); //sprawdzamy czy tytuł na stronie zgadza (tekst)




    }
}
