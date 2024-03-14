public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        Integer iniInteger = 100;
        Long iniLong = 10000L;

        //Tipe data number
        Byte iniByte = null;
        System.out.println(iniByte);

        //Tipe data primitif
        iniByte = 100;
        System.out.println(iniByte);

        //Tipe data primitif
        int iniInt = 100;
        //Tipe data bukan primitif
        Integer iniObject = iniInt;

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
    }
}
