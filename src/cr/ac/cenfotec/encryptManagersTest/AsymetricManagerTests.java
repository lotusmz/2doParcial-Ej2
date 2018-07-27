package cr.ac.cenfotec.encryptManagersTest;

import static org.junit.Assert.*;

import org.junit.Test;

import cr.ac.cenfotec.encryptManagers.AsymetricManager;

public class AsymetricManagerTests {
	private AsymetricManager asymetricManager = new AsymetricManager();
	private String keyName = "baseball";
	private String messageName = "Test name";
	private String message = "Asymetric encription test";
	
	@Test
	public void testEncription() throws Exception {
		asymetricManager.createKey(keyName);
		asymetricManager.encryptMessage(messageName, message, keyName);
		assertEquals(message, asymetricManager.decryptMessage(messageName, keyName));
	}

}
