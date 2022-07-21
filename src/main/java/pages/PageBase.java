package pages;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {

	protected WebDriver driver;
	public JavascriptExecutor javascriptExecutor;
	public Select select;
	
	//create constructor
	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	protected static void clickbtn(WebElement btn) 
	{
		btn.click();
	}
	protected static void setTextElementText(WebElement txtElement,String value) 
	{
		txtElement.sendKeys(value);
	}
	
	
	
}
