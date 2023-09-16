package br.com.questao1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Stack pilha = new Stack();

        Scanner ler = new Scanner(new File("frases.txt"));
        while (ler.hasNextLine()) {
            pilha.push(ler.nextLine());
        }
        for (int i = 0; i <= 9; i++) {

                System.out.println(pilha.pop());
        }

        while(!pilha.empty()) {
            pilha.pop();
        }

        System.out.println("Pilha zavia " + pilha.size());
    }
}