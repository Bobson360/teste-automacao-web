package tests;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

import pages.AddSupplierPage;
import pages.MenuPage;
import pages.SuppliersManagPage;
import support.BaseTest;

public class FormularioTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private SuppliersManagPage suppliers = new SuppliersManagPage();
	private AddSupplierPage addSupplier = new AddSupplierPage();
	
	public Random rand = new Random();
	int aleatorio = rand.nextInt(100);
	
	@Test
	public void validarEmail() {
		menu.clicarAccounts();
		menu.clicarSuppliers();
		
		suppliers.clicarBotaoAdd();
		
		addSupplier.setPrimeiroNome("Nilton");
		addSupplier.setUltimoNome("Correia");
		addSupplier.setEmail("nilton" +aleatorio+ "@teste.com");
		addSupplier.setPassword("niltonteste");
		addSupplier.setCelular("11-99999-9999");
		addSupplier.setPais("Brazil");
		addSupplier.setEndereco("Rua: Cândido Nobre, 999");
		addSupplier.setComplemento("Apt 102, Bloco 5");
		addSupplier.setFornecedor("Cars");
		addSupplier.setItem("Teto Solar");
		addSupplier.clicarBotaoSubmit();
		
		assertEquals("nilton" +aleatorio+ "@teste.com", suppliers.obterEmail("nilton" +aleatorio+ "@teste.com"));
	}
}
