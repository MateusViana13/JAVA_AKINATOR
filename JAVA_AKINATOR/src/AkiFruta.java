import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;



public class AkiFruta {
    public static void main(String[] args) {
        // Inicialização de objetos e variáveis
        Scanner scan = new Scanner(System.in);                     // Objeto para entrada de dados
        Random rand = new Random();                                // Gerador de números aleatórios
        BancoDados db = new BancoDados();                          // Objeto para acessar o banco de dados
        String[] perguntas = db.ImportarPergunta();                // Carrega perguntas do banco de dados
        ArrayList<Fruta> frutas = db.ImportarFrutas();             // Carrega frutas do banco de dados
        Map<String, String> mapeamento = db.ImportarMapeamento();  // Carrega mapeamento do banco de dados

        // Mensagem de boas-vindas e instruções para o jogador
        System.out.println("\n\nBem vindo ao jogo Akinator de Fruta!\n\nPense em uma fruta e irei advinhar!\n\nReponda às perguntas seguindo o modelo:\n\n1. Sim\n2. Provavelmente Sim\n3. Talvez\n4. Provavelmente Não\n5. Não\n\nPressione Enter para iniciar...");
        scan.nextLine(); // Aguarda o usuário pressionar Enter para continuar
        
        boolean flag = false; // Variável de controle fim de jogo
        // Loop externo que permite até duas rodadas de perguntas
        for (int i = 1; i <= 2 && !flag; i++) {
            
            // Loop interno para fazer até 15 perguntas em cada rodada
            for (int j = 0; j < 15; j++) {
                int index = rand.nextInt(perguntas.length); // Gera um índice de pergunta aleatório
                int respostaNumerica = 0;                   // Inicializa a resposta do usuário
                
                // Loop para garantir que a resposta seja entre 1 e 5
                while (respostaNumerica < 1 || respostaNumerica > 5) {
                    System.out.println("\n" + perguntas[index]); // Exibe a pergunta
                    System.out.print("Resposta: ");            // Exibe "Resposta:"
                    respostaNumerica = scan.nextInt();           // Lê a resposta do usuário
                    // Verifica se a resposta está fora do intervalo válido
                    if (respostaNumerica < 1 || respostaNumerica > 5) {
                        System.out.println("\nPor favor, digite um número entre 1 e 5.\n1. Sim\n2. Provavelmente Sim\n3. Talvez\n4. Provavelmente Não\n5. Não");
                    }
                }

                // Verifica se a resposta não é "Talvez"
                if (respostaNumerica != 3) {

                    // Loop sobre todas as frutas
                    for (Fruta fruta : frutas) {
                        String nomeMetodo = mapeamento.get(perguntas[index]); // Obtém o nome do método
                        Method metodo = null;

                        // Encontra o método correspondente na classe Fruta
                        for (Method m : fruta.getClass().getDeclaredMethods()) {
                            if (m.getName().equals(nomeMetodo)) {
                                metodo = m;
                                break;
                            }
                        }

                        try {
                            // Chama o método e obtém a resposta esperada para a pergunta
                            Boolean respostaMapeamento = (Boolean) metodo.invoke(fruta);

                            // Atualiza os pontos da fruta com base na resposta do usuário
                            switch (respostaNumerica) {
                                case 1:
                                    if (respostaMapeamento)
                                        fruta.addPontos(2);
                                    else
                                        fruta.subPontos(2);
                                    break;
                                case 2:
                                    if (respostaMapeamento)
                                        fruta.addPontos(1);
                                    else
                                        fruta.subPontos(1);
                                    break;
                                case 4:
                                    if (!respostaMapeamento)
                                        fruta.addPontos(1);
                                    else
                                        fruta.subPontos(1);
                                    break;
                                case 5:
                                    if (!respostaMapeamento)
                                        fruta.addPontos(2);
                                    else
                                        fruta.subPontos(2);
                                    break;
                            }
                        } catch (IllegalAccessException e) {
                            e.printStackTrace(); // Trata exceção de acesso ilegal
                        } catch (InvocationTargetException e) {
                            e.printStackTrace(); // Trata exceção de invocação de método
                        }
                    }
                }

                // Remove a pergunta já feita do array de perguntas
                String[] novoArray = new String[perguntas.length - 1];
                System.arraycopy(perguntas, 0, novoArray, 0, index);
                System.arraycopy(perguntas, index + 1, novoArray, index, perguntas.length - index - 1);
                perguntas = novoArray;
            }


            Fruta frutaEncontrada = new Fruta(); //Declarando um objeto de fruta vazio           
            int maior = frutas.get(0).getPontos(); // Inicializa variável para acompanhar a maior pontuação
            frutaEncontrada =frutas.get(0);  //atribuindo o valor da fruta auxiliar como a primeira fruta da lista

            // Encontra a fruta com a maior pontuação
            for (Fruta fruta : frutas) {
                System.out.println(fruta.getPontos());  // Exibe os pontos de cada fruta

                if (fruta.getPontos() > maior) {
                    frutaEncontrada = fruta;//atribuindo o valor da fruta auxiliar como a fruta com maior pontuação                  
                    maior = fruta.getPontos();  // Atualiza a maior pontuação
                }            
            }

            if (maior == 0)
                frutaEncontrada.setNome("batata");// Define um nome padrão se todas as pontuações forem zero

            // Pergunta ao usuário se a fruta adivinhada é correta
            System.out.print("\nSua fruta é... " + frutaEncontrada.getNome() + "!\nAcertei?\n1. Sim\n2. Não\nResposta: ");
            int respostaNumerica = scan.nextInt();

            // Verifica a resposta do usuário e finaliza o jogo conforme necessário
            if (respostaNumerica == 1) {
                System.out.println("\nEu ganhei!");
                flag = true; // Define a flag como verdadeira para encerrar o loop externo
            }

            if(flag == false){
                frutas.remove(frutaEncontrada); //Remove a fruta da lista de opções caso o usuário indique que ela não é a que ele escolheu
            }

            if (i == 2 && !flag)
                System.out.println("\nVocê ganhou!"); // Exibe mensagem de vitória se chegar ao fim do segundo loop externo sem acertar
        }

    }
}