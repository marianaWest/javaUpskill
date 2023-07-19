package Aula13.ex3;

import Aula13.ex1.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {

    List<Movimento> movimentos = new ArrayList<>();
    public void addMovimento(Movimento movimento) {
    movimentos.add(movimento);
}

}
