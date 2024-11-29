import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.junit.UsePlaywright;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.*;

import org.junit.jupiter.api.*;

@UsePlaywright
public class TestExample {
    @Test
    void test() {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("http://lac-phpapp-s01.dc.lac.internal/php/leaseportal/login");
        page.getByPlaceholder("Benutzername").click();
        page.getByPlaceholder("Benutzername").fill("tester.haufe");
        page.getByPlaceholder("Benutzername").press("Tab");
        page.getByPlaceholder("Passwort").fill("test1234");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Einloggen")).click();
    }
}