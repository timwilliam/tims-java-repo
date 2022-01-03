public class NumberConversion {
    public static void main(String[] args) {
        // for the min/max limit of a primitive data type, refer to Java documentation
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

        // number type conversion
        // widening (automatic): byte > short > int > long > float > double
        byte itsByte = 100;
        short itsShort = itsByte;
        int itsInt = itsShort;

        // narrowing (manual): double > float > long > int > char > sshort > byte
        int itsInt2 = 1000;
        byte itsByte2 = (byte) itsInt2; // warning, number overflow !
    }
}
