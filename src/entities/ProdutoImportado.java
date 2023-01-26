package entities;

public class ProdutoImportado extends Product{
    private double taxaAlfandegaria;

	public ProdutoImportado(String name, double price, double taxaAlfandegaria) {
		super(name, price);
		this.taxaAlfandegaria = taxaAlfandegaria;
	}

	public double getTaxaAlfandegaria() {
		return taxaAlfandegaria;
	}

	public void setTaxaAlfandegaria(double taxaAlfandegaria) {
		this.taxaAlfandegaria = taxaAlfandegaria;
	}

	
	
    
	public double precoTotal() {
		return getPrice()+taxaAlfandegaria;
		
	}
	@Override
	public String priceTag() {
		return super.priceTag()+" O Valor da taxa Alfandegaria é "+ taxaAlfandegaria+"R$" + "\n O valor do produto somado com a taxa alfandegaria é "+precoTotal()+"R$";
	}
}
