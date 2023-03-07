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

        if(imc <= 18.5){
            System.out.print("Abaixo do peso");
            System.out.printf("Seu IMC é : " + imc);
        }else if(imc >= 18.5 && imc <= 24.9){
            System.out.print("Peso normal");
            System.out.printf("Seu IMC é" + imc);
        }else if(imc >= 25.0 && imc <= 29.9){
            System.out.print("Sobrepeso");
            System.out.printf("Seu IMC é" + imc);
        }else if(imc >= 30.0 && imc <= 34.9){
            System.out.print("Obesidade grau 1");
            System.out.printf("Seu IMC é" + imc);
        }else if(imc >= 35.0 && imc <= 39.9){
            System.out.print("Obesidade grau 2");
            System.out.printf("Seu IMC é" + imc);
         }else{
            System.out.print("Obesidade grau 3");
            System.out.printf("Seu IMC é" + imc);

         }
    
    }   
}