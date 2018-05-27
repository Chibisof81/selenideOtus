package ru.artlebedev;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    @BeforeTest
    public void beforeTest(){
        Configuration.browser = "chrome";
        WebDriverManager.chromedriver().setup();
    }

}
