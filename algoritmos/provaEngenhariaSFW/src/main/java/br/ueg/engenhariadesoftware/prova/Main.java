package br.ueg.engenhariadesoftware.prova;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {

    private static final String URL = "https://www.saucedemo.com/";

    public static void main(String[] args) {

        testaLogin();
        testaAddItemCart();
        testaRemoveItemCart();
        testaFinalizaCompra();

    }

    private static WebDriver getWebDriver() {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("headless");

        WebDriver driver = new ChromeDriver(chromeOptions);
        return driver;
    }

    private static void testaLogin() {
        final String nomeTeste = "Login";

        WebDriver driver = getWebDriver();
        makeLogin(driver);

        boolean testeOk = driver.getCurrentUrl().equals(URL + "inventory.html");

        printResultadoTeste(nomeTeste, testeOk);
        driver.close();
    }

    private static void makeLogin(WebDriver driver) {
        final String USUARIO = "standard_user";
        final String SENHA = "secret_sauce";
        driver.get(URL);

        driver.findElement(By.id("user-name")).sendKeys(USUARIO);
        driver.findElement(By.id("password")).sendKeys(SENHA);

        driver.findElement(By.id("login-button")).click();
    }

    private static void testaAddItemCart() {
        final String nomeTeste = "Adciona Item no carrinho";
        WebDriver driver = getWebDriver();
        makeLogin(driver);

        clickBackPack(driver);

        String textoCarrinho = driver.findElement(By.id("shopping_cart_container")).getText();
        boolean resultadoTeste = textoCarrinho.equals("1");

        printResultadoTeste(nomeTeste, resultadoTeste);
        driver.close();
    }

    private static void printResultadoTeste(String nomeTeste, boolean resultadoTeste) {
        String msgResultado = resultadoTeste ? "realizado com sucesso" : "realizado com erro";
        System.out.printf("\n- - Teste %s %s\n\n", nomeTeste, msgResultado);
    }

    private static void clickBackPack(WebDriver driver) {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    private static void testaRemoveItemCart() {
        WebDriver driver = getWebDriver();
        makeLogin(driver);

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
        boolean resultadoTeste = driver.findElement(By.className("cart_list")).findElements(By.className("cart_item"))
                .size() == 0;

        printResultadoTeste("Remove item do carrinho", resultadoTeste);
        driver.close();
    }

    private static void testaFinalizaCompra() {
        final String NAME = "Victor";
        final String SOBRENOME = "Pacheco";
        final String CEP = "1234567";

        WebDriver driver = getWebDriver();
        makeLogin(driver);

        clickBackPack(driver);
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.id("checkout")).click();

        driver.findElement(By.id("first-name")).sendKeys(NAME);
        driver.findElement(By.id("last-name")).sendKeys(SOBRENOME);
        driver.findElement(By.id("postal-code")).sendKeys(CEP);
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();

        boolean testeOk = driver.getCurrentUrl().equals(URL + "checkout-complete.html");

        printResultadoTeste("Finaliza Compra", testeOk);
        driver.close();
    }
}