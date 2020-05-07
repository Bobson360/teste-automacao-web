package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import support.BasePage;
import support.DriverFactory;

public class AddSupplierPage extends BasePage {
	
	public void setPrimeiroNome(String nome) {
		escreverCampo(By.name("fname"), nome);
	}
	
	public void setUltimoNome(String nome) {
		escreverCampo(By.name("lname"), nome);
	}
	
	public void setEmail(String email) {
		escreverCampo(By.name("email"), email);
	}
	
	public void setPassword(String password) {
		escreverCampo(By.name("password"), password);
	}
	
	public void setCelular(String celular) {
		escreverCampo(By.name("mobile"), celular);
	}
	
	public void setPais(String pais) {
		clicarBotao(By.id("s2id_autogen1"));
		DriverFactory.getDriver().findElement(By.xpath("//div[@class='select2-search']/input")).sendKeys(pais, Keys.ENTER);
	}
	
	public void setEndereco(String endereco) {
		escreverCampo(By.name("address1"), endereco);
	}
	
	public void setComplemento(String complemento) {
		escreverCampo(By.name("address2"), complemento);
	}
	
	public void setFornecedor(String fornecedor) {
		selecionarCombo(By.name("applyfor"), fornecedor);
	}
	
	public void setItem(String item) {
		escreverCampo(By.name("itemname"), item);
	}
	
	public void clicarBotaoSubmit() {
		clicarBotao(By.xpath("//button[text()='Submit']"));
	}
}
