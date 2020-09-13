package exercicio_proposto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Guimarães\\Desktop\\Faculdade\\temp\\Source file.csv");
		Product[] prod = new Product[3];
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = br.readLine();
			String[] list = line.split(",");
			
			while(line != null) {
				
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
