package Chapter_04;

import org.w3c.dom.ls.LSOutput;

public class PrimitiveTypes {
    int intdefault1;
    public void defaultValues() {
        int intdefault2;
     //   System.out.println(intDefault1);
     //   System.out.println(intDefault2);
    }
    public static void main(String[] args) {
        PrimitiveTypes types = new PrimitiveTypes();
        types.checkByte();
        types.checkChar();
        types.checkBoolean();
    }

    public void checkByte() {
        byte byteMin = -128;
        byte byteMax = 127;
        System.out.println("byteMin = " + byteMin);
        System.out.println("byteMax = " + byteMax);
        byteMin = (byte)(byteMin - 1);
        byteMax = (byte)(byteMax + 1);
        System.out.println("byteMin - 1 = " + byteMin);
        System.out.println("byteMax + 1 = " + byteMax);
    }

    public void checkOtherTypes() {
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;
    }

    public void checkChar() {
        char charMin = '\u0000';
        char charMax = '\uffff';
        System.out.println("charMin = [" + charMin + "]");
        System.out.println("charMax = [" + charMax + "]");
        int intValue = 'a';
        System.out.println("intValue = [" + intValue + "]");
    }

    public void checkBoolean() {
        boolean flag = true;
        System.out.println(flag);
        flag = false;
        System.out.println(flag);
    }
}
