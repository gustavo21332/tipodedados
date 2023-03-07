import java.util.Scanner;


public class Atividade6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome1,nome2;
        int idade1,idade2;

        System.out.println("informe o primeiro nome");
        nome1 = input.next();

        System.out.println("Informe a primeria idade");
        idade1 = input.nextInt();

        System.out.println("informe o segundo nome");
        nome2 = input.next();

        System.out.println("Informe a segunda idade");
        idade2 = input.nextInt();

        if(idade1 > idade2){
            System.out.print("Ele é o mais velho entre os dois:" + nome1);
        }else if(idade2 > idade1){
            System.out.print("Ele é o mais velho entre os dois:" + nome2);


        }


    }
}
