package steps;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Entao;

public class TicketStep {
	private WebDriver driver;
	String CSV_FILE = "C:\\Users\\hp\\eclipse-workspace\\DatumTeste\\src\\test\\java\\steps\\SampleAppData.xlsx";
	String FOLDER = "C:\\Users\\hp\\eclipse-workspace\\DatumTeste\\src\\test\\java\\print";
	
	public void takeScreenShot() throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String fileName = UUID.randomUUID().toString();
        File targetFile = new File(FOLDER + fileName + ".png");
        FileUtils.copyFile(scrFile, targetFile);
    }
	
	
	@Dado("^Acessar a URL$")
	public void acessar_a_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\Cervello-Automacao\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com");
	    takeScreenShot();
	}

	@Dado("^Informar usuario \"([^\"]*)\"$")
	public void informar_usuario(String arg1) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
	    takeScreenShot();
	}

	@Dado("^Informar senha \"([^\"]*)\"$")
	public void informar_senha(String arg1) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(arg1);
	    takeScreenShot();
	}

	@Entao("^Clicar no botao$")
	public void clicar_no_botao() throws Throwable {
		driver.findElement(By.name("login")).click();
		takeScreenShot();
	}

	@Entao("^Selecionar \"([^\"]*)\" a cidade de origem \"([^\"]*)\"$")
	public void selecionar_a_cidade_de_origem(String origem1, String origem2) throws Throwable {
		driver.findElement(By.name(origem1)).sendKeys(origem2);
		takeScreenShot();
	}

	@Entao("^Selecionar \"([^\"]*)\" a cidade de destino \"([^\"]*)\"$")
	public void selecionar_a_cidade_de_destino(String destino1, String destino2) throws Throwable {
		driver.findElement(By.name(destino1)).sendKeys(destino2);
		takeScreenShot();
	}

	@Entao("^Selecionar mes \"([^\"]*)\"  \"([^\"]*)\" e dia \"([^\"]*)\"  \"([^\"]*)\" data > que \"([^\"]*)\"  \"([^\"]*)\" data corrente$")
	public void selecionar_mes_e_dia_data_que_data_corrente(String FMonth1, String mes1, String Fday1, String dia1,
			String arg5, String arg6) throws Throwable {
		takeScreenShot();
	}

	@Entao("^Selecionar mes \"([^\"]*)\"  \"([^\"]*)\" e dia \"([^\"]*)\"  \"([^\"]*)\" data > que \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\" data corrente$")
	public void selecionar_mes_e_dia_data_que_data_corrente(String FMonth1, String mes1, String Fday1, String dia1,
			String TMonth1, String mes2, String Tday1, String dia2) throws Throwable {
		driver.findElement(By.name(FMonth1)).sendKeys(mes1);
		driver.findElement(By.name(Fday1)).sendKeys(dia1);
		driver.findElement(By.name(TMonth1)).sendKeys(mes2);
		driver.findElement(By.name(Tday1)).sendKeys(dia2);
		takeScreenShot();
	}

	@Entao("^Selecionar a Class$")
	public void selecionar_a_Class() throws Throwable {

	}

	@Entao("^Selecionar a Class \"([^\"]*)\"$")
	public void selecionar_a_Class(String classe1) throws Throwable {
		driver.findElement(By.cssSelector("input[value='First']")).click();
		takeScreenShot();
	}

	@Entao("^Selecionar Passengers \"([^\"]*)\" \"([^\"]*)\"$")
	public void selecionarPassengers(String passagem, String numero) throws Throwable {
		driver.findElement(By.name(passagem)).sendKeys(numero);
		takeScreenShot();
	}

	@Entao("^Clicar no botao \"([^\"]*)\"$")
	public void clicar_no_botao(String continua1) throws Throwable {
		driver.findElement(By.name(continua1)).click();
		takeScreenShot();
	}
	
	 @Entao("^Selecionar o voo$")
	  public void selecionar_o_voo() throws Throwable {
	      
		  driver.findElement(By.xpath("//tr[7]/td/input")).click();
		  driver.findElement(By.xpath("//table[2]/tbody/tr[5]/td/input")).click();
		  takeScreenShot(); 
	 }
	 
	 @Entao("^Clicar no botao voo \"([^\"]*)\"$")
	 public void clicar_no_botao_voo(String continua2) throws Throwable {
		 driver.findElement(By.name(continua2)).click(); 
	 }
	 @Entao("^Preencher \"([^\"]*)\"  \"([^\"]*)\" e \"([^\"]*)\"  \"([^\"]*)\"$")
	 public void preencherE(String nome1, String nome2, String sobrenome1, String sobrenome2) throws Throwable {
		 driver.findElement(By.name(nome1)).sendKeys(nome2);
		  
		  driver.findElement(By.name(sobrenome1)).sendKeys(sobrenome2);
		  takeScreenShot();
	 }

	 @Entao("^Preencher numero do cartao \"([^\"]*)\"  \"([^\"]*)\"$")
	 public void preencherNumeroDoCartao(String cartao, String numeroCartao) throws Throwable {
	     
		 driver.findElement(By.name(cartao)).sendKeys(numeroCartao);
		 takeScreenShot();
	 }

	 @Entao("^Preencher o nome do passageiro \"([^\"]*)\"  \"([^\"]*)\" e sobrenome \"([^\"]*)\"  \"([^\"]*)\"$")
	 public void preencherONomeDoPassageiroESobrenome(String nome1, String nome2, String sobrenome1, String sobrenome2) throws Throwable {
		 driver.findElement(By.name(nome1)).sendKeys(nome2);
		  driver.findElement(By.name(sobrenome1)).sendKeys(sobrenome2);
		  takeScreenShot();
	 }

	 @Entao("^Clicar em \"([^\"]*)\"$")
	 public void clicar_em(String botao) throws Throwable {
		 driver.findElement(By.name(botao)).click();
		 takeScreenShot();
	 }
	 @Entao("^Selecionar a opcao$")
	 public void selecionar_a_opcao() throws Throwable {
		 driver.findElement(By.xpath("//input[2]")).click();
		 takeScreenShot();
	 }
	 
	 
	 public void excel() throws CsvValidationException, IOException {
		 
		 CSVReader reader = new CSVReader(new FileReader(CSV_FILE));
		 String[] cell;
		 
		 while((cell=reader.readNext())!=null) {
			
			 
			 
			 
			 for(int i=0;i<1;i++) {
				 
				 String name=cell[i];
				 String email=cell[i+1];
				 String message=cell[i+2];
				 
				 
				 System.out.println(name);
				 System.out.println(email);
				 System.out.println(message);
				 
			 }
			 
		 }
		 
	 }
	 
	 
}