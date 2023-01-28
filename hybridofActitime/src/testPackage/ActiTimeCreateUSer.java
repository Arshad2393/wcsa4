package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.UsersPage;

public class ActiTimeCreateUSer extends BaseTest {
  @Test
  public void createValidUser() throws InterruptedException, IOException {
	 LoginPage lp = new LoginPage(driver);
	 Flib flib = new Flib();
	 lp.actiTimeValidLogin(flib.readPropertyData(PROP_PATH, "Username"), flib.readPropertyData(PROP_PATH, "Password"));
	 HomePage hp = new HomePage(driver);
	 hp.clickOnUsers();
	 
	 UsersPage up = new UsersPage(driver);
	 up.clickOnTab();
	 up.validUsn(flib.readExcelData(EXCEL_PATH, "uservaliddata", 1, 0));
	 up.validPass(flib.readExcelData(EXCEL_PATH, "uservaliddata", 1, 1));
	 up.retypePass(flib.readExcelData(EXCEL_PATH, "uservaliddata", 1, 1));
	 up.firstName(flib.readExcelData(EXCEL_PATH, "uservaliddata", 1, 2));
	 up.lastName(flib.readExcelData(EXCEL_PATH, "iservaliddata", 1, 3));
	 up.creatBtn();
	 Thread.sleep(2000);
	 up.clickOnTab();

  }
}
