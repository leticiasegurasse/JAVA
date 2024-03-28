package aplicacao;

import entidades.Ingresso;
import entidades.IngressoVIP;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        int opcao;
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja comprar o ingresso 1-VIP ou 2-NORMAL: ");
        opcao = sc.nextInt();

        IngressoVIP ingressoVip = new IngressoVIP(1, "27/03/2024", 100, 30);
        Ingresso ingresso = new Ingresso(2, "24/03/2024", 100);

        if(opcao == 1){
            ingressoVip.imprimir();
        }else{
            ingresso.imprimir();
        }


        sc.close();
    }
}
