package gün03;
/*
  1- ContactUs a tıklayınız
  2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
  3- Submit ettikten sonra url deki success yazısını doğrulayınız.
 */

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_ContactUs extends BaseDriver {
    @Test
    public void contactUs() {
        WebElement contactUsBtn=driver.findElement(By.linkText("Contact Us"));
        contactUsBtn.click();

        WebElement enquiryArea=driver.findElement(By.id("input-enquiry"));
        enquiryArea.sendKeys("Merhaba testing dünyası");

        WebElement submitBtn=driver.findElement(By.cssSelector("[type='submit']"));
        submitBtn.click();

        System.out.println("önce url="+driver.getCurrentUrl());
        wait.until(ExpectedConditions.urlContains("success")); // wait kullanmasını biliyoruz
        System.out.println("sonra url="+driver.getCurrentUrl());
           //driver.getCurrentUrl().contains("success"));URL DE success var mı
        Assert.assertTrue(driver.getCurrentUrl().contains("success"));

    }
}
