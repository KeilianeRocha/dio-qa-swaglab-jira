package SwagLab.Login.LoginFailure;

public class BugReport {

    private String title;
    private String description;
    private String stepsToReproduce;
    private String expectedResult;
    private String actualResult;
    private String screenshot;

    public BugReport(String title, String description, String stepsToReproduce, String expectedResult, String actualResult, String screenshot) {
        this.title = title;
        this.description = description;
        this.stepsToReproduce = stepsToReproduce;
        this.expectedResult = expectedResult;
        this.actualResult = actualResult;
        this.screenshot = screenshot;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStepsToReproduce() {
        return stepsToReproduce;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public String getActualResult() {
        return actualResult;
    }

    public String getScreenshot() {
        return screenshot;
    }
}

public class LoginBugExample {
    public static void main(String[] args) {
        // Inicialize o navegador e abra a página de login

        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        // Encontre os elementos da página de login
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("wrong_password");

        // Click no botão de login
        WebElement loginButton = driver.findElement(By.className("btn_action"));
        loginButton.click();

        // Check a mensagem de erro 
        WebElement errorMessage = driver.findElement(By.xpath("//h3[text()='Epic sadface: Username and password do not match any user in this service']"));

        if (errorMessage.isDisplayed()) {
          String screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
          BugReport report = new BugReport("Mensagem de erro não está sendo exibida ao digitar senha incorreta",
                    "Quando o usuário digita a senha incorreta, a mensagem de erro 'Epic sadface: Username and password do not match any user in this service",
                    "1. Vá para https://www.saucedemo.com/\n2. Digite 'standard_user' como nome de usuário\n3. Digite 'wrong_password' como senha\n4. Clique no botão de login",
                    "A mensagem de erro deveria ser exibida",
                    "A mensagem de erro não está sendo exibida",
                    screenshot);
      System.out.println("Título: " + report.getTitle());
      System.out.println("Descrição: " + report.getDescription());
      System.out.println("Passos para reproduzir: ")
}
