/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciaprodutos;

import java.util.Scanner;

/**
 *
 * @author android
 */
public class GerenciaProdutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1, numero2,soma;
        
        produto produto1, produto2;
        
        //criem os produtos
        produto1 = new produto();
        produto2 = new produto();
        
        Scanner leitor = new Scanner(System.in);
        
        //objeto para leitura
        System.out.printf("digite o codigo do produto1 ");
        produto1.codigo = leitor.nextInt();
        
        System.out.printf("digite o nome do produto1 ");
        produto1.nome = leitor.next();
        
        System.out.printf("digite a quantidade do produto1 ");
        produto1.quantidade = leitor.nextInt();
        
        System.out.printf("digite o preco do produto1 ");
        produto1.preco = leitor.nextFloat();
        
        System.out.printf("%s custa R$%.2f e possui %d itens", produto1.nome,produto1.preco,produto1.quantidade);
        
        
        
        //objeto para leitura
        /*Scanner leitor = new Scanner(System.in);
        
        System.out.printf("Numero 1: ");
        numero1 = leitor.nextInt();
        
        System.out.printf("Numero 2: ");
        numero2 = leitor.nextInt();
        
        soma = numero1 + numero2 ;
        
        
        System.out.print("a soma é " + soma );
        */
    }
    
}
