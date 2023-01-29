package SwagLab.Login.LoginFailure;

@Test
public void testLoginWithWrongPassword() {
    // Acessar a página de login
    driver.get("https://www.saucedemo.com/");
    
    // Preencher o campo de usuário com 'standard_user'
    WebElement userField = driver.findElement(By.id("user-name"));
    userField.sendKeys("standard_user");
    
    // Preencher o campo de senha com 'wrong_password'
    WebElement passField = driver.findElement(By.id("password"));
    passField.sendKeys("wrong_password");
    
    // Clicar no botão de login
    WebElement loginBtn = driver.findElement(By.cssSelector("input[type='submit']"));
    loginBtn.click();
    
    // Verificar se a mensagem de erro é exibida
    WebElement errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']"));
    assertTrue(errorMessage.isDisplayed());
    assertEquals("Epic sadface: Username and password do not match any user in this service", errorMessage.getText());
}
