import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra e descubra quantos 'a'(s) ela tem: ");

        String palavra = sc.next();

       // System.out.print(palavra.contains("a"));

        int x=0;
        for (int i = 0; i < palavra.length() ; i++) {
            if(palavra.toLowerCase().charAt(i) == 'a')
                x++;
        }
        System.out.println(x);

    }
}