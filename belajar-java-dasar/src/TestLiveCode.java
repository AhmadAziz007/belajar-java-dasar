import java.util.Scanner;

public class TestLiveCode {
    public static void main(String[] args) {
        String angka;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        angka = input.next();

        char[] digitsArray = angka.toCharArray();

        int[] modValues = {1, 2};

        boolean result = true;
        for (int i = 0; i < digitsArray.length; i++) {
            int digit = Character.getNumericValue(digitsArray[i]);
            int modValue = modValues[i];

            if (digit % modValue != 0) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
