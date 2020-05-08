package support;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	public void escreverCampo(By by, String texto) {
		DriverFactory.getDriver().findElement(by).sendKeys(texto);
	}
	
	public String obterValorCampo(By by) {
		return DriverFactory.getDriver().findElement(by).getText();
	}
	
	public boolean obterListaCampo(By by) {
		List<WebElement> lista = DriverFactory.getDriver().findElements(by);
		return lista.size() > 0;
	}
	
	public void clicarBotao(By by){
		DriverFactory.getDriver().findElement(by).click();
	}
	
	public void clicarMenu(By by){
		DriverFactory.getDriver().findElement(by).click();
	}
	
	public void selecionarCombo(By by, String valor) {
		WebElement element = DriverFactory.getDriver().findElement(by);
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}
}
