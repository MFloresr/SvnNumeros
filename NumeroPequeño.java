import java.util.Scanner;

public class NumeroPequeño {

	private static final int CantidadNumeros = 10;
	private static Scanner lector;

	public static void main(String[] args) {
		int numero;
		int pequeño;
		int grande=0;
        lector = new Scanner(System.in);
        System.out.println("Introduce 10 Numeros : ");
        pequeño = lector.nextInt();
	//pedimos los 10 numeros projecto1
        for (int i=0;i < CantidadNumeros-1 ;i++){
                numero = lector.nextInt();
                if (numero < pequeño){
                        pequeño=numero;
                }if(numero > grande){
                	grande=numero;
                }
        }
        System.out.println("El numero mas pequeño introducido es : "+pequeño);
        System.out.println("El numero mas pequeño introducido es : "+grande);

	}

}
