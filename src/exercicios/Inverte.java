package exercicios;

import java.util.Scanner;

public class Inverte {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //def obj de fluxo de entrada

        String text = input.nextLine(); //pega um texto
        char[] letters = text.toCharArray(); //transf para array tipo char

        String invertedText = "";

        for(int i = (letters.length -1); i >= 0; --i)  { //percorre de tras pra frente
            invertedText += letters[i]; //concatena
        }

        System.out.println(text + "\ninvertido = \n" + invertedText);

    }
}
