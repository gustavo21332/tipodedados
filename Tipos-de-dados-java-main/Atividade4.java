import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double peso,alt,imc;

        System.out.println("informe seu peso");
        peso = input.nextDouble();

        System.out.println("informe sua altura");
        alt = input.nextDouble();

        imc = peso / (alt * alt);

        if(imc ){
            System.out.print("Abaixo do peso");
        }
    
    }   
}