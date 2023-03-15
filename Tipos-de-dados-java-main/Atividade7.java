import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia;

        System.out.println("informe o número inteiro");
        dia = input.nextInt();

        if(dia == 1){
            System.out.print("1 corresponde a segunda-feira");
        }else if(dia == 2){
            System.out.print("2 corresponde a terça-feira");
        }else if(dia == 3){
            System.out.print("3 corresponde a quarta-feira");
        }else if(dia == 4){
            System.out.print("4 corresponde a quinta-feira");
        }else if(dia == 5){
            System.out.print("5 corresponde a sexta-feira");
        }else if(dia == 6){
            System.out.print("6 corresponde a sábado");
        }else if(dia == 7){
            System.out.print("7 corresponde a domingo");

        }
    }
}