# César Henrique Soares Marques - RA 622120352

## Lista de Atividades IX - Java

### 1. Faça um programa em C# que utilize a Estrutura de Dados HashTables. Ele deverá ler o CPF da pessoa e seu telefone. O programa deverá conseguir ler até 05 CPF e seus respectivos telefones. Imprima esses dados na tela.

'''
	
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
 
'''

### 2. Modifique o programa anterior para que ele consiga também pesquisar por cpf's e encontrar seus telefones.

'''
	
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

'''

### 3. Você foi contratado para desenvolver um programa em Java para criar um sistema de carrinho de compras usando HashTables. O programa permite adicionar produtos ao carrinho, visualizar o carrinho, finalizar a compra mostrando o valor total a ser pago e sair. Cada produto é representado pelo seu nome (chave) e preço (valor associado) na HashTable.

'''
	
	public static void main(String[] args) {
        Hashtable<String, Double> produtos = new Hashtable<>();
        Hashtable<String, Integer> carrinho = new Hashtable<>();
        Scanner read = new Scanner(System.in);
        
        produtos.put("ProdutoA", 10.0);
        produtos.put("ProdutoB", 20.0);
        produtos.put("ProdutoC", 30.0);

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

'''
