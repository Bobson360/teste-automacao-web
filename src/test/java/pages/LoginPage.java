package pages;

import org.openqa.selenium.By;

import support.BasePage;
import support.DriverFactory;

public class LoginPage extends BasePage {
	
	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("https://phptravels.net/admin/");
	}
	
	public void setEmail(String email) {
		escreverCampo(By.name("email"), "admin@phptravels.com");
	}
	
	public void setPassword(String password) {
		escreverCampo(By.name("password"), "demoadmin");
	}
	
	public void clicarBotaoLogin() {
		clicarBotao(By.xpath("//span[text()='Login']"));
	}
	
	public void logar() {
		setEmail("admin@phptravels.com");
		setPassword("demoadmin");
		clicarBotaoLogin();
	}
}
