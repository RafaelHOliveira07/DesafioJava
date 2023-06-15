



public class ProdutoFisico extends Produto {

  
	private double peso;
	private String dimensao;
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getDimensao() {
		return dimensao;
	}
	public void setDimensao(String dimensao) {
		this.dimensao = dimensao;
	}
	
	public ProdutoFisico(String nome,double preco, int quantidadeStoque,double peso,String dimensao, int codigoProduto) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeStoque = quantidadeStoque;
		this.peso = peso;
		this.dimensao = dimensao;
		this.codigoProduto = codigoProduto;
		
	}
      
	
	public void ExibirInformaçoes() {
		System.out.println(
		"Nome do produto Fisico:"+nome +"\n"+
		"Preço do produto Fisico:"+preco +"\n"+
		"Peso do Produto Fisico:"+peso +"\n"+
		"Dimensao do Produto Fisico:"+dimensao +"\n"+
		"Quantidade do Produto Fisico:" +quantidadeStoque + "\n"+
		"Codigo do produto Fisico:" +codigoProduto + "\n"
		
				
				);
		
	}
}
