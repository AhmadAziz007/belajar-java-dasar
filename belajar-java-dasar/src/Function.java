import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        int umur, pengalaman;
        double penampilan;
        String lulusan, nama, jenisKelamin, posisi, hasil;
        boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2, reqAdmin3, reqSpv1, reqSpv2;
        boolean isPassing;

        Scanner input = new Scanner(System.in);

        System.out.println("Salamat datang di PT ABC");
        System.out.println("=============================\n");

        System.out.println("Silahkan input data anda: \n");
        System.out.println("Nama :");
        nama = input.nextLine();

        System.out.println("Umur :");
        umur = input.nextInt();

        System.out.println("Jenis Kelamin (Pria/Wanita) : ");
        jenisKelamin = input.next();

        System.out.println("Lulusan (SMK/D3/S1) :");
        lulusan = input.next();

        System.out.println("Pengalaman (Tahun) :");
        pengalaman = input.nextInt();

        System.out.println("Penampilan (1 s.d 10) :");
        penampilan = input.nextInt();

        System.out.println("Posisi yang dilamar (SPV, Admin, atau Koodinator) :");
        posisi = input.next();

        if (posisi.equalsIgnoreCase("Koordinator")) {
            //Pemanggilan dan dan pengguna function untuk validasi koordinator
            isPassing = validateKoordinator(umur, jenisKelamin, lulusan, pengalaman, penampilan);

        } else if (posisi.equalsIgnoreCase("Admin")) {
            //Pemanggilan dan dan pengguna function untuk validasi koordinator
            isPassing = validateAdmin(umur, jenisKelamin, lulusan, pengalaman, penampilan);

        } else if (posisi.equalsIgnoreCase("SPV")) {
            //Pemanggilan dan dan pengguna function untuk validasi koordinator
            isPassing = validateSPV(umur, jenisKelamin, lulusan, pengalaman, penampilan);
        } else {
            //hasil ketika posisi yang di masukan tidak sesuai dan tidak ada
            isPassing = false;
        }

        //membuat kondisi if untuk menentukan hasil kondisi text
        if (isPassing){
            hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi + ". dan akan masuk ke tahap selanjutnya.";
        }else {
            hasil = "Maaf, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi + ". dan tidak akan masuk ke tahap selanjutnya.";
        }

        printResult(nama, hasil, posisi);
    }



    public static boolean validateKoordinator(int umur, String jenisKelamin, String lulusan, int pengalaman, double penampilan) {
        //deklarasi variable lokal
        boolean reqKoor1, reqKoor2, result;

        //membuat kondisi setiap kriteria koodinator
        reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 20 && (lulusan.equalsIgnoreCase("SMK") ||
                lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2;
        reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5;

        //kondisi if untuk ementukan hasil posisi koordinator
        if (reqKoor1 || reqKoor2) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static boolean validateAdmin(int umur, String jenisKelamin, String lulusan, int pengalaman, double penampilan) {
        //deklarasi variable admin
        boolean reqAdmin1, reqAdmin2, reqAdmin3, result;

        //membuat kondisi setiap kriteria admin
        reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && (lulusan.equalsIgnoreCase("SMK")
                || (lulusan.equalsIgnoreCase("D3"))) && (penampilan >= 8.5 || pengalaman >= 1);
        reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 25 && lulusan.equalsIgnoreCase("S1")
                && penampilan >= 8.5 && pengalaman >= 3;
        reqAdmin3 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 20 && umur <= 30 && (lulusan.equalsIgnoreCase("D3")
                || (lulusan.equalsIgnoreCase("S1"))) && penampilan >= 8.5 && pengalaman >= 2;

        //Kondisi if untuk Menentukan Hasil Kelulusan Posisi Admin
        if (reqAdmin1 || reqAdmin2 || reqAdmin3) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static boolean validateSPV(int umur, String jenisKelamin, String lulusan, int pengalaman, double penampilan) {
        //deklarasi variable lokal
        boolean reqSpv1, reqSpv2, result;

        //membuat kondisi setiap kriteria SPV
        reqSpv1 = umur >= 23 && umur <= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman > 1;

        reqSpv2 = umur >= 25 && umur <= 35 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 4;

        //Kondisi if untuk Menentukan Hasil Kelulusan Posisi Admin
        if (reqSpv1 || reqSpv2) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    private static void printResult(String nama, String hasil, String posisi) {
        System.out.println(nama + ", Terima kasih telah mengikuti lowongan kerja di PT ABC");
        System.out.println("Berikut adalah hasil dari Rekrutment untuk koordinator dan admin :");
        System.out.println("Hasil kelulusan untuk koodinator :" + posisi + ": ");
        System.out.println(hasil);
    }

}
