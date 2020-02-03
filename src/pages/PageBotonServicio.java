package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageBotonServicio {
	
	private WebDriver driver;
	private By servicioButton;
	private By capacidadesButton;
	private By comoHacemosButton;
	private By portafolioSolucionesButton;
	
	
	public PageBotonServicio(WebDriver Driver) {
		this.driver=Driver;
		servicioButton= By.xpath("//*[@id=\"menu-item-6142\"]/a");
		capacidadesButton = By.xpath("//*[@id=\"main\"]/div/div/div/div/section[3]/div/div/div[1]/div/div/div/div/div/figure/a/img");
		comoHacemosButton = By.xpath("//*[@id=\"main\"]/div/div/div/div/section[3]/div/div/div[2]/div/div/div/div/div");
		portafolioSolucionesButton = By.xpath("//*[@id=\"main\"]/div/div/div/div/section[3]/div/div/div[3]/div/div/div/div/div");
			
		
	}
	
	public void configuraURLLoguin() {
				
		driver.get("https://www.choucairtesting.com/");
		System.out.println(driver.getTitle());
	}
	
	public void botonServicio() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(servicioButton).click();
		driver.findElement(capacidadesButton).click();
	}
	public void botonCapacidades() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(capacidadesButton).click();
	}
	public void botoncomoHacemos() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(comoHacemosButton).click();
		
	}
	public void botonPortafolio() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(portafolioSolucionesButton).click();
		
	}

}
