import java.util.Scanner;

/**
 * at_2
 */
public class at_2 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("insira a frase ");

        String f = x.nextLine();

        int contar = 0;

        for(int i=0;i<f.length();i++){
            if(f.charAt(i)=='a' || f.charAt(i) == 'A'){
                contar++;
            }
        }
        System.out.println("a letra A aparece "+contar+" vezes");

    }
}