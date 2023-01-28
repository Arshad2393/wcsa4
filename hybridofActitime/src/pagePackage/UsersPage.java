package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	@FindBy(xpath="//a[@class='content users_selected selected']//descendant::div[@class='label']") private WebElement usersTab; 
	@FindBy(xpath = "//input[@value='Create New User']")private WebElement createUserButton;
	@FindBy(name="username")private WebElement usnTextBox;
	@FindBy(name = "passwordText")private WebElement passTextBox;
	@FindBy(name="passwordTextRetype")private WebElement retypePassTextBox;
	@FindBy(name="FirstName")private WebElement firstNameTextBox;
	@FindBy(name="LastName")private WebElement lastNameTextBox;

	@FindBy(xpath = "//input[@value='   Create User   ']")private WebElement CreateButton;
	@FindBy(xpath = "//input[@value='      Cancel      ']")private WebElement CancelButton;

	
	
	public UsersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getUsersTab() {
		return usersTab;
	}
	public WebElement getCreateUserButton() {
		return createUserButton;
	}
	public WebElement getUsnTextBox() {
		return usnTextBox;
	}
	public WebElement getPassTextBox() {
		return passTextBox;
	}
	public WebElement getRetypePassTextBox() {
		return retypePassTextBox;
	}
	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}
	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}
	public WebElement getCreateButton() {
		return CreateButton;
	}
	public WebElement getCancelButton() {
		return CancelButton;
	}
	
	
	
	//opertaional methods
	public void validUsn(String validUser) {
		getUsnTextBox().sendKeys(validUser);
	}
	
	public void validPass(String validPassword) {
		passTextBox.sendKeys(validPassword);
	}
	public void retypePass(String validPassword) {
		retypePassTextBox.sendKeys(validPassword);
	}
	public void firstName(String fname) {
		firstNameTextBox.sendKeys(fname);
	}
	public void lastName(String lname) {
		lastNameTextBox.sendKeys(lname);
	}
    public void creatBtn() {
    	createUserButton.click();
    }      
	public void clickOnTab() {
		usersTab.click();
	}
	}
