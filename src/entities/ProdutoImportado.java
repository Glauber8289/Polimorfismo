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

	
	
    
	public String precoTotal() {
		return getPrice()+"A taxa Alfandegaria é "+taxaAlfandegaria;
		
	}
	@Override
	public String priceTag() {
		return super.priceTag()+precoTotal();
	}
}
