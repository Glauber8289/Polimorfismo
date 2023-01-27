package aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;
import entities.ProdutoImportado;
import entities.UsodoProduto;

public class Program {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	 List<Product> list = new ArrayList<>();
		System.out.println("Digite o numero de produtos");
		int n = sc.nextInt();
		
		for(int i = 1;i<=n;i++) {
			System.out.println("\n"+"Insira os dados do Produto #" + i);
		      System.out.println();
		      System.out.println("Digite se o produto e comun,usado ou importado com as seguintes opções - c/u/i ");
			   char tipo=sc.next().charAt(0);
		      System.out.println("Nome do Produto");
		      String name = sc.next();
		      System.out.println("Preço do produto");
		      double price = sc.nextDouble();
		      
			
		      
			if(tipo=='c') {
				list.add(new Product(name,price));
				}
			else if(tipo=='u') {
				System.out.println("Data de fabricação DD/MM/YYYY");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsodoProduto(name,price,date));
			}
			else {
				System.out.println("Taxa de importação");
				double taxaAlfandegaria = sc.nextDouble();
				list.add(new ProdutoImportado(name,price,taxaAlfandegaria));
				
			}
			System.out.println();
			System.out.println("ETIQUETAS DE PRECO:");
			for (Product prod : list) {
				System.out.print(prod.priceTag());
		
		
		}
		
		

	}
}
}
