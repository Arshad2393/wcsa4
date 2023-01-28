package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage;

public class ActiTimeTestValidLogin extends BaseTest {
	
	@Test
	public void validTest() throws IOException, InterruptedException {
		
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		
		lp.actiTimeValidLogin(flib.readPropertyData(PROP_PATH, "Username"), flib.readPropertyData(PROP_PATH, "Password"));
		flib.readPropertyData(PROP_PATH, "Username");
		
	}

}
