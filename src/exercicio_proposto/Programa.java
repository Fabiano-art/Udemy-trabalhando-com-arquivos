package exercicio_proposto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.println("Enter file path: "); 
		String sourceFileStr = sc.nextLine(); // caminho do arquivo que contém os registros de compras

		File sourceFile = new File(sourceFileStr); // instanciando o arquivo
		String sourceFolderStr = sourceFile.getParent(); // caminho do arquivo
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir(); //criando a subpasta;
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.txt"; // criando o arquivo de saída
		
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
			String csvLine = br.readLine();
			
			while(csvLine != null) {
				String[] fields = csvLine.split(",");
				
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Product(name, price, quantity));
				
				csvLine = br.readLine();
			}
			
		}
		catch(IOException e) {
			System.out.println("Erro: "+e.getMessage());
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
			for (Product item : list) {
				bw.write(item.getName()+","+item.total());
				bw.newLine();
			}
		}
		catch(IOException e) {
			System.out.println("Erro"+e.getMessage());
		}
		
		System.out.println("DONE !!!");
		
		sc.close();
	}
	

}
