
/*
O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays,
uma estrutura de dados que armazena uma coleção de dados em um bloco de memória.

Você está desenvolvendo um sistema para um local de eventos, neste local, 
é necessário que a entrada seja permitida apenas para pessoas acima de 18 anos. 
Faça um programa para ler um número N, a idade de N pessoas. Depois disso, 
coloque a idade mínima permitida  para se entrar no local, conforme exemplo.


Retorne às idades de quem não puder entrar.               

                                                                                                             

 Entrada                                                                    

                                                                 
 4                                                                

18

22

15

50                                                                  


Saída

Nao poderao entrar as idades:

4

15

 */



package projeto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //a classe Scanner auxilia na leitura dos dados de entrada
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();

        }

        int[] idade = new int[n];

        System.arraycopy(array, 0, idade, 0, n);

        System.out.println("Nao poderao entrar as idades: ");
        for (int j = 0; j < n; j++) {
            if (idade[j] < 18) {
                System.out.println(idade[j]);
            }

        }

    }

}
