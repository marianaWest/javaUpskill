package Aula5;

public class Aula5 {

    public static String imprimirVetor(int[] v) {
        String ret = "[";
        for(int i = 0; i < v.length - 1; i++) {
            ret += v[i] + ", ";
        }
        return ret + v[v.length-1] + "]";
    }


    //1. crie uma funcao para obter a primeira metade de um vetor, incluindo um parametro booleano para indicar
    // se o elemento do meio e para incluir, caso o vetor seja impar. se o comprimento for par, este parametro
    // nao tera efeito
   public static int[] copy(int[] v, boolean include) {
        int newVLength;
       if (v.length % 2 == 0 || !include) {
           newVLength = v.length/2;
           } else {
          newVLength = v.length/2 + 1;
           }

    int newV[] = new int[newVLength];
     for (int i = 0; i <newVLength ; i++) {
        newV[i] = v[i];

       }        return newV;
   }

       // public static int[] firstHalf(int[] v, boolean include) {
       // }


       //2. funcao que constroi um vetor juntando dois vetores
       public static int[] merge ( int[] v1, int[] v2){
           int newV[] = new int[v1.length + v2.length];
           for (int i = 0; i < v1.length; i++) {
               newV[i] = v1[i];
           }
           // pode ser i
           for (int k = v1.length; k < newV.length; k++) {
               newV[k] = v2[k - v1.length];
           }
           return newV;
       }

       // 3. funcao que cria novo vetor com a ordem inversa
    // assim esta certo, mas dá para criar outra variável de iteracao inversa j = v.length - 1 e dentro do for loop fazer j--
    // e newV[i] = v[j];
       public static int[] invert ( int[] v){
           int newV[] = new int[v.length];
           for (int i = 0; i < v.length; i++) {
               newV[i] = v[v.length - 1 - i];
           }
           return newV;
       }

       // 4. funcao que retorna vetor com elementos duplicados
    // da para juntar em um so for loop e dá para fazer *2 em vez de /2
       public static int[] duplicateEveryElement ( int[] v){
           int newV[] = new int[v.length * 2];
           for (int i = 0; i < newV.length; i += 2) {
               newV[i] = v[i / 2];
           }
           for (int i = 1; i < newV.length; i += 2) {
               newV[i] = v[i / 2];
           }
           return newV;
       }

       // 5. funcao que cria vetor com primeira parte igual e segunda parte inversa
       public static int[] duplicateInverted ( int[] v){
           int newV[] = new int[v.length * 2];
           for (int i = 0; i < v.length; i++) {
               newV[i] = v[i];
           }
           for (int i = v.length; i < newV.length; i++) {
               newV[i] = v[newV.length - i - 1];
           }
           return newV;
       }

       // return merge(vetor, invert(vetor))

       // 6. funcao que cria vetor com base em outro, representando uma cópia sem o elemento do meio caso o tamanho seja
       //impar

       public static int[] copyWithoutMiddleElement ( int[] v){
           int newV[] = new int[v.length - 1];
           if (v.length % 2 == 0) {
               return v;
           } else {
               int middle = (int) v.length / 2;
               for (int i = 0; i < middle; i++) {
                   newV[i] = v[i];
               }
               for (int i = middle; i < newV.length; i++) {
                   newV[i] = v[i + 1];
               }
           }
           return newV;
       }

// 7. fibonacci

       public static int[] fibonacciSequence ( int n){
           int[] fibonacci = new int[n];
           if (n <= 1) {
               fibonacci[0] = 0; // First Fibonacci number is 0
           }
           if (n >= 2) {
               fibonacci[1] = 1; // Second Fibonacci number is 1
           }
           if (n >= 3) {
               for (int i = 2; i < n; i++) {
                   fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]; // Calculate the next Fibonacci number
               }
           }
           return fibonacci;
       }




       public static void main (String[]args){
           int[] vetor = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
           int[] v1 = new int[]{1, 2};

           System.out.println(imprimirVetor(copy(vetor, true)));

           System.out.println(imprimirVetor(merge(v1, vetor)));
           System.out.println(imprimirVetor(invert(vetor)));
           System.out.println(imprimirVetor(duplicateEveryElement(vetor)));
           System.out.println(imprimirVetor(duplicateInverted(vetor)));
           System.out.println(imprimirVetor(copyWithoutMiddleElement(vetor)));
           System.out.println(imprimirVetor(fibonacciSequence(8)));
       }
   }


