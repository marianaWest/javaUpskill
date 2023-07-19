package Aula13.ex3;

import Aula13.ex1.Pessoa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaBancaria {
    private String nome;
    private int numero;
     List<Movimento> movimentos = new ArrayList<>();

    public ContaBancaria(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public ContaBancaria(String nomeFicheiro) {
        try {
            Scanner scannerFile = new Scanner(new File(nomeFicheiro));
            while (scannerFile.hasNextLine()) {
                String line = scannerFile.nextLine();
                String[] contas = line.split(";");
                this.nome = contas[0];
                this.numero = Integer.parseInt(contas[1]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void addMovimento(Movimento movimento) {
    movimentos.add(movimento);
}

    }

