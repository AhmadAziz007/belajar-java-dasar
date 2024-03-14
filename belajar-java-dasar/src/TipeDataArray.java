import java.util.Scanner;

public class TipeDataArray {
    public static void main(String[] args) {

//        String[] arrayString;
//        arrayString = new String[3];
//        arrayString[0] = "Ahmad";
//        arrayString[1] = "Mukaram";
//        arrayString[2] = "Aziz";
//
//        System.out.println(arrayString[0]);
//        System.out.println(arrayString[1]);
//        System.out.println(arrayString[2]);
//
//        //Array Initializer
//        int[] arrayInt = new int[]{
//                10,90,80,67,29
//        };
//
//        long[] arrayLong = {
//                10,90,80,67,29
//        };
//
//        System.out.println(arrayLong.length);
//
//        //Array di dalam Array
//        String[][] members = {
//                {"Ahmad", "Mukaram", "Aziz"},
//                {"Lingga", "Edo"},
//                {"Budi"},
//        };
//        System.out.println(members[0]);
//        System.out.println(members[1][0]);
        Scanner input = new Scanner(System.in);
        int findNumber = 0, count = 0;
        int numbers[] = {3, 2, 5, 11, 7, 10, 11, 3, 15, 11, 17, 10, 5};
        boolean isThere = false;

        System.out.println("Mencari Angka dari Array Number !!!");
        System.out.println("Masukan angka yang di cari :");
        findNumber = input.nextInt();

        //menghitung jumlah yang di cari
        for(int i = 0; i < numbers.length; i++){
            if (findNumber == numbers[i]){
                isThere = true;
                count++;
            }
        }
        if (isThere == true){
            System.out.println("Angka " + findNumber + " yang ada cari ditemukan array number.");
            System.out.println("Ada " + count + " angka " + findNumber + " didalam array number.");
            System.out.println("yaitu index ke :");
            for (int i = 0; 1 < numbers.length; i++){
                if (findNumber == numbers[i]){
                    System.out.println(i + " ");
                }
            }
        }else {
            System.out.println("Angka" + findNumber + "yang anda cari tidak ditemukan di array numbers.");
        }
    }
}
