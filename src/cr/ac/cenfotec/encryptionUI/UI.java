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
		
		int option = 0;
		do {
    		System.out.println("Choose the encription method");
        	System.out.println("1.Asymetric Encription");
        	System.out.println("2.Symetric Encription");
        	System.out.println("3.Exit ");
        	option = Integer.parseInt(br.readLine());
        	if (option >= 1 && option <= 2){
        		encriptionMenu(option);
        	}
    	} while (option != 3);

	}
	
	private static void encriptionMenu(int option) throws Exception {
		if (option == 1){ 
			int option1 = 0;
			do {
	    		System.out.println("1.Create key");
	        	System.out.println("2.Encript Message");
	        	System.out.println("3.Decrypt Message");
	        	System.out.println("4.Exit ");
	        	option1 = Integer.parseInt(br.readLine());
	        	if (option1 >= 1 && option1 <= 3){
	        		asymetricEncription(option1);
	        	}
	    	} while (option1 != 4);	
		}
		if (option == 2){
			int option2 = 0;
			do {
	    		System.out.println("1.Create key");
	        	System.out.println("2.Encript Message");
	        	System.out.println("3.Decrypt Message");
	        	System.out.println("4.Exit ");
	        	option2 = Integer.parseInt(br.readLine());
	        	if (option2 >= 1 && option2 <= 3){
	        		symetricEncription(option2);
	        	}
	    	} while (option2 != 4);		
		}
		if (option == 3){
			//new type of encription not defined			
		}
	}

	private static void asymetricEncription(int pOption1) throws Exception {
		if (pOption1 == 1){ 
			System.out.println("Key name: ");
			String name = br.readLine();
			asymetricManager.createKey(name);
		}
		if (pOption1 == 2){
			System.out.println("Key name: ");
			String name = br.readLine();
			System.out.println("Message name: ");
			String messageName = br.readLine();
			System.out.println("Message: ");
			String message = br.readLine();
			asymetricManager.encryptMessage(messageName,message,name);		
		}
		if (pOption1 == 3){
			System.out.println("Key name: ");
			String keyName = br.readLine();
			System.out.println("Message name: ");
			String messageName = br.readLine();
			asymetricManager.decryptMessage(messageName, keyName);			
		}
	}	
	
	private static void symetricEncription(int pOption2) throws Exception {
		if (pOption2 == 1){ 
			System.out.println("Key name: ");
			String name = br.readLine();
			symetricManager.createKey(name);
		}
		if (pOption2 == 2){
			System.out.println("Key name: ");
			String name = br.readLine();
			System.out.println("Message name: ");
			String messageName = br.readLine();
			System.out.println("Message: ");
			String message = br.readLine();
			symetricManager.encryptMessage(messageName,message,name);		
		}
		if (pOption2 == 3){
			System.out.println("Key name: ");
			String keyName = br.readLine();
			System.out.println("Message name: ");
			String messageName = br.readLine();
			symetricManager.decryptMessage(messageName, keyName);			
		}
	}
	


}
