import java.util.Scanner;

public class OperasiMatematika {
    public static void main(String[] args) {
//        int a = 2000;
//        int b = 2;
//
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);
//        System.out.println(a % b);
//
//        //Augmented Assignments
//        int c = 100;
//
//        c += 10;
//        System.out.println(c);
//
//        c -= 10;
//        System.out.println(c);
//
//        c *= 10;
//        System.out.println(c);
//
//        //Unary Operator
//        int d = 100;
//
//        d++;
//        System.out.println(d);
//
//        d--;
//        System.out.println(d);

//        var parkirSejam = 2000;
//        var perjam = 6;
//
//        System.out.println(parkirSejam * perjam);

//        var tinggiAwal = 200;
//        var lamaHari = 5;
//        var pertumbuhanHarian = 5;
//        System.out.println(tinggiAwal * lamaHari * pertumbuhanHarian);

        double hargaTotal, diskonPercentage, diskon, hargaAkhir;
        String bonus, hasil;
        boolean produk1, produk2, produk3;

        // Get input from the user
        Scanner input = new Scanner(System.in);


        // Get Harga from the user
        System.out.print("Masukkan Harga: ");
        hargaTotal = input.nextDouble();

        // Get diskon from the user
        System.out.print("Masukkan diskon dalam persen: ");
        diskonPercentage = input.nextDouble();

        // Calculate diskon (discount)
        diskon = (diskonPercentage / 100) * hargaTotal;

        // Calculate jumlah (total)
        hargaAkhir = hargaTotal - diskon;

        // Display Harga, diskon, bonus, and jumlah
        System.out.println("Total Harga: " + hargaTotal);
        System.out.println("Diskon: " + diskon + " (" + diskonPercentage + "%)");
        System.out.println("Harga Akhir: " + hargaAkhir);

        if (diskonPercentage == 5) {
            if (hargaTotal > 70000 && hargaTotal <= 200000) {
                hasil = "Transaksi berhasil dengan harga total Rp." + hargaTotal + ", \nkemudian mendapatkan bonus Topi.";
            } else {
                hasil = "Maaf harga total " + hargaTotal + " tidak mendapatkan bonus dan diskon 5% hanya berlaku untuk mendapatkan Topi.";
            }
        } else if  (diskonPercentage == 10) {
                if (hargaTotal > 200000 && hargaTotal <= 400000) {
                    hasil = "Transaksi berhasil dengan harga total Rp." + hargaTotal + ", \nkemudian mendapatkan bonus Payung.";
                } else {
                    hasil = "Maaf harga total " + hargaTotal + " tidak mendapatkan bonus dan diskon 10% hanya berlaku untuk mendapatkan Payung.";
                }
        } else if (diskonPercentage == 20) {
                if (hargaTotal > 400000) {
                    hasil = "Transaksi berhasil dengan harga total Rp." + hargaTotal + ", \nkemudian mendapatkan bonus Ransel";
                } else {
                    hasil = "Maaf harga total " + hargaTotal + " tidak mendapatkan bonus dan diskon 20% hanya berlaku untuk mendapatkan Ransel.";
                }
        } else {
            hasil = "Maaf anda tidak mendapatkan bonus";
        }

        //Membuat hasil output test
        System.out.println("Terima kasih telah membeli produk di PT ABC");
        System.out.println(hasil);
        // Close the scanner
//        input.close();
    }
    public static boolean validateTopi(double hargaTotal) {
        //deklarasi variable lokal
        boolean produk1, result;

        //membuat kondisi setiap kriteria validateTopi
        produk1 = hargaTotal > 70000 && hargaTotal <= 200000;

        //kondisi if untuk ementukan hasil validateTopi
        if (produk1) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static boolean validatePayung(double hargaTotal) {
        //deklarasi variable lokal
        boolean produk2, result;

        //membuat kondisi setiap kriteria Payung
        produk2 = hargaTotal > 200000 && hargaTotal <= 400000;

        //kondisi if untuk ementukan hasil Payung
        if (produk2) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static boolean validateRansel(double hargaTotal) {
        //deklarasi variable lokal
        boolean produk3, result;

        //membuat kondisi setiap kriteria Ransel
        produk3 = hargaTotal > 400000;

        //kondisi if untuk ementukan hasil Ransel
        if (produk3) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
