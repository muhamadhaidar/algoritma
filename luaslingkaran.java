import java.util.Scanner;

public class luaslingkaran {
    public static void main(String[] args) {
        // Deklarasikan Dulu Variabelnya
        Double luas, Pi;
        Pi = 3.14;

        // Masukan Inputan nya
        Scanner getInput = new Scanner(System.in);
        System.out.print("Masukan Jari Jari Lingkaran = ");
        String myInput = getInput.nextLine();
        // Rubah dari String ke Integer;
        Integer result = Integer.valueOf(myInput);

        // Rumus / Proses
        luas = Pi * result * result;

        // Hasilnya
        System.out.println("Luas Lingkaran adalah = " + luas);
    }
}
