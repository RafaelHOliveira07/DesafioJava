public class Compra extends Produto {
    private int unidade;

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public Compra(String nome, double preco, int unidade){
        this.nome = nome;
        this.preco = preco;
        this.unidade = unidade;
    }
    public void ExibirInformaçoes(){
        System.out.println(

                "Nome do produto:"+nome +"\n"+
                        "Preço do produto:"+preco +"\n"+
                        "Quantidade de unidades vendidas:"+unidade +"\n"

        );
    }
    public void AdicionarEstoque(ProdutoFisico produtofisico){



    }

}