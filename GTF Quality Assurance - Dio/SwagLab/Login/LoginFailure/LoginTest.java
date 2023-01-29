package SwagLab.Login.LoginFailure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {
    
        // Inicialize o navegador e abra a página de login
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        // Navegue para a página de login
        driver.get("https://www.saucedemo.com/");

        // Encontre os elementos da página de login
        // Envie as informações de login para os campos
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        // Clique no botão de login
        WebElement loginButton = driver.findElement(By.className("btn_action"));
        loginButton.click();

        // Verifique se o usuário foi redirecionado para a página inicial
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals("https://www.saucedemo.com/inventory.html")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }

        //Limpe o ambiente de teste
        driver.quit();
    }
}