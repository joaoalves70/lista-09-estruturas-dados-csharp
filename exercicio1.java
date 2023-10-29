package listaix;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class exercicio1 {
	
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
		Enumeration<String> keys = hashtable.keys();
		while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("CPF: " + key + ", Telefone: " + hashtable.get(key));
        }
		read.close();
	}

}
