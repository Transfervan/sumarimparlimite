package sumarimparlimite;

import java.util.Scanner;

public class sumarimparlimite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese un número 1");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		System.out.println("Ingrese un número 2");
		int n2 = sc.nextInt();
		
		int i = 0;
		//
		
	    int sumar = 0; 
// se hace ciclo desde numero 1 ingresado hasta numero 2 ingresado
	    // al no ser par, else es impar y se suma..
		for (i = n1; i <= n2; i++ ) {
			
            if (i % 2 == 0) {
            }
            else
            	sumar = sumar + i;
                
		}
	
	System.out.println(sumar);
}
}
          

            
            