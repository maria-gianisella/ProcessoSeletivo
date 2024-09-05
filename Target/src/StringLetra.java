import java.util.Scanner;

public class StringLetra {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a string: ");
        String str = input.nextLine();

        char letra = "a".charAt(0);

        System.out.println("A letra " + letra + " aparece " + contaLetra(str.toLowerCase(), letra) + " vezes na string " + str);

        input.close();
    }

    public static int contaLetra(String str, char letra) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letra) {
                count++;
            }
        }
        return count;
    }
}
