import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataTypes{
 public static void main(String[] args){

 Scanner cin = new Scanner(System.in);

 String namaDepan = "Fathulloh";
 String namaTengah = "F";
 String namaBelakang = "H";
 int usia = 21;
 int targetTahunKuliah = 4;
 double ipk = 3.89764512;
 char nilaiAbjad = 'A';
 boolean tampan = true;

 System.out.print("Input Nama Depan :");
 namaDepan = cin.nextLine();
 System.out.print("Input Nama Tengah :");
 namaTengah = cin.nextLine();
 System.out.print("Input Nama Belakang :");
 namaBelakang = cin.nextLine();
 System.out.print("Input Usia : ");
 usia = cin.nextInt();
 System.out.print("Input IPK: ");
 ipk = cin.nextDouble();
 System.out.print("");
 System.out.print("Input Nilai Abjad : ");
 nilaiAbjad = cin.next().charAt(0);
 System.out.print("Tampan? : ");
 tampan = cin.nextBoolean();

 System.out.println("~~~~~~~~~~OUTPUT~~~~~~~~~~~");
 System.out.println("Nama depan : " + namaDepan);
 System.out.println("Nama tengah : " + namaTengah);
 System.out.println("Nama belakang: " + namaBelakang);
 System.out.println("Usia : " + usia);
 System.out.println("Target Kuliah : " + targetTahunKuliah + " tahun");
 System.out.println("IPK : " + ipk);
 System.out.println("Nilai PBO : " + nilaiAbjad);
 System.err.println("Tampan : " + tampan);

 JOptionPane.showMessageDialog(null,"Hai, " + namaDepan + namaTengah + namaBelakang);

 }
}