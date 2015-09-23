import java.util.Scanner;

public class NumeroPequeño {

	private static Scanner lector;

	public static void main(String[] args) {
		int numero,pequeño;
        lector = new Scanner(System.in);
        System.out.println("Introduce 5 Numero : ");
        pequeño = lector.nextInt();
        for (int i=0;i < 4 ;i++){
                numero = lector.nextInt();
                if (numero < pequeño){
                        pequeño=numero;
                }
        }
        System.out.println("El numero mas pequeño es introducido es : "+pequeño);

	}

}
