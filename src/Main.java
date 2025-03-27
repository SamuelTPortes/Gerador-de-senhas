import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number, upperCaseLetters, specialCharacters, password = "";
        int charactersAmount;
        System.out.println("Bem vindo ao gerador de senhas automático! \nApós essa mensagem serão feitas perguntas para a geração de senhas da sua preferência\nObs: Por padrão as senhas já são geradas com letras minúsculas!");
        System.out.println("Quantos caracteres você deseja?");
        charactersAmount = sc.nextInt();
        System.out.println("Você quer que a sua senha seja gerada com letras Maiúsculas?\nEscreva 'Sim' ou 'Não");
        upperCaseLetters = sc.next();
        if(Objects.equals(upperCaseLetters, "Sim")) System.out.println("Você digitou Sim");else System.out.println("Você digitou Não");
        System.out.println("Você quer que a sua senha seja gerada com números?\nEscreva 'Sim' ou 'Não");
        number = sc.next();
        System.out.println("Você quer que a sua senha seja gerada com caracteres especiais? Ex: %$#@!&*()_-=+ \nEscreva 'Sim' ou 'Não");
        specialCharacters = sc.next();

        for(int i = 1; i <= charactersAmount; i++){
            password += escolherLetraAleatoria();
            System.out.println(password);
        }
    }

    public static String escolherLetraAleatoria(){
        String[] letters = {"a","b","c","d","e"};
        String chosedLetter = "";
        int random = new Random().nextInt(letters.length);
        chosedLetter = letters[random];
        return chosedLetter;
    }
}