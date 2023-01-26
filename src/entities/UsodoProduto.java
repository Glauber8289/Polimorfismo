package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UsodoProduto extends Product {
	//LocalDate date = LocalDate.parse(datadeFabricacao, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	protected LocalDate datadeFabricacao;
	
	public UsodoProduto(String name, double price, LocalDate date) {
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
		   return name+"\n"+price+ datadeFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) ;
		   
	   }
}
