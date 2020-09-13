import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// lendo arquivos de texto com o Scanner e printando na tela

public class Programa {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Guimarães\\Desktop\\Faculdade\\temp\\entrada.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}
	}

}
