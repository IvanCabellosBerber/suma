import java.util.Scanner;

public class SumaEnters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");

        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        while(num != -1){
            String numString = String.valueOf(num);

            int suma = 0;
            for (int i = 0; i < numString.length(); i++) {
                int valorActual = Integer.parseInt(String.valueOf(numString.charAt(i)));
                suma = suma + valorActual;
            }
            System.out.println(suma);
            System.out.print("Introduce un número: ");
            num = sc.nextInt();
        }

    }

}
