package SwagLab.Logout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutTest {
    public static void main(String[] args) {
        // Configura o caminho do driver do Chrome
        System.setProperty("webdriver.chrome.driver", "caminho/para/chromedriver");

        // Inicia o driver do Chrome
        WebDriver driver = new ChromeDriver();

        // Navega até a página de login
        driver.get("https://www.saucedemo.com/");

        // Preenche o campo de usuário
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

        // Preenche o campo de senha
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        // Clica no botão de login
        WebElement loginButton = driver.findElement(By.className("btn_action"));
       
    }
}
