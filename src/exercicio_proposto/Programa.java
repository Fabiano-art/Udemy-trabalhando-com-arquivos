package exercicio_proposto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		String path;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the file path: ");
		path = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String itens = br.readLine();
			String[] order;
			order = itens.split(",");
			
			for(String x : order) {
				System.out.println(x);
			}
		}
		catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		
	}

}
