package cr.ac.cenfotec.encryptionUI;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import cr.ac.cenfotec.encryptManagers.AsymetricManager;
import cr.ac.cenfotec.encryptManagers.SymetricManager;

public class UI {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static AsymetricManager asymetricManager = new AsymetricManager();
	private static SymetricManager symetricManager = new SymetricManager();
	
	public static void main(String[] args) throws Exception{
		
		int encType = 0;
		do {
    		System.out.println("Choose the encription method");
        	System.out.println("1.RSA-Asymetric");
        	System.out.println("2.AES-Symetric");
        	System.out.println("3.Blowfish-Symetric");
        	System.out.println("4.Exit ");
        	encType = Integer.parseInt(br.readLine());
        	if (encType >= 1 && encType <= 3){
        		encriptionMenu(encType);
        	}
    	} while (encType != 3);

	}
	
	private static void encriptionMenu(int pEncType) throws Exception {
		
		int option = 0;
		do {
    		System.out.println("1.Create key");
        	System.out.println("2.Encript Message");
        	System.out.println("3.Decrypt Message");
        	System.out.println("4.Exit ");
        	option = Integer.parseInt(br.readLine());
        	if (option >= 1 && option <= 3){
        		proceedWithEncription(option, pEncType);
        	}
    	} while (option != 4);	
	
	}

	private static void proceedWithEncription(int pOption1, int pEncType) throws Exception {
		if (pOption1 == 1){ 
			System.out.println("Key name: ");
			String name = br.readLine();
			
			if(pEncType == 1) {
				asymetricManager.createKey(name);
			}else if(pEncType == 2 || pEncType == 3) {
				symetricManager.createKey(name);
			}
			
		}
		if (pOption1 == 2){
			System.out.println("Key name: ");
			String name = br.readLine();
			System.out.println("Message name: ");
			String messageName = br.readLine();
			System.out.println("Message: ");
			String message = br.readLine();
			
			if(pEncType == 1) {
				asymetricManager.encryptMessage(messageName,message,name);
			}else if(pEncType == 2 || pEncType == 3) {
				symetricManager.encryptMessage(messageName,message,name,pEncType);
			}
					
		}
		if (pOption1 == 3){
			System.out.println("Key name: ");
			String keyName = br.readLine();
			System.out.println("Message name: ");
			String messageName = br.readLine();
			if(pEncType == 1) {
				asymetricManager.decryptMessage(messageName, keyName);
			}else if(pEncType == 2 || pEncType == 3) {
				symetricManager.decryptMessage(messageName, keyName,pEncType);
			}
						
		}
	}	

}
