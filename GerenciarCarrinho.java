

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarCarrinho  {
    Scanner leia = new Scanner(System.in);
        public static List<Compra> listCompras = new ArrayList<>();
    public static List<Produto> listProduto = new ArrayList<>();
    public static List<ProdutoFisico> listProdutoFisico = new ArrayList<>();
    
public static  void main(String[] args){
    int opcao = 0;
    GerenciarCarrinho c = new GerenciarCarrinho();
    do{
         System.out.println("<============Gerenciar Compras de Produtos no Carrinho==============>");
         System.out.println("Digite 1 para adcionar um produto  ao carrinho:\n");
         System.out.println("Digite 2 para remover um produto do carrinho:\n");
         System.out.println("Digite 3 exibir todas as compras realizadas:\n");
          System.out.println("Digite 4 para exibir os gastos realizaedos com a compra:\n");
         System.out.println("Digite 5 para sair do sistema");
         opcao = Integer.parseInt(c.leia.nextLine());
 switch(opcao) {
     case 1:
         c.execAdicionarCarrinho();
         break;
     case 2:
         c.execExibirCompras();
         break;
     case 3:
         c. execRemoverProduto();
         break;
     case 4:
         c.execVisualiazarGasto();
         break;
  
     
     case 5:
         System.out.println("<*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*>");
         System.out.println("============Programa Encerrado com Sucesso=============");
         System.out.println("<*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*>");
			break;
			default:
			System.out.println("Opcao invalida");
    
        
    }
    
}while(opcao != 9);    
    

}




    public  void execAdicionarCarrinho() {
      
   System.out.println("<======================ADICIONE UM PRODUTO AO SEU CARRINHO==========================>");
   System.out.println("Informe o  nome do produto que gostaria de adicionar:");
   String nome = (leia.nextLine());
   System.out.println("Informe o valor a ser pago pelo produto:");
   double preco = Double.parseDouble(leia.nextLine());
   System.out.println("Informe a quantas unidades deseja:");
   Integer  unidade = Integer.parseInt(leia.nextLine());
   System.out.println("<==================Pronto seu produto foi adcionado ao seu carrinho com sucesso====================>");
   Compra compras = new Compra(nome,preco,unidade);
   listCompras.add(compras);
                
         
    }
    
    
    public void execExibirCompras(){
        System.out.println("Essas são as compras realizadas pelo cliente:");
        for(Compra compras : listCompras){
            	compras.ExibirInformaçoes();
        }
    }
    
    public void execRemoverProduto(){
        System.out.println("Informe o nome do produto a ser removido do carrinho:");
        String nome = (leia.nextLine());
         Compra produtoRemover = null;
        for (Compra compras: listCompras) {
            if (compras.getNome().equals(nome)) {
                produtoRemover = compras;
                break;
            }
        }
        
        if (produtoRemover != null) {
            listCompras.remove(produtoRemover);
            System.out.println("Produto removido com do seu carrinho sucesso!");
        }
       
       
        
    }
    
       public void execVisualiazarGasto(){
            double totalGasto= 0;
            int totalProdutoDigital = 0;
            int  totalEstoque = 0;
            for(Compra compras:listCompras){
            totalGasto= totalGasto + compras.getPreco();
        }
        System.out.println("Seu gasto total na compra foi de:" + totalGasto +"R$");
        System.out.println("<==========================================>");
        
          
    }       
      
}




