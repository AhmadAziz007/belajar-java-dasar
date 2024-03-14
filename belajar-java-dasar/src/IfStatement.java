import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
//        var nilai = 50;
//        var absen = 50;
//
//        if (nilai >= 75 && absen >= 75){
//            System.out.println("Nilai Anda A");
//        } else if (nilai >= 70 && absen >= 70) {
//            System.out.println("Nilai Anda B");
//        } else if (nilai >= 65 && absen >= 65) {
//            System.out.println("Nilai Anda C");
//        } else if (nilai >= 60 && absen >= 60) {
//            System.out.println("Nilai Anda D");
//        } else {
//            System.out.println("Nilai Anda E");
//        }

//        Scanner input = new Scanner(System.in);
//        int umur;
//
//        System.out.println("Berapa umur kamu? ");
//        umur = input.nextInt();
//
//        if (umur >= 18){
//            System.out.println("Kamu dapat SIM");
//        }
//        if (umur >= 17) {
//            System.out.println("Kamu dapat KTP");
//        }
//        if (umur >= 25) {
//            System.out.println("Kamu Ideal Menikah");
//        } else {
//            System.out.println("kamu masih jomblo");
//        }

//        Scanner input = new Scanner(System.in);
//        String cuaca;
//
//        System.out.println("Cuaca siang hari ini: ");
//        cuaca = input.next();
//
//        if (cuaca.equals("Hujan")) {
//            System.out.println("Pesan makanan lewat gofood");
//        } else if (cuaca.equals("Badai")) {
//            System.out.println("Dirumah aja");
//        } else {
//            System.out.println("Pergi ke restoran pake motor");
//        }

