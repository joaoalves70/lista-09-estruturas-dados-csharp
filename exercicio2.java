package listaix;
import java.util.Hashtable;
import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		Hashtable<String, String> hashtable = new Hashtable<>();
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Informe seu CPF: ");
				String cpf = read.next();
			System.out.print("Informe seu número de telefone: ");
				String telefone = read.next();
			hashtable.put(cpf, telefone);
		}
		
		System.out.print("Informe o CPF que deseja pesquisar: ");
			String pesquisa = read.next();
		String resultado = hashtable.get(pesquisa);
		System.out.printf("O telefone referente ao CPF %s é: %s", pesquisa, resultado);
		
		read.close();
	}

}
