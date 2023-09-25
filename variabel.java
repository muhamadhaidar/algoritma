import java.util.Scanner;

public class variabel {
    public static void main(String[] args) {
        // Variabel adalah tempat untuk menyimpan Suatu Nilai;
        // Type adata Adalah Bentuk Sebuah Nilai

        // Char, Integer, Float, Double, String, Boolean;
        // Integer bilangan = 10;
        // Double angka = 2.1;
        // String name = "Rizwan Gustama";
        // Boolean bool = false;


        Double luas, Pi;

        // Scanner angka = new Scanner(System.in);
        // System.out.print("Enter Name : ");
        // String username = angka.nextLine();
        // System.out.println(username);
        Pi = 3.14;

        Scanner myJariJari = new Scanner(System.in);
        System.out.print("Masukan Jari Jari = ");
        String r = myJariJari.nextLine();
        Integer result = Integer.valueOf(r);

        luas = Pi * result * result;
        
        System.out.println(luas);
        
        // Pi = 3.14;
        // r = 18;

        // luas = Pi * r * r;

        

        // System.out.println("Luasnya Adalah = " + luas);
       
    }
}
