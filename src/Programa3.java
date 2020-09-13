import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//Criando arquivos de texto

public class Programa3 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\Guimarães\\Desktop\\Faculdade\\temp\\saida.txt";
		String lines [] = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){ //new FileWriter(path, true) 
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}

		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
