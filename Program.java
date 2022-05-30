/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package app;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Gustavo Kovaleski Estlin
 */
public class Program {

    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa();
        
        System.out.print("--[CADASTRO DE CLIENTES]--\n");
        System.out.print("\nNome do cliente: ");
        pessoa.setNome(sc.next());
        System.out.print("\nIdade cliente: ");
        pessoa.setIdade(sc.nextInt());
        System.out.print("\nSexo do cliente: "); 
        str = sc.next();
        char c = str.charAt(0);
        pessoa.setSexo(c);
        
        System.out.println("\n--[Endereço]--");
        System.out.print("\nLogradouro: ");
        endereco.setLogradouro(sc.next());
        System.out.print("\nComplemento: ");
        endereco.setComplemento(sc.next());
        System.out.print("\nNumero: ");
        endereco.setNumero(sc.nextInt());
        System.out.print("\nCEP: ");
        endereco.setCEP(sc.next());
        
        pessoa.setEnd(endereco);
        System.out.println("\n\n--[DADOS INSERIDOS]--"+pessoa.toString());
        

    }
}
