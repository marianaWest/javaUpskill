package Aula12.TA.ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Casa {


  private Map<String, List<Eletrodomestico>> eletrodomesticoMap = new HashMap<String,List<Eletrodomestico>>();


    public void inserirEletrodomestico(String divisao, Eletrodomestico eletrodomestico) {
        if(eletrodomesticoMap.containsKey(divisao)) {
            List<Eletrodomestico> eletrodomesticoList = (List<Eletrodomestico>) eletrodomesticoMap.get(divisao);
            eletrodomesticoList.add(eletrodomestico);
        } else {
            List<Eletrodomestico> eletrodomesticoList = new ArrayList<>();
            eletrodomesticoList.add(eletrodomestico);
            eletrodomesticoMap.put(divisao, eletrodomesticoList);
        }
    }

    @Override
    public String toString() {
        return "Casa {" +
                "eletrodomesticoMap = " + eletrodomesticoMap +
                '}';
    }
}
