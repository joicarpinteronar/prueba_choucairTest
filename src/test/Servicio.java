package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pages.PageBotonServicio;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Servicio {
	
   WebDriver driver;
	 
	
	@Test
	public void beforeClass() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jose\\eclipse-workspace\\prueba_choucair\\src\\driver\\chromedriver.exe");
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		driver = new ChromeDriver();
		
		System.out.println("hola");
		
		
		
	}
	
	@Test(priority = 1)
	public void servicio()throws Exception  {
		
		
		PageBotonServicio pbs = new PageBotonServicio(driver);
		pbs.configuraURLLoguin();
		pbs.botonServicio();
					
		
	}
	@Test(priority = 2)
	public void capacidades()throws Exception  {
		
		
		PageBotonServicio pbs = new PageBotonServicio(driver);
		pbs.botonCapacidades();
					
		
	}
	@Test(priority = 3)
	public void comohacemos()throws Exception  {
		
		
		PageBotonServicio pbs = new PageBotonServicio(driver);
		pbs.botoncomoHacemos();
					
		
	}
	@Test(priority = 4)
	public void portafolio()throws Exception  {
		
		
		PageBotonServicio pbs = new PageBotonServicio(driver);
		pbs.botonPortafolio();
					
		
	}
	
	@AfterMethod
	public void afterTest() throws IOException {
		//driver.quit();
		

	}

}
