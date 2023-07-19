package Aula13.TA.ex1;

public class Main {
    public static void main(String[] args) {
        Carro um = new Carro("BB-11-22", "João Silva", "Motor", 1000.00);
        Carro dois = new Carro("CC-11-22", "Maria do Carmo", "Vidro", 100.00);
        Carro tres = new Carro("DD-11-22", "Manuel Damásio", "Pára-choques", 500.00);
        Carro quatro = new Carro("EE-11-22", "Vitor Pereira", "Embraiagem", 500.00);

        Servicos servicos = new Servicos();

         servicos.addServico(um);
         servicos.addServico(dois);
         servicos.addServico(tres);
         servicos.addServico(quatro);

      servicos.getServicos();
      servicos.gerarFicheiroServicos();

    }
}
