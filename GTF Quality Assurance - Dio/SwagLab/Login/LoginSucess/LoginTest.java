import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
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
        loginButton.click();

        // Verifica se o usuário está logado
        WebElement loggedInMessage = driver.findElement(By.className("product_label"));
        if (loggedInMessage.isDisplayed()) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Falha ao realizar login.");
        }

        // Fecha o driver do Chrome
        driver.quit();
    }
}