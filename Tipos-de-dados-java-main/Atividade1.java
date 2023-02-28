import java.util.Scanner;

public class Atividade1 {

    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int num;
    System.out.println("informe o valor da variável");
    num = input.nextInt();

    if(num >= 0){
        System.out.print("Positivo");
    } 
    else
    {System.out.print( "Negativo");}
    }
}
