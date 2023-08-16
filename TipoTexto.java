import java.util.Scanner;

public class TipoTexto {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	String nome = scanner.nextLine();  // nextLine = método usado para ler inputs do tipo String
	
	System.out.println("Olá " + nome + "!");	

	scanner.close();

	Character variavelChar = 'A'; // variavel do tipo character só aceita 1 único caractere, seja letra ou número será considerado texto

	}

}