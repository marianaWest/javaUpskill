package aula4;

public class Aula4 {

    public static boolean countains(int a, int v[]) {
        for(int i = 0; i < v.length; i++) {
            if (v[i] == a)
                return true;
        }
        return false;
    }

    public static int maxN(int vet[]) {
        int maxN = vet[0];
        for(int i = 1; i < vet.length; i++) {
            if(vet[i] > maxN)
                maxN = vet[i];
        }
        return maxN;
    }

    public static void main(String[] args) {
/*
        int i = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            } i++;
        }

        int j = 0;
        do {
            if (j % 2 == 0) {
                System.out.println(j);

            }  j++;
        } while (j <= 20);



        for (int l = 0; l <= 20; l++) {
            if (l % 2 == 0) {
                System.out.println(l);
            }
        }

*/
        int[] v = new int[3];
        v[0] = 1;
        v[1] = 2;
        v[2] = 3;
        // or int[] = {1, 2, 3};
        System.out.println(countains(2, v));

        int[] vet = {2, 10, 5, 3};
        System.out.println(maxN(vet));
    }
}
