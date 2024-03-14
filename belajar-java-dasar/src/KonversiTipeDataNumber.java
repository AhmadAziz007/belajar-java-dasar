public class KonversiTipeDataNumber {
    public static void main(String[] args) {
        //Konversi Tipe Data Number
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        float iniFloat2 = (float) iniDouble;

        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;
    }
}
