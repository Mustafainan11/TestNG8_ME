package gün02;

import Utility.BaseDriver;
import Utility.WebTool;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _03_SubscribeNewsLetter extends BaseDriver {
      /*
    Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe işlemini abone olunuz(YES)  , işlemin başarılı olduğunu kontrol ediniz.
     */

    By link = By.linkText("Newsletter");
    By subYes = By.xpath("//input[@type='radio' and @value='1']");
    By cntBtn = By.xpath("//*[@value='Continue']");
    By subNo = By.xpath("//input[@type='radio' and @value='0']");

    @Test(priority = 1)
    public void SubscribeFunctionYes() {
        WebElement newsLetterLink = driver.findElement(link);
        newsLetterLink.click();

        WebElement subscribeYes = driver.findElement(subYes);
        subscribeYes.click();

        WebElement continueButton = driver.findElement(cntBtn);
        continueButton.click();

        WebTool.SuccessMessageValidation();
    }
   // 3- Ayrı bir test ile Newsletter  Subscribe işlemini abonelikten çıkınız(NO)

    @Test(priority = 2)
    public void SubscribeFunctionNo() {
        WebElement newsLetterLink = driver.findElement(link);
        newsLetterLink.click();

        WebElement subscribeNo = driver.findElement(subNo);
        subscribeNo.click();

        WebElement continueButton = driver.findElement(cntBtn);
        continueButton.click();

        WebTool.SuccessMessageValidation();
    }
    @Test(priority = 3)
    public void SubscribeFunctionForBoth(){
        WebElement newsLetterLink=driver.findElement(link);
        newsLetterLink.click();

        WebElement subscribeYes=driver.findElement(subYes);
        WebElement subscribeNo=driver.findElement(subNo);

        if (subscribeYes.isSelected())
            subscribeNo.click();
        else
            subscribeYes.click();

        WebElement continueButton=driver.findElement(cntBtn);
        continueButton.click();

        WebTool.SuccessMessageValidation();
    }


}
