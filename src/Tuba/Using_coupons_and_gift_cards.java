package Tuba;

import Utlity.BaseDriver;
import Utlity.BillingAdress;
import Utlity.MyFunc;
import jdk.nashorn.internal.ir.WhileNode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Using_coupons_and_gift_cards extends BaseDriver {

    @Test
    public void urun(){
        driver.get("https://demowebshop.tricentis.com/2");

        WebElement urunKategorie=driver.findElement(By.xpath("//*[@href='/computers']"));
        urunKategorie.click();
        MyFunc.Bekle(1);

        WebElement urun=driver.findElement(By.xpath("//*[@class='sub-category-item']"));
        urun.click();
        MyFunc.Bekle(1);

        WebElement secim=driver.findElement(By.xpath("//*[@class='product-grid']"));
        secim.click();
        MyFunc.Bekle(1);

        WebElement Sepet=driver.findElement(By.xpath("//*[@class='cart-label']"));
        Sepet.click();
        MyFunc.Bekle(1);

        WebElement giftCard=driver.findElement(By.xpath("//*[@class='button-2 apply-gift-card-coupon-code-button']"));
        giftCard.click();
        MyFunc.Bekle(1);

        WebElement applyCoupon=driver.findElement(By.xpath("//*[@class='button-2 apply-discount-coupon-code-button']"));
        applyCoupon.click();
        MyFunc.Bekle(1);

        WebElement urunOnayla = driver.findElement(By.xpath("//*[@name='removefromcart']"));
        urunOnayla.click();
        MyFunc.Bekle(1);

        WebElement Agree = driver.findElement(By.xpath("//*[@id='termsofservice']"));
        Agree.click();
        MyFunc.Bekle(1);

        WebElement checkoutButton = driver.findElement(By.xpath("//*[@class='button-1 checkout-button']"));
        checkoutButton.click();
        MyFunc.Bekle(1);

        WebElement singInGuest = driver.findElement(By.xpath("//*[@class='button-1 checkout-button']"));
        singInGuest.click();

        WebElement odemeSartlariSec= driver.findElement(By.xpath("//*[@id='checkout-step-payment-method']"));
        odemeSartlariSec.click();

        new BillingAdress();

        WebElement continue1= driver.findElement(By.xpath("//*[@class='button-1 payment-method-next-step-button']"));
        continue1.click();

        WebElement InStorePickup= driver.findElement(By.xpath("//*[@id='PickUpInStore']"));
        InStorePickup.click();

        WebElement continue2= driver.findElement(By.xpath("//*[@onclick='Shipping.save()']"));
        continue2.click();

        WebElement PaymentMethod= driver.findElement(By.xpath("//*[@class='section payment-method']"));
        PaymentMethod.click();

        WebElement continue3= driver.findElement(By.xpath("//*[@onclick='PaymentMethod.save()']"));
        continue3.click();

        WebElement SelectCreditCard = driver.findElement(By.xpath("//*[@id='CreditCardType']"));
        SelectCreditCard.sendKeys("your credit card");

        WebElement CardholderName = driver.findElement(By.xpath("//*[@id='CardholderName']"));
        CardholderName.sendKeys("Name");

        WebElement CardNumber= driver.findElement(By.xpath("//*[@id='CardNumber']"));
        CardNumber.sendKeys("Card Number");

        WebElement ExpirationDate= driver.findElement(By.xpath("//*[@id='ExpireMonth']"));
        WebElement Year= driver.findElement(By.xpath("//*[@id='ExpireYear']"));
        ExpirationDate.sendKeys("Date");
        Year.sendKeys("Date");

        WebElement CardCode= driver.findElement(By.xpath("//*[@id='CardCode']"));
        CardCode.sendKeys("Card Code");

        WebElement continue4= driver.findElement(By.xpath("//*[@onclick='PaymentInfo.save()']"));
        continue4.click();


        WebElement confirmOrderButton = driver.findElement(By.id("//*[@onclick='ConfirmOrder.save()']"));
        confirmOrderButton.click();

        WebElement successMessage = driver.findElement(By.xpath(" "));
        String messageText = successMessage.getText();

        if (messageText.contains("Your order has been successfully processed!")) {
            System.out.println("Sipariş başarıyla tamamlandı!");
        } else {
            System.out.println("Sipariş tamamlanırken bir hata oluştu.");
        }


    }

}
