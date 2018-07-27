package cr.ac.cenfotec.encryptManagersTest;

import static org.junit.Assert.*;

import org.junit.Test;

import cr.ac.cenfotec.encryptManagers.SymetricManager;

public class SymetricManagerTests {
	private SymetricManager symetricManager = new SymetricManager();
	private String keyName = "baseball";
	private String messageName = "Test name";
	private String message = "AES-symetric encription test";
	private String message2 = "Blowfish-symetric encription test";
	
	@Test
	public void testAesEncription() throws Exception {
		symetricManager.createKey(keyName);
		symetricManager.encryptMessage(messageName, message, keyName, 2);
		
		assertEquals(message, symetricManager.decryptMessage(messageName, keyName, 2));
	}
	
	@Test
	public void testBlowfishEncription() throws Exception {
		symetricManager.createKey(keyName);
		symetricManager.encryptMessage(messageName, message2, keyName, 3);
		
		assertEquals(message2, symetricManager.decryptMessage(messageName, keyName, 3));
	}

}
