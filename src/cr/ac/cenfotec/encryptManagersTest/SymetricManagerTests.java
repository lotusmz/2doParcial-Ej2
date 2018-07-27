package cr.ac.cenfotec.encryptManagersTest;

import static org.junit.Assert.*;

import org.junit.Test;

import cr.ac.cenfotec.encryptManagers.SymetricManager;

public class SymetricManagerTests {
	private SymetricManager symetricManager = new SymetricManager();
	private String keyName = "baseball";
	private String messageName = "Test name";
	private String message = "Asymetric encription test";
	
	@Test
	public void testAesEncription() throws Exception {
		symetricManager.createKey(keyName);
		symetricManager.encryptMessage(messageName, message, keyName, 2);
		
		assertEquals(message, symetricManager.decryptMessage(messageName, keyName, 2));
	}

}
