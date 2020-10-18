package br.com.mais1code.ian;

public class Aula2 {
    public static void main(String[] args) {
        // Algoritmo para calcular a média de três números inteiros:

        // ENTRADA: 3 números inteiros
        // PROCESSAMENTO: SOMA DOS 3 VALORES E DIVISAO POR 3
        // SAIDA: MEDIA

        //int, double, boolean, char

        int numero1 = 5;
        int numero2 = 9;
        int numero3 = 3;
        int divisor = 3;

        System.out.println("A média aritmética de " + numero1 + " " + numero2 + " e " + numero3 +" eh: " +
                (numero1+numero2+numero3)/divisor);

        char caractere = '0';
        char caractere1 = 'b';
        System.out.println(caractere + "\n" + caractere1);

        boolean verdadeiro = true; // 1
        boolean falso = false; // 0
        System.out.println(verdadeiro + "\n" + falso);
    }
}
