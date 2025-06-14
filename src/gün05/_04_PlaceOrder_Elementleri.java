package gün05;
// Bu sayfadaki bütün elemanların driverlar bağlantısı gerekiyor
// bunun için aşağıdaki consructor eklendi ve için PageFatory ile
// driver üzerinden bu (this) sayfadaki bütün elemnalar ilşkilendirildi.
// Böylece Sayfada dan nesne türetildiği zaman değil, kullanıldığı
// anda elemanların bulunması aktif oluyor.Bu yöntemle bütün sayfalarda
// aynı isimde elemanlar var ise buradaki tanımlama hepsi için geçerli hale
// gelmiş oluyor. buna yapıya Page Object Model (POM) adı veriliyor.
// Faydaları: kod düzeni daha rahat, aynı locatorlar için tek bir tanımlama, kullanıldığı anda bulma, ve agile için
// tam kolay çalışma yani developer başlamadan veya bitirmesini beklemeden sen kodları yazabilir, ve kolaylıkla
// değişiklik yapabilirsin.

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _04_PlaceOrder_Elementleri {
    //Bas driver ile bunların hepsini başlat (generate,constructor ile
    public _04_PlaceOrder_Elementleri() {
        PageFactory.initElements(BaseDriver.driver, this);
    }//BAS DRİVERDAKİ DRİVERI BURAYA AL.

    @FindBy(name = "search")
    public WebElement searchBox;

    @FindBy(xpath = "//span[text()='Add to Cart']")
    public WebElement addToChart;

    @FindBy(linkText = "Shopping Cart")
    public WebElement shoppingChart;

    @FindBy(linkText = "Checkout")
    public WebElement checkOut;

    @FindBy(id = "button-payment-address")
    public WebElement continue1;

    @FindBy(id = "button-shipping-address")
    public WebElement continue2;

    @FindBy(id = "button-shipping-method")
    public WebElement continue3;

    @FindBy(name = "agree")
    public WebElement agree;

    @FindBy(id = "button-payment-method")
    public WebElement continue4;

    @FindBy(id = "button-confirm")
    public WebElement confirm;

    @FindBy( xpath= "//div[@id='content']/h1")
    public WebElement ekranYazi;




}

