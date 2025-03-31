import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number, upperCaseLetters, specialCharacters, password = "";
        int charactersAmount;
        System.out.println("Bem vindo ao gerador de senhas automático! \nApós essa mensagem serão feitas perguntas para a geração de senhas da sua preferência\nObs: Por padrão as senhas já são geradas com letras minúsculas!");

        System.out.println("Quantos caracteres você deseja?");
        charactersAmount = sc.nextInt();

        System.out.println("Você quer que a sua senha seja gerada com letras Maiúsculas?\nEscreva 'S' ou 'N");
        upperCaseLetters = sc.next();

        System.out.println("Você quer que a sua senha seja gerada com números?\nEscreva 'S' ou 'N");
        number = sc.next();

        System.out.println("Você quer que a sua senha seja gerada com caracteres especiais? Ex: %$#@!&*()_-=+ \nEscreva 'S' ou 'N");
        specialCharacters = sc.next();

        for(int i = 1; i <= charactersAmount; i++){
            password += escolherLetraAleatoria(Objects.equals(upperCaseLetters, "S"),Objects.equals(number, "S"),Objects.equals(specialCharacters, "S"));
            System.out.println(password);
        }

        System.out.println("Sua senha final é: \n" + password);
    }

    public static String escolherLetraAleatoria(boolean uppercase, boolean numbers, boolean special){
        String[] letters = "abcdefghijklmnopqrstuvwxyz".split("");
        String[] lettersUpperCase = "abcdefghijklmnopqrstuvwxyz".toUpperCase().split("");
        String[] numberArray = "0123456789".split("");
        String[] specialCharacters = "!@#$%&*-_=+".split("");

        String[][] types = {letters,lettersUpperCase,numberArray, specialCharacters};

        ArrayList<String[]> typesList = new ArrayList<>(Arrays.asList(types));

        String chosedLetter;

                if(!uppercase) {
                    typesList.remove(lettersUpperCase);
                }
                if(!numbers){
                    typesList.remove(numberArray);
                }
                if(!special){
                    typesList.remove(specialCharacters);
                }

        types = typesList.toArray(new String[typesList.size()][]);

        int randomType = new Random().nextInt(types.length);
        String[] arraychosed = types[randomType];
        int random = new Random().nextInt(arraychosed.length);
        chosedLetter = arraychosed[random];

        return chosedLetter;
    }
}