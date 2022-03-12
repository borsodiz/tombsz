package hu.progmatic;

public class Main {

    public static void main(String[] args) {

        int [] szamok = {1, 6, 8, 9};

        int index =0;
        System.out.print("[");

       for (int i =0; i< szamok.length-1; i++) {
           System.out.print(szamok[index]);

           index ++;
           System.out.print(",");

       }
        System.out.print(szamok[szamok.length-1]);
        System.out.print("]");

    }
}
