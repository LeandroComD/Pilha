package br.com.questao2;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Random randomico = new Random();
        Queue<Integer> pq = new PriorityQueue<>();
        Scanner ler = new Scanner(new File("ingressos.txt"));

        int aux= 0;
        while(ler.hasNextLine()) {
            pq.add(Integer.parseInt(ler.nextLine()));
        }
        for(int i=0; i<10;i++) {
            System.out.println(pq.remove());
        }


        for (int i=0; i<1; i++){
           aux = randomico.nextInt(pq.size());
        }

        pq.remove(aux);

        System.out.println("Pessoa de Sorteada para conhecer a banda " + aux);
        System.out.println(pq);
    }
}