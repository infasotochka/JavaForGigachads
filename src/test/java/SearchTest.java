import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class SearchTest {

    @Test
    void testTestich(){
        Configuration.holdBrowserOpen = true;
        open("https://web.telegram.org/a/");
        sleep(5000);
        $("button").shouldHave(text("Log in by phone Number")).click();
        sleep(4000);
        $("[id = sign-in-phone-number]").setValue("79144073365");
        $(".ripple-container").click();
    }
}
