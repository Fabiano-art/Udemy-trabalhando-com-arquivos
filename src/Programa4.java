import java.io.File;

//maniupalando as pastas, recuperando listas de arquivos e pastas em um diret�rio

public class Programa4 {

	public static void main(String[] args) {
		
		File path = new File("C:\\Users\\Guimar�es\\Desktop\\Faculdade");
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("FOLDERS: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		
		System.out.println("FILES: ");
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File("C:\\Users\\Guimar�es\\Desktop\\Faculdade\\temp\\sub").mkdir();
		
	}

}
