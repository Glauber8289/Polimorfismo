package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class UsodoProduto extends Product {
	//LocalDate date = LocalDate.parse(datadeFabricacao, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	protected LocalDate datadeFabricacao;
	
	public UsodoProduto(String name, double price, LocalDate datadeFabricacao) {
		super(name, price);
		this.datadeFabricacao = datadeFabricacao;
	}


	public LocalDate getDatadeFabricacao() {
		return datadeFabricacao;
	}

	public void setDatadeFabricacao(LocalDate datadeFabricacao) {
		this.datadeFabricacao = datadeFabricacao;
	}
	
	
	@Override
	  public String priceTag() {
		   return "O nome do produto usado e "+ name+"\n" +"Seu preço é: "+price+"R$"+"\n"+"E sua data  de fabricacao e : " + datadeFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		   
	   }
}
