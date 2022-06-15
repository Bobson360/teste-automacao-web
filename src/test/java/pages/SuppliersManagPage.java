package pages;

import org.openqa.selenium.By;

import support.BasePage;

public class SuppliersManagPage extends BasePage {
	
	public void clicarBotaoAdd() {
		clicarBotao(By.xpath("//button[@type='submit' and @class='btn btn-success']"));
	}
	
	public String obterEmail(String email) {
		return obterValorCampo(By.xpath("//a[text()='"+ email +"']"));
	}
	
	public boolean existeEmail() {
		return obterListaCampo(By.xpath("//td[@class='xcrud-current xcrud-actions xcrud-fix']/../.."));
	}
	
	
}
