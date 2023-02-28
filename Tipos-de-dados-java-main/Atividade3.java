import java.util.Scanner;

public class Atividade3 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Double sa,sn;

        System.out.println("informe seu salário");
        sa = input.nextDouble();

        if(sa >= 1000 && sa <= 2000){
            sn = sa * 1.15;
            System.out.print("salário novo" + sn);
        }
        else if(sa >= 2000 && sa <= 3000){
            sn = sa * 1.10;
            System.out.print("salário novo" + sn);
        }
        else{
            sn = sa * 1.05;
            System.out.print("salário novo" + sn);
        }

    }
    
}
