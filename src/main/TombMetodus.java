package main;

public class TombMetodus {

    private static int[] tomb;
    private static String kiiras;
    private static int veletlenszam;

    public static void main(String[] args) {
       
        tombFeltolt(tomb);
        veletlenSzamok(veletlenszam);
        kiIratas(kiiras);

    }

    private static int[] tombFeltolt(int []tomb) {
        //fel kell tolteni a tombet
        tomb = new int[ (veletlenSzamok(veletlenszam))];
        kiIratas(kiiras);
        return tomb;
               
    }

    private static int veletlenSzamok(int veletlenszam) {
        //véletlenszám generátor
        veletlenszam = (int) (Math.random() * 10);
        kiIratas(kiiras);
        return veletlenszam;
   
    }

    private static String kiIratas(String kiiras) {
        //kiirás
        System.out.println(kiiras);
        return kiiras;
    }
   
    //vane bene prim
   
 
}
