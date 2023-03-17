package programacao1;

import java.util.Scanner;

public class Media {

    public static void main(String[]args) {
        //TODO auto-generated method stub
        Scanner sc= new Scanner(System.in);
        double media,nota1,nota2,nota3;
        System.out.println("Digite a nota 1");
        nota1=Double.parseDouble(sc.nextLine());
        System.out.println("Digite a nota 2");
        nota2=Double.parseDouble(sc.nextLine());
        System.out.println("Digite a nota 3");
        nota3=Double.parseDouble(sc.nextLine());
        double nota31 = 0;
		media=(nota1+nota2+nota31) / 2.0;
        System.out.println("A sua média é:"+ media);
        sc.close();
        
        
    }

}		
   