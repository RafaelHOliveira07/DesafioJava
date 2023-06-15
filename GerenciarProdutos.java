import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GerenciarProdutos {

    Scanner leia = new Scanner(System.in);
    public static List<Produto> listProduto = new ArrayList<>();
    public static List<ProdutoFisico> listProdutoFisico = new ArrayList<>();
    public static List<ProdutoDigital> listProdutoDigital = new ArrayList<>();

    public static void main(String[] args) {
        GerenciarProdutos gp = new GerenciarProdutos();
        int opcao = 0;
        System.out.println("======Gerenciamento de produtos fisicos e Digitais Da Cyborgue-Store======");
        do {
            System.out.println("Digite 1 para cadastrar um produto na loja física:");
            System.out.println("Digite 2 para cadastrar um produto na loja Digital: ");
            System.out.println("Digite 3 emitr um relatorio de todos os produtos:");
            System.out.println("Digite 4 para remover um produto:");
            System.out.println("Digite 5 para  visualizar o estoque de produtos:");
            System.out.println("Digite 6 para  procurar um produto pelo seu código:");
            System.out.println("Digite 7 para sair do Sistema:");
            opcao = Integer.parseInt(gp.leia.nextLine());

            switch (opcao) {
                case 1:
                    gp.execCadastrarProdutoFisico();
                    break;
                case 2:
                    gp.execCadastrarProdutoDigital();
                    break;
                case 3:
                    gp.execEmitirRelatorio();
                case 4:
                    gp.execRetirarPorduto();
                case 5:
                    gp.execGerenciarEstoque();
                case 6:
                    gp.execConsultarCodigo();
                    break;
                case 7:
                    System.out.println("<*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*>");
                    System.out.println("============Programa encerrado com sucesso=============");
                    System.out.println("<*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*>");
                    break;
                default:
                    System.out.println("Opcao-invalida");



            }

        } while (opcao != 7);

    }

    public void execCadastrarProdutoFisico() {
        System.out.println("=======CADASTRAR_PRODUTO_FISICO==========");
        System.out.println("Insira o nome do produto:");
        String nome = (leia.nextLine());
        System.out.println("Insira preço do produto:");
        double preco = Double.parseDouble(leia.nextLine());
        System.out.println("Insira a quantidade que a loja possui desse produto:");
        Integer quantidadeStoque = Integer.parseInt(leia.nextLine());
        System.out.println("Insira o peso do produto:");
        double peso = Double.parseDouble(leia.nextLine());
        System.out.println("Insira a dimensao do produto:");
        String dimensao = (leia.nextLine());
        System.out.println("Insira o codigo do produto:\n");
        Integer codigoProduto = Integer.parseInt(leia.nextLine());
        System.out.println("=====Seu novo Produto Fisico foi cadastrado com sucesso=====");
        System.out.println("Escolha outra opção se desejar");
        System.out.println("<*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*>");
        ProdutoFisico produtofisico = new ProdutoFisico(nome, preco, quantidadeStoque, peso, dimensao, codigoProduto);
        listProdutoFisico.add(produtofisico);

    }

    public void execCadastrarProdutoDigital() {
        System.out.println("==========CADASTRAR_PRODUTO_)DIGITAL===========");
        System.out.println("Insira o nome do produto:\n");
        String nome = (leia.nextLine());
        System.out.println("Insira o  preço do produto Digital:\n");
        double preco = Double.parseDouble(leia.nextLine());
        System.out.println("Insira a quantidade do produto digital disponivel:\n");
        Integer quantidadeStoque = Integer.parseInt(leia.nextLine());
        System.out.println("Insira o formato do produto digital:\n");
        String formato = (leia.nextLine());
        System.out.println("Insira o tamanho do arquivo:\n");
        String tamanhoArquivo = (leia.nextLine());
        System.out.println("Insira ocodigo do produto:\n");
        Integer codigoProduto = Integer.parseInt(leia.nextLine());
        System.out.println("Seu novo produto Digital Foi cadastrado com sucesso\n");
        System.out.println("Digite outra opcao se desejar");
        System.out.println("<*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*>");
        ProdutoDigital produtodigital = new ProdutoDigital(nome, preco, quantidadeStoque, formato, tamanhoArquivo, codigoProduto);
        listProdutoDigital.add(produtodigital);

    }

    public void execEmitirRelatorio() {
        System.out.println("Esses são os dados dos produtos fisicos cadastrados:\n");
        for (ProdutoFisico produtosfisicos : listProdutoFisico) {
            produtosfisicos.ExibirInformaçoes();
        }
        System.out.println("<*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*>");
        System.out.println("Esses são  os dados dos produtos Digitais cadastrados:\n");
        for (ProdutoDigital produtodigital : listProdutoDigital) {
            produtodigital.ExibirInformaçoes();
            System.out.println("<%%%%%%%%%%%%%%%%%%%%>");


        }

    }

    public void execGerenciarEstoque() {
        int totalProdutoFisico = 0;
        int totalProdutoDigital = 0;
        int totalEstoque = 0;
        System.out.println("<=============================>");
        for (ProdutoFisico produtofisico : listProdutoFisico) {
            totalProdutoFisico = totalProdutoFisico + produtofisico.getQuantidadeStoque();
        }
        System.out.println("Total de produtos fisicos na loja:" + totalProdutoFisico);

        for (ProdutoDigital produtodigital : listProdutoDigital) {
            totalProdutoDigital = totalProdutoDigital + produtodigital.getQuantidadeStoque();
        }
        System.out.println("Total de produtos digitais na loja:" + totalProdutoDigital);
        totalEstoque = totalProdutoFisico + totalProdutoDigital;
        System.out.println("Total de produtos fisicos e digitais disponiveis na loja:" + totalEstoque);

    }

    public void execConsultarCodigo() {
        System.out.println("<=================BUSCANDO INFORMAÇÕES DO PRODUTO===================>");
        System.out.println("Informe o código do produto que deseja consultar:");
        int codigo = Integer.parseInt(leia.nextLine());

        boolean encontrado = false;

        // Procurar na lista de produtos físicos
        for (ProdutoFisico produtoFisico : listProdutoFisico) {
            if (produtoFisico.getCodigoProduto() == codigo) {
                produtoFisico.ExibirInformaçoes();
                encontrado = true;
                break;

            }
            System.out.println("<=============================>");
        }
        System.out.println("<=============================>");

        // Procurar na lista de produtos digitais, se não encontrado nos produtos físicos
        if (!encontrado) {
            for (ProdutoDigital produtoDigital : listProdutoDigital) {
                if (produtoDigital.getCodigoProduto() == codigo) {
                    produtoDigital.ExibirInformaçoes();
                    encontrado = true;
                    break;
                }
            }
            System.out.println("<=============================>");
        }




    }

    public void execRetirarPorduto() {
        System.out.println("<================REMOÇÃO DE PRODUTOS==================>");
        System.out.println("Informe o nome do produto a ser removido:");
        String nome = (leia.nextLine());


        ProdutoDigital produtoRemover = null;
        for (ProdutoDigital produtoDigital : listProdutoDigital) {
            if (produtoDigital.getNome().equals(nome)) {
                produtoRemover = produtoDigital;
                break;
            }
        }

        if (produtoRemover != null) {
            listProdutoDigital.remove(produtoRemover);
            System.out.println("Produto removido com sucesso!");
        }

        ProdutoFisico produtoRemoverFisico = null;
        for (ProdutoFisico produtoFisico : listProdutoFisico) {
            if (produtoFisico.getNome().equals(nome)) {
                produtoRemoverFisico = produtoFisico;
                break;
            }
        }

        if (produtoRemoverFisico != null) {
            listProdutoFisico.remove(produtoRemoverFisico);
            System.out.println("Produto removido com sucesso!");
        }



    }
}