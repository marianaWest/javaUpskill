package Aula13.TA.ex1;

import Aula13.ex3.Movimento;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Servicos {
    List<Carro> servicos = new ArrayList<>();

    public void addServico(Carro carro) {
        servicos.add(carro);
    }

    public void getServicos() {
        for(Carro servico: servicos) {
            System.out.println(servico);
        }
     }

     public void gerarFicheiroServicos() {
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter("ficheiros/servicos.txt", false));
            printWriter.println("Carro;Cliente;Reparação;Valor");
            for (int i = 0; i < servicos.size(); i++) {
                printWriter.println(servicos.get(i));
            }
            printWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
     }

}
