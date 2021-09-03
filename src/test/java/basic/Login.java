package basic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClassintestng{
	
public Login(){

PageFactory.initElements(driver,this);
	}

	
@FindBy(id="username")
private WebElement txtusername;

   
@FindBy(id="password")
private WebElement password;

  
@FindBy(id="login")
private WebElement logbtn;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogbtn() {
		return logbtn;
	}
	
	
	
	}


