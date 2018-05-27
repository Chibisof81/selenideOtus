package ru.artlebedev.test;

import org.testng.annotations.Test;
import ru.artlebedev.BaseTest;
import ru.artlebedev.pages.MainPage;
import ru.artlebedev.pages.MatrixPage;
import ru.artlebedev.pages.ToolsPage;

public class SelenideTestWithPageObject extends BaseTest {

    @Test
    public void test(){
       MainPage mainPage = new MainPage();
       mainPage.openMainPage();
       ToolsPage toolsPage = mainPage.clickOnTools();
       MatrixPage matrixPage = toolsPage.clickIdeaMatrix();
       matrixPage.inputSearch("цветы");
       matrixPage.searchButton();
       matrixPage.assertInput("цветы");
    }

}
