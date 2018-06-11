package ru.artlebedev;

import atomation.listner.EventListner;
import atomation.listner.TestListner;
import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import static com.codeborne.selenide.WebDriverRunner.addListener;

@Listeners(TestListner.class)

public class BaseTest {
    @BeforeClass(alwaysRun = true)
    public void beforeTest() {
        addListener(new EventListner());
        Configuration.browser = "chrome";
        WebDriverManager.chromedriver().setup();
    }

}
