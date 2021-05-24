public class Main {
    public static void main(String[] args) {
        String namaDepan = "Fathulloh";
        String namaTengah = "Muhammad";
        String namaBelakang = "Idham";
        int usia = 21;
        int targetTahunKuliah = 4;
        double ipk = 3.89764512;
        char nilaiAbjad = 'A';
        boolean tampan = true;

        System.out.println(namaDepan + namaTengah + namaBelakang);

        char[] uniskaChar = { 'U','N','i','S','K','A'};
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);

        String namalengkap = namaDepan + " " + namaTengah + " " + namaBelakang;
        System.out.println(namalengkap.length());
        System.out.println(namalengkap.indexOf("NIS"));
        System.out.println(namalengkap.substring(5));
        System.out.println(namalengkap.substring(5,12)); //huruf ke 6 smpai 12 termasuk spasi
        System.out.println(namalengkap.replace("Fat", "Nur"));
        System.out.println(namalengkap.toUpperCase());
        System.out.println(namalengkap.toLowerCase());
        System.out.println(namalengkap.charAt(6));

        String[] namaArray = namalengkap.split( " ");

        for(String nama : namaArray) {
            System.out.println(nama);
        }
    }
}
