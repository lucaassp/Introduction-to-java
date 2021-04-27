package exercicio09;

import java.util.Scanner;

public class ProgramaTitureco {
  
  private static int menu(Scanner sc) {
    System.out.println("=== Programa Titureco ===");
    System.out.println("1 - Cadastrar atrativo");
    System.out.println("2 - Pesquisar Atrativos da cidade");
    System.out.println("3 - Listar todos os atrativos");
    System.out.println("4 - Apagar atrativo");
    System.out.println("5 - Sair");
    
    System.out.print("Opção: ");
    int op = Integer.parseInt(sc.nextLine());
    
    return op;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Titureco titureco = new Titureco();
    
    int op = menu(sc);
    
    while(op != 5) {
      if (op <= 0 || op > 5) {
        System.out.println("Escolha outra opção.");
        op = menu(sc);
      }
      
      if (op == 1) {
        System.out.print("Qual o estado do atrativo? ");
        String estado = sc.nextLine();

        System.out.print("Qual a cidade do atrativo? ");
        String cidade = sc.nextLine();

        System.out.print("Qual o nome do atrativo? ");
        String nome = sc.nextLine();

        System.out.print("Qual a latitude do atrativo? ");
        double latitude = Double.parseDouble(sc.nextLine());

        System.out.print("Qual a longitude do atrativo? ");
        double longitude = Double.parseDouble(sc.nextLine());

        System.out.print("Como chegar ao atrativo? ");
        String comoChegar = sc.nextLine();

        AtrativoTuristico atrativo = new AtrativoTuristico(nome, latitude, longitude, comoChegar, cidade, estado);
        boolean cadastrou = titureco.cadastrarAtrativo(atrativo);
        
        if (cadastrou) {
          System.out.println("\nAtrativo cadastrado com sucesso!\n");
        } else {
          System.out.println("\nAtrativo Já existe!\n");
        }
      } else if (op == 2) {
        if (titureco.getAtrativos().isEmpty()) {
          System.out.println("\nNão tem atrativos cadastrados para pesquisar.\n");
        } else {
          System.out.println("Para pesquisar, é preciso que você indique o estado e a cidade:\n");

          System.out.print("Qual o estado? ");
          String estadoPesquisa = sc.nextLine();

          System.out.print("Qual a cidade? ");
          String cidadePesquisa = sc.nextLine();

          System.out.println("\n"+titureco.pesquisarAtrativosTuristicosDaCidade(cidadePesquisa, estadoPesquisa)+"\n");
        }        
      } else if (op == 3) {
        if (titureco.getAtrativos().isEmpty()) {
          System.out.println("\nNão tem atrativos cadastrados.\n");
        } else {
          System.out.println("\nAtrativos:\n" + titureco.getAtrativos() +"\n");
        }
      } else if (op == 4) {
        if (titureco.getAtrativos().isEmpty()) {
          System.out.println("\nNão tem atrativos para remover.\n");
        } else {
          System.out.print("Qual o estado do atrativo? ");
          String estadoRemove = sc.nextLine();

          System.out.print("Qual a cidade do atrativo? ");
          String cidadeRemove = sc.nextLine();

          System.out.print("Qual o nome do atrativo? ");
          String nomeRemove = sc.nextLine();

          boolean removed = titureco.apagarAtrativo(nomeRemove, cidadeRemove, estadoRemove);

          if (removed) {
            System.out.println("\nAtrativo removido com sucesso!\n");
          } else {
            System.out.println("\nO atrativo já foi cadastrado!\n");
          }
        }        
      }
      
      op = menu(sc);
    }

    System.out.println("\nVolte Sempre! :) \n");
  }
}