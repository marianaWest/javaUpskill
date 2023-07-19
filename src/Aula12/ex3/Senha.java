package Aula12.ex3;

public class Senha {
   private int nSenha;
   private String nomeUtilizador;
   private int NIF;

   public Senha(int nSenha, String nomeUtilizador, int NIF) {
      this.nSenha = nSenha;
      this.nomeUtilizador = nomeUtilizador;
      this.NIF = NIF;
   }

   public int getnSenha() {
      return nSenha;
   }

   public void setnSenha(int nSenha) {
      this.nSenha = nSenha;
   }

   public String getNomeUtilizador() {
      return nomeUtilizador;
   }

   public void setNomeUtilizador(String nomeUtilizador) {
      this.nomeUtilizador = nomeUtilizador;
   }

   public int getNIF() {
      return NIF;
   }

   public void setNIF(int NIF) {
      this.NIF = NIF;
   }

   @Override
   public String toString() {
      return "Senha{" +
              "nSenha=" + nSenha +
              ", nomeUtilizador='" + nomeUtilizador + '\'' +
              ", NIF=" + NIF +
              '}';
   }
}
