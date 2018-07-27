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
        		executeAction(option);
        	}
    	} while (option != 3);

	}

}
