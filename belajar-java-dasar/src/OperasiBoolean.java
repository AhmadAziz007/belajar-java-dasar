import java.util.Scanner;

public class OperasiBoolean {
    public static void main(String[] args) {
//        var absen = 90;
//        var nilaiAkhir = 75;
//
//        var lulusAbsen = absen >= 75;
//        var lulusNilaiAkhir = nilaiAkhir >= 75;
//
//        var lulus = lulusAbsen && lulusNilaiAkhir;
//        System.out.println(lulus);

        var a = 2;
        var b = 4;
        var nilai = (a<b) && (b>a) || (b/a == a);
        System.out.println(nilai);

//        var a = true;
//        var b = false;
//        var nilai = ((true || false && true) || (false && false));
//        System.out.println(nilai);

//        int matematika, bhsInggris, bhsIndonesia, ipa; //Varible untuk menyimpan nilai ujian
//        int passigerGradeSMK, passigerGradeSastra, passigerGradeTIK; //Varible untuk menyimpan nilai syarat kelulusan
//        boolean isPassigerSMK, isPassigerSastra, isPassigerTIK;
//        double averageUjian, averageBahasa, averageTIK;
//
//        Scanner input = new Scanner(System.in);
//
//        //Inisialisasi dulu nilai variable untuk syarat kelulusan
//        passigerGradeSMK = 70;
//        passigerGradeTIK = 70;
//        passigerGradeSastra = 70;
//
//        System.out.println("Masukan nilai matematika :");
//        matematika = input.nextInt();
//
//        System.out.println("Masukan nilai bhsInggris :");
//        bhsInggris = input.nextInt();
//
//        System.out.println("Masukan nilai bhsIndonesia :");
//        bhsIndonesia = input.nextInt();
//
//        System.out.println("Masukan nilai ipa :");
//        ipa = input.nextInt();
//
//        //menghitung nilai rata2 ujian
//        averageUjian = (matematika + bhsInggris + bhsIndonesia + ipa)/4;
//
//        //menghitung nilai rata2 bahasa
//        averageBahasa = (bhsIndonesia + bhsInggris)/2;
//
//        averageTIK = (matematika + ipa)/2;
//
//        //membuat boolean expression untuk menentukan kelulusan
//
//        //menentukan masuk kelulusan smk
//        isPassigerSMK = averageUjian >= passigerGradeSMK;
//
//        //menentukan kelulusan masuk sastra
//        isPassigerSastra = averageBahasa >= passigerGradeSastra;
//
//        //menentukan kelulusan masuk TIK
//        isPassigerTIK = averageTIK >= passigerGradeTIK;
//
//        System.out.println("\n\nHasil dari simulasi untuk persyaratan penerima siswa smk:");
//        System.out.println("=============================================================");
//        System.out.println("apakah anda memenuhi syarat untuk masuk ke smk :" + isPassigerSMK);
//        System.out.println("apakah anda memenuhi syarat untuk masuk ke sastra :" + isPassigerSastra);
//        System.out.println("apakah anda memenuhi syarat untuk masuk ke tik :" + isPassigerTIK);

//        //deklarasi variable yang diperlukan
//        int umur, pengalaman;
//        double penampilan;
//        String lulusan, nama, jenisKelamin;
//        boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2;
//        boolean isPassingKoor, isPassingAdmin;
//        Scanner input = new Scanner(System.in);
//
//        //Buat output Text yang dibutuhkan
//        System.out.println("Selamat datang di PT ABC");
//        System.out.println("=============================================================");
//        System.out.println("Silahkan Input data diri anda");
//        System.out.println("Nama :");
//        nama = input.next();
//        System.out.println("Umur :");
//        umur = input.nextInt();
//        System.out.println("Jenis Kelamin (Pria/Wanita) :");
//        jenisKelamin = input.next();
//        System.out.println("lulusan :");
//        lulusan = input.next();
//        System.out.println("Pengalaman :");
//        pengalaman = input.nextInt();
//        System.out.println("Penampilan :");
//        penampilan = input.nextDouble();
//
//        //Pengecekan data untuk persyartan Koordinator
//        /*
//        1. Persyartan Koordinator:
//           Pria
//           Umur minimal 21 dan maximal 30 tahun.
//           lulusan Smk/D3
//           Memiliki pengalaman minimal 2 tahun
//
//           Pria
//           Umur 30 tahun keatas
//           lulusan S1
//           Memiliki pengalaman minimal 5 tahun
//
//         */
//        //Persyaratan koordinator
//        reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 &&(lulusan.equalsIgnoreCase("SMK")
//                || lulusan.equalsIgnoreCase("D3")) && (penampilan >= 7 && pengalaman >= 1);
//
//        reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 25 && (lulusan.equalsIgnoreCase("S1")) && (penampilan >= 7 && pengalaman >= 1);
//
//        //Hasil dari Koordinator
//        isPassingKoor = reqKoor1 || reqKoor2;
//
//        //Pengecekan data untuk persyartan Admin
//        /*
//        1. Persyartan Admin:
//           Wanita
//           Umur minimal 20 dan maximal 25 tahun.
//           lulusan D3
//           Memiliki penampilan menarik dan pengalaman minimal 1 tahun
//
//           Wanita
//           Umur 25 tahun keatas
//           lulusan S1
//           Memiliki penampilan menarik dan pengalaman minimal 3 tahun
//         */
//        //Persyaratan Admin
//        reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 &&(lulusan.equalsIgnoreCase("D3"))
//                && (penampilan >= 7 && pengalaman >= 1);
//
//        reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 25 && (lulusan.equalsIgnoreCase("S1"))
//                 && (penampilan >= 7 && pengalaman >= 1);
//
//        //Hasil dari Koordinator
//        isPassingAdmin = reqAdmin1 || reqAdmin2;
//
//        //Membuat hasil output test
//        System.out.println(nama + ", Terima kasih telah mengikuti lowongan kerja di PT ABC");
//        System.out.println("Berikut adalah hasil dari Rekrutment untuk koordinator dan admin :");
//        System.out.println("Hasil kelulusan untuk koodinator :" + isPassingKoor);
//        System.out.println("Hasil kelulusan untuk admin :" + isPassingAdmin);
    }
}
