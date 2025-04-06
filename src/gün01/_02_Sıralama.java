package gün01;

import net.bytebuddy.build.Plugin;
import org.testng.annotations.Test;

public class _02_Sıralama {
    @Test(priority = 1)//Sıraya sokuyor
    public void DriverIslemleriniYap(){
        System.out.println("Driver Başlat çalıştı");
    }

    @Test(priority = 2)
    public void WebsitesiniAc(){
        System.out.println("WebsitesiniAc çalıştı");
    }

    @Test(priority = 3)
    public void LoginTestiniYap(){
        System.out.println("LoginTestiniYap çalıştı");
    }

    @Test(priority = 4)
    public void DriverKapat(){
        System.out.println("Driver Kapat çalıştı");
    }

}