//        String name, gender, day, result;
//        int age;
//        double appearance, money;
//
//        Scanner input = new Scanner(System.in);
//
//        //inisialisasi result
//        result = "";
//
//        //text output untuk inputan user
//        System.out.println("Welcome to Reservation Cafe");
//        System.out.println("Please insert your name:");
//        name = input.nextLine();
//
//        System.out.println("How old are you?");
//        age = input.nextInt();
//
//        System.out.println("What is your gender (Male/Female):");
//        gender = input.next();
//
//        System.out.println("How attractive are you? (1 to 10)");
//        appearance = input.nextDouble();
//
//        System.out.println("How much money do you have:");
//        money = input.nextDouble();
//
//        System.out.println("What day do you want to make a reservation:");
//        day = input.next();
//
//        //Membuat kondisi if untuk setiap day atau hari Reservation
//        if (day.equalsIgnoreCase("Monday")){
//
//        /*Condition for Monday
//        -Young night:
//        -Age from 20 to 30
//        -All gender
//        -Money start from $500
//         */
//
//            //Buat if pengecekan kondisi apakah sesuai atau tidak untuk Monday
//            if(age >= 20 && age <= 30 && money >= 500){
//                result = "Resevation succesfully, you can order on Monday. Young Night.";
//            } else {
//                result = "Sorry, you can't order on Monday!!. Because it is for young night";
//            }
//        } else if (day.equalsIgnoreCase("Tuesday")) {
//            /*Condition for Tuesday
//            -Oldest night:
//            -Age from 31 to 50
//            -All gender
//            -Money start from $250
//             */
//
//            //Buat if pengecekan kondisi apakah sesuai atau tidak untuk Tuesday
//            if(age >= 31 && age <= 50 && money >= 250){
//                result = "Resevation succesfully, you can order on Tuesday. Oldest Night.";
//            } else {
//                result = "Sorry, you can't order on Tuesday!!. Because it is for Oldest night";
//            }
//        } else if (day.equalsIgnoreCase("Wednesday"))0 {
//            /*Condition for Wednesday
//            -Ladies night:
//            -Age from 20 to 35
//            -Female Only
//            -Must Attractive
//            -Money start from $300
//             */
//
//            //Buat if pengecekan kondisi apakah sesuai atau tidak untuk Wednesday
//            if (gender.equalsIgnoreCase("Ladies") && age >= 20 && age <= 35 && appearance >= 8 && money >= 300) {
//                result = "Resevation succesfully, you can order on Wednesday. Ladies Night.";
//            } else {
//                result = "Sorry, you can't order on Wednesday!!. Because it is for Ladies night";
//            }
//        } else if (day.equalsIgnoreCase("Thursday")) {
//            /*Condition for Thursday
//            -Party night for single:
//            -Age from 21 to 30
//            -All gender
//            -Female Must Attractive and money start from $300
//            -Male Must Attractive and money start from $1000
//             */
//
//            //Buat if pengecekan kondisi apakah sesuai atau tidak untuk Thursday
//            if (gender.equalsIgnoreCase("Female") && age >= 21 && age <= 30 && appearance >= 8 && money >= 300) {
//                result = "Resevation succesfully, you can order on Thursday. Party Night for single.";
//            } else if (gender.equalsIgnoreCase("Male") && age >= 20 && age <= 30 && money >= 1000){
//                result = "Resevation succesfully, you can order on Thursday. Party Night for single.";
//            } else {
//                result = "Sorry, you can't order on Thursday!!. Because it is for Party Night for single";
//            }
//        } else if (day.equalsIgnoreCase("Friday")) {
//            /*Condition for Friday
//            -Party night for single:
//            -Female age 31 to 45
//            -Male Age 20 to 30
//            -Female Must Attractive and money start from $1000
//             */
//
//            //Buat if pengecekan kondisi apakah sesuai atau tidak untuk Friday
//            if (gender.equalsIgnoreCase("Female") && age >= 31 && age <= 45 && appearance >= 8 && money >= 1000) {
//                result = "Resevation succesfully, you can order on Friday. Women Night.";
//            } else if (gender.equalsIgnoreCase("Male") && age >= 21 && age <= 25  && appearance >= 8){
//                result = "Resevation succesfully, you can order on Friday. Women Night.";
//            } else {
//                result = "Sorry, you can't order on Friday!!. Because it is for Women Night";
//            }
//        } else if (day.equalsIgnoreCase("Friday")) {
//            /*Condition for Friday
//            -Party night for single:
//            -Female age 31 to 45
//            -Male Age 20 to 30
//            -Female Must Attractive and money start from $1000
//             */
//
//            //Buat if pengecekan kondisi apakah sesuai atau tidak untuk Friday
//            if (gender.equalsIgnoreCase("Female") && age >= 31 && age <= 45 && appearance >= 8 && money >= 1000) {
//                result = "Resevation succesfully, you can order on Friday. Women Night.";
//            } else if (gender.equalsIgnoreCase("Male") && age >= 21 && age <= 25  && appearance >= 8){
//                result = "Resevation succesfully, you can order on Friday. Women Night.";
//            } else {
//                result = "Sorry, you can't order on Friday!!. Because it is for Women Night";
//            }
//        } else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
//            /*Weekday freedom
//            - Age 18 to 60
//            - Money start from $100
//             */
//
//            //Buat if pengecekan kondisi apakah sesuai atau tidak untuk Weekday
//            if ( age >= 18 && age <= 60 && money >= 1000) {
//                result = "Resevation succesfully, you can order on Weekday. Weekday freedom.";
//            } else {
//                result = "Sorry, you can't order on Weekday!!. Because it is for Weekday freedom";
//            }
//        }
//
//        //Output text hasil aplikasi
//        System.out.println();
//        System.out.println("Hi " + name + ", Thank you for using application");
//        System.out.println("Following Result for you Reservation: ");
//        System.out.println(result);

        //Decklarasi variable yang diperlukan
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

            //membuat kondisi setiap kriteria Koordinator
            reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("SMK")
                    || (lulusan.equalsIgnoreCase("D3"))) && pengalaman >= 2;
            reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5;

            //Kondisi if untuk Menentukan Hasil Kelulusan Posisi Koordinator
            if (reqKoor1 || reqKoor2) {
                hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi + ". dan akan masuk ke tahap selanjutnya.";
            } else {
                hasil = "Maaf, " + nama + ".\nAnda tidak memenuhi syarat sebagai " + posisi + ", dan tidak akan masuk ketahap selanjutnya.";
            }
        } else if (posisi.equalsIgnoreCase("Admin")) {
            reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && (lulusan.equalsIgnoreCase("SMK")
                    || (lulusan.equalsIgnoreCase("D3"))) && (penampilan >= 8.5 || pengalaman >= 1);
            reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 25 && lulusan.equalsIgnoreCase("S1")
                    && penampilan >= 8.5 && pengalaman >= 3;
            reqAdmin3 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 20 && umur <= 30 && (lulusan.equalsIgnoreCase("D3")
                    || (lulusan.equalsIgnoreCase("S1"))) && penampilan >= 8.5 && pengalaman >= 2;
            //Kondisi if untuk Menentukan Hasil Kelulusan Posisi Admin
            if (reqAdmin1 || reqAdmin2 || reqAdmin3) {
                hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi + ". dan akan masuk ke tahap selanjutnya.";
            } else {
                hasil = "Maaf, " + nama + ".\nAnda tidak memenuhi syarat sebagai " + posisi + ", dan tidak akan masuk ketahap selanjutnya.";
            }
        } else if (posisi.equalsIgnoreCase("SPV")) {
            reqSpv1 = umur >= 23 && umur <= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman > 1;

            reqSpv2 = umur >= 25 && umur <= 35 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 4;

            //Kondisi if untuk Menentukan Hasil Kelulusan Posisi Admin
            if (reqSpv1 || reqSpv2) {
                hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi + ". dan akan masuk ke tahap selanjutnya.";
            } else {
                hasil = "Maaf, " + nama + ".\nAnda tidak memenuhi syarat sebagai " + posisi + ", dan tidak akan masuk ketahap selanjutnya.";
            }
        } else {
            hasil = "Maaf posisi yang anda cari tidak tersedia.";
        }
        //Membuat hasil output test
        System.out.println(nama + ", Terima kasih telah mengikuti lowongan kerja di PT ABC");
        System.out.println("Berikut adalah hasil dari Rekrutment untuk koordinator dan admin :");
        System.out.println("Hasil kelulusan untuk koodinator :" + posisi + ": ");
        System.out.println(hasil);
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
}
