package listaix;
import java.util.Hashtable;
import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
        Hashtable<String, Double> produtos = new Hashtable<>();
        Hashtable<String, Integer> carrinho = new Hashtable<>();
        Scanner read = new Scanner(System.in);
        
        produtos.put("Produto A", 10.0);
        produtos.put("Produto B", 20.0);
        produtos.put("Produto C", 30.0);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar produto ao carrinho");
            System.out.println("2. Visualizar carrinho");
            System.out.println("3. Finalizar compra e sair");
            
            int escolha = read.nextInt();
            
            if (escolha == 1) {
                System.out.println("Lista de produtos disponíveis:");
                for (String produto : produtos.keySet()) {
                    System.out.println(produto + " - R$" + produtos.get(produto));
                }
                System.out.print("Digite o nome do produto a ser adicionado: ");
                	String nomeProduto = read.next();
                if (produtos.containsKey(nomeProduto)) {
                    if (carrinho.containsKey(nomeProduto)) {
                        carrinho.put(nomeProduto, carrinho.get(nomeProduto) + 1);
                    }else {
                        carrinho.put(nomeProduto, 1);
                    }
                    System.out.println("Produto adicionado ao carrinho.");
                }else {
                    System.out.println("Produto não encontrado na lista.");
                }
            }else if (escolha == 2) {
                System.out.println("Carrinho de compras:");
                	double total = 0;
                for (String produto : carrinho.keySet()) {
                    int quantidade = carrinho.get(produto);
                    double preco = produtos.get(produto);
                    double subtotal = quantidade * preco;
                    System.out.println(produto + " - " + quantidade + "x - R$" + subtotal);
                    total += subtotal;
                }
                System.out.println("Valor total a ser pago: R$" + total);
            } else if (escolha == 3) {
                System.out.println("Compra finalizada. Obrigado por comprar conosco!");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        
        read.close();
    }

}
