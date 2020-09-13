import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//lendo e printando arquivos com o BufferedReader

public class Programa2 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\Guimarães\\Desktop\\Faculdade\\temp\\entrada.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				
				line = br.readLine();
			}
			
		}
		catch (IOException e) {
			System.out.println("Something went wrong " + e.getMessage());
		}
	}

}
