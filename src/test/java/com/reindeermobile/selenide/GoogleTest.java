package com.reindeermobile.selenide;

import com.codeborne.selenide.testng.ScreenShooter;
import com.codeborne.selenide.testng.TextReport;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Listeners({ScreenShooter.class, TextReport.class})
public class GoogleTest {
    @Test
    public void failedTest() {
        open("https://www.google.com/");
        $(By.name("notvalidname")).click();
    }
}
