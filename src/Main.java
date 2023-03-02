import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome, nome da rua, e CPF");
        Cliente cliente = new Cliente (scanner.nextLine(), scanner.nextLine(),scanner.nextLine());
        Pedido hamburgue = new Pedido();



          if(cliente.getCpf().matches("\\d+")) {
              System.out.println("Bem vindo a Burgueria Moderna!");
              System.out.println("Monte seu Hamburguer");
              System.out.println("____________________________");
              System.out.println("Escolha o tipo de hamburguer");
              System.out.println("(1) Carne");
              System.out.println("(2) Frango");
              System.out.println("(3) confirmar");

              for (int opcaoCarneFrango = scanner.nextInt(); opcaoCarneFrango != 3; opcaoCarneFrango = scanner.nextInt()) {
                  scanner.nextLine();
                  switch (opcaoCarneFrango) {
                      case 1:
                          hamburgue.carneFrango(opcaoCarneFrango);
                          System.out.println("Voce escolheu Carne , aperte (3) Para confirmar");
                          break;
                      case 2:

                          hamburgue.carneFrango(opcaoCarneFrango);
                          System.out.println("Voce escolheu Frango, aperte (3) Para confirmar");
                          break;
                      default:
                          System.out.println("opção inválida");
                          break;
                  }
              }
              System.out.println("Deseja adicionar Verdura?");
              System.out.println("(1) Sim");
              System.out.println("(2) Não");
              System.out.println("(3) confirmar");
              for (int addVerdura = scanner.nextInt(); addVerdura != 3; addVerdura = scanner.nextInt()) {
                  scanner.nextLine();
                  switch (addVerdura) {
                      case 1:
                          hamburgue.adcionarVerdura(addVerdura);
                          System.out.println("Voce escolheu Hamburguer com verdura, aperte (3) Para confirmar.");
                          break;
                      case 2:
                          hamburgue.adcionarVerdura(addVerdura);
                          System.out.println("Voce escolheu Hamburguer SEM verdura , aperte (3) Para confirmar");
                          break;
                      default:
                          System.out.println("Opção inválida");
                          break;
                  }
              }
              System.out.println("Deseja adicionar Molho?");
              System.out.println("(1) Sim");
              System.out.println("(2) Não");
              System.out.println("(3) confirmar");
              for (int addMolho = scanner.nextInt(); addMolho != 3; addMolho = scanner.nextInt()) {
                  scanner.nextLine();
                  switch (addMolho) {
                      case 1:
                          hamburgue.adicionarMolho(addMolho);
                          System.out.println("Vou adiciounou molho, aperte (3) para confirmar");
                          break;
                      case 2:
                          hamburgue.adicionarMolho(addMolho);
                          System.out.println("Sem Molho, aperte (3) para confirmar");
                          break;
                      default:
                          System.out.println("opção inválida");
                          break;
                  }

              }
              System.out.println("Deseja adicionar Queijo?");
              System.out.println("(1) Sim");
              System.out.println("(2) Não");
              System.out.println("(3) confirmar");
              for (int addQueijo = scanner.nextInt(); addQueijo != 3; addQueijo = scanner.nextInt()) {
                  scanner.nextLine();
                  switch (addQueijo) {
                      case 1:
                          hamburgue.adicionarQueijo(addQueijo);
                          System.out.println("Você adicionou queijo, aperte (3) para confirmar");
                          break;
                      case 2:
                          hamburgue.adicionarQueijo(addQueijo);
                          System.out.println("Sem queijo,aperte (3) para confirmar");
                          break;
                      default:
                          System.out.println("opção inválida");
                          break;
                  }
              }
              System.out.println("____Cadastro____");
              cliente.ImprimirDadosCliente();
              System.out.println("___pedido______");
              hamburgue.ResumoPed();

          }else{
              System.out.println("O campo CPF, so aceita números");
          }

           }




    }






