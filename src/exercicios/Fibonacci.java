package exercicios;

public class Fibonacci {

    public static void main(String[] args) {
        long ni = 0; //num inicial
        long np = 1; //prox num
        long transf = ni; //transferir ni para np

        long numEscolhido = 6765; //numero escolhido para avaliacao

        System.out.printf("Sequência: %d, %d, ", ni, np);

        while(true) {
            //faz substituicoes
            transf = ni;
            ni = np;
            np += transf;

            if(np == numEscolhido) { //se o prox numero for = ao escohido
                System.out.println(numEscolhido); //concatena na seq
                System.out.println("\n" + numEscolhido + " está na sequência");
                break;
            } else if(np > numEscolhido) { //se prox numero > q valor escolhido
                System.out.println("\n\n" + numEscolhido + " NÃO está sequência");
                break;
            }

            System.out.print(np + ", "); //print prox numero (np)

        }

    }

}