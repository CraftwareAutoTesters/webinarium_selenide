import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class HomeWork {
    public static void main(String[] args) {
        /*
        * Praca domowa
        * 1. Otwórz stronę logowania Facebooka -> https://www.facebook.com/login"
        * 2. W polu "Adres e-mail lub numer telefonu" wpisz fikcyjny adres email(pamiętaj o tym, aby email miał poprawny format!!!)
        * 3. W polu "Hasło" wpisz fikcyjne hasło
        * 4. Kliknij przycisk "Zaloguj się"
        * 5. Sprawdź assercję dla tekstu "Znajdź swoje konto i zaloguj się."
        * */

        // SOLUTION
        open("https://www.facebook.com/login");
        // Accept cookies
        $(By.xpath("//button[@title='Zezwól tylko na niezbędne pliki cookie']")).click();
        // Email
        $(By.xpath("//input[@placeholder='Adres e-mail lub numer telefonu']")).setValue("email@test.com");
        // Password
        $(By.xpath("//input[@placeholder='Hasło']")).setValue("1234");
        // Login button
        $(By.xpath("//button[@name='login']")).click();
        // Assertion
        $(By.xpath("//a[text()='Znajdź swoje konto i zaloguj się.']"))
                .shouldBe(Condition.text("Znajdź swoje konto i zaloguj się."));
        sleep(5000);
    }
}
