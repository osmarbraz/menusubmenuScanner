
/**
 * Implementação de exemplo que utiliza Scanner para construir um menu de opções com submenu.
 */
import java.util.Scanner;

public class Principal {

    /**
     * Submenu Triângulo.
     *
     */
    public static void menuTriangulo() {
        //Variável do scanner para entrada dos dados
        Scanner sc = new Scanner(System.in);

        //Variáveis do problema, que são preenchidas e manipuladas pelo menu.
        double base = 0;
        double altura = 0;
        double area = 0;

        //Armazena opção lida
        int opcao = -1;
        while (opcao != 99) {
            //Realiza a leitura da opção
            System.out.print("\n\t### Menu de Opções - Triângulo ###\n"
                    + " 1- Leitura dos dados\n"
                    + " 2- Impressão dos dados\n"
                    //Outras opções vão aqui
                    + " 3- Calcular área\n"
                    + "99- Sair\n"
                    + "Digite a opção desejada:");
            //Realiza a leitura da opção
            opcao = sc.nextInt();
            //Verifica a opção
            switch (opcao) {
                case 1: {
                    System.out.print("\nDigite a base do triângulo:");
                    base = sc.nextDouble();
                    System.out.print("Digite a altura do triângulo:");
                    altura = sc.nextDouble();
                    break;
                }
                case 2: {
                    System.out.println("\nO triângulo tem base: " + base + " e altura:" + altura);
                    break;
                }
                case 3: {
                    area = (base * altura) / 2.0;
                    System.out.println("\nA área do triângulo: " + area);
                    break;
                }
                //Opção de saída do programa
                case 99: {
                    System.out.println("Saindo do submenu - triângulo");
                    break;
                }
                //Opção inválida do submenu
                default: {
                    System.out.println("Opção inválida!");
                    break;
                }
            }//Fim Swtich
        }//Fim While
    }//Fim MenuTriangulo

    /**
     * Submenu Retângulo.
     *
     */
    public static void menuRetangulo() {
        //Variável do scanner para entrada dos dados
        Scanner sc = new Scanner(System.in);

        //Variáveis do problema, que são preenchidas e manipuladas pelo menu.
        double base = 0;
        double altura = 0;
        double area = 0;

        //Armazena opção lida
        int opcao = -1;
        while (opcao != 99) {
            //Realiza a leitura da opção
            System.out.print("\n\t### Menu de Opções - Retângulo ###\n"
                    + " 1- Leitura dos dados\n"
                    + " 2- Impressão dos dados\n"
                    //Outras opções vão aqui
                    + " 3- Calcular área\n"
                    + "99- Sair\n"
                    + "Digite a opção desejada:");
            //Realiza a leitura da opção
            opcao = sc.nextInt();
            //Verifica a opção
            switch (opcao) {
                case 1: {
                    System.out.print("\nDigite a base do retângulo:");
                    base = sc.nextDouble();
                    System.out.print("Digite a altura do retângulo:");
                    altura = sc.nextDouble();
                    break;
                }
                case 2: {
                    System.out.println("\nO retângulo tem base: " + base + " e altura:" + altura);
                    break;
                }
                case 3: {
                    area = (base * altura);
                    System.out.println("\nA área do retângulo: " + area);
                    break;
                }
                
                //Opção de saída do programa
                
                case 99: {
                    System.out.println("Saindo do submenu - retângulo");
                    break;
                }
                //Opção inválida do submenu
                default: {
                    System.out.println("Opção inválida!");
                    break;
                }
            }//Fim Swtich
        }//Fim While
    }//Fim MenuRetangulo

    public static void main(String[] args) {

        //Variável do scanner para entrada dos dados
        Scanner sc = new Scanner(System.in);

        //Armazena opção lida
        int opcao = -1;
        while (opcao != 99) {
            System.out.print("\n\t### Menu de Opções ###\n"
                    + " 1- Triângulo\n"
                    + " 2- Retângulo\n"
                    
                    //Outras opções vão aqui  
                    
                    + "99- Sair\n"
                    + "Digite a opção desejada:");
            //Realiza a leitura da opção
            opcao = sc.nextInt();

            //Verifica a opção
            switch (opcao) {
                case 1: {
                    menuTriangulo();
                    break;
                }
                case 2: {
                    menuRetangulo();
                    break;
                }

                //Outras opções vão aqui
                
                //Opção de saída do programa
                case 99: {
                    System.out.println("\nSaindo do programa - principal");
                    break;
                }
                //Opção inválida do menu
                default: {
                    System.out.println("\nOpção inválida!");
                    break;
                }
            }//Fim Switch
        }//Fim While
    }//Fim Main
}
