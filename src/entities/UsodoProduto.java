package entities;

import java.time.LocalDate;
import java.util.Date;

public class UsodoProduto extends Product {

	private LocalDate datadeFabricacao;

	public UsodoProduto(String name, double price, LocalDate date) {
		super(name, price);
		this.datadeFabricacao = date;
	}


	public LocalDate getDatadeFabricacao() {
		return datadeFabricacao;
	}

	public void setDatadeFabricacao(LocalDate datadeFabricacao) {
		this.datadeFabricacao = datadeFabricacao;
	}
	
	@Override
	  public String priceTag() {
		   return name+"\n"+price;
		   
	   }
}
