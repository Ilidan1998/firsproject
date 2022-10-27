import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;


public class FirstProject {

    @Test
    public void test1 (){
     open("https://ee.ge/");

     $(byClassName("btn-register")).click();
     $(byClassName("registration-titles")).shouldBe(Condition.visible);
     $(byId("firstName")).setValue("davit");
     $(byId("lastName")).setValue("mamardashvili");
     $(byId("email")).setValue("mamardadavit@gmail.com");
     $(byId("password")).setValue("mamarda_1998");
     $(byId("confirmPassword")).setValue("mamarda_1998");

     $(byId("firstName")).shouldNot(Condition.empty);
     $(byId("lastName")).shouldNot(Condition.empty);
     $(byId("email")).shouldNot(Condition.empty);
     $(byId("singup")).shouldNot(Condition.enabled);
     sleep(5000);
    }
    @Test
public void test2(){
        open("https://ee.ge/");

        $(byClassName("btn-register")).click();
        $(byClassName("registration-titles")).shouldBe(Condition.visible);
        $(byId("singup")).shouldNot(Condition.enabled);

        $(byId("firstName")).click();
        $(byId("lastName")).click();
        $(byId("email")).click();
        $(byId("password")).click();
        $(byId("confirmPassword")).click();
        $(byId("password")).setValue("qwe");
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byId("confirmPassword")).setValue("mzm");
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("firstName")).click();
        $(byText("სახელი სავალდებულოა")).shouldBe(Condition.visible);
        $(byText("გვარი სავალდებულოა")).shouldBe(Condition.visible);
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);
        sleep(5000);
    }
    @Test
    public void test3(){
        open("https://ee.ge/");

        $(byClassName("cart-count")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byId("search_list")).setValue("კომპიუტერი").pressEnter();
        $(byClassName("add_to_cart"),0).click();
        $(byClassName("cart-count")).click();
        $(byClassName("Collapsible__trigger")).shouldBe(Condition.visible);
        $(byClassName("btn-lightgrey")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        sleep(5000);
    }
    @Test
    public void test4(){
        open("https://ee.ge/");

        $(byClassName("cart-count")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byText("შენახული ნივთები")).click();
        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);
        $(byId("search_list")).setValue("კომპიუტერი").pressEnter();
        $(byClassName("add_to_cart"),0).click();
        $(byClassName("cart-count")).click();
        $(byClassName("btn-darkred")).click();
        $(byText("შენახული ნივთები")).click();
        $(byClassName("d-xs-none")).shouldBe(Condition.visible);
        $(byClassName("cart-count")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byText("შენახული ნივთები")).click();
        $(byClassName("btn_round")).click();
        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);
        sleep(5000);
    }

@Test
    public void test5(){
    open("https://www.youtube.com/");
    $(byName("search_query")).setValue("ტესტირების ავტომატიზაცია").pressEnter();
    sleep(10000);

}
    }

