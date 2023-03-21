import java.util.Scanner;

public class aulateste3 {

	public static void main(String[] args) {
	
		
	Scanner sc = new Scanner(System.in);
	
	
	
	
	
	
	
	
	
	System.out.println("Informe o tipo de Combustível!!!");

	String combustivel = sc.nextLine();
	
	System.out.println("Informe a capacidade do tanque");
	double capacidadeTanque = sc.nextDouble();
	
	
	
    if (combustivel.equalsIgnoreCase("G")) {
    	double valorPago = capacidadeTanque * 3.79;
    	System.out.println("O valor pago na gasolina"+ valorPago);

    	
    	System.out.println("Gasolina");
		
	} else {
		double valorPago = capacidadeTanque * 2.90;
    	System.out.println("O valor pago na alcool"+ valorPago);
       
	
	}
	
	
	
	
   
		

	}

}
