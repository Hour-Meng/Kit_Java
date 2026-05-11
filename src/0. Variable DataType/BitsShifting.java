
public class BitsShifting {
    public static void main(String[] args) {
        int red = 204; // Bit value is 11001100
        int green = 51; // Bit value is 0011 0011

        // Left bit shift == Multiplication of Bits

        int shiftedRed = red  << 2; // 204 * 2^n (in this case n = 2), Bit value is 11001100 00 ( 2 more 0s since n = 2, if n = 3 then three more 0s)

        System.out.println(shiftedRed);
        
        // Right bit shift = Division of Bits

        int rightShiftedInt = green >> 3; // 000 0011 0011

        System.out.println(rightShiftedInt);
        
        /*
        bitwise operators:

        and = &
        or = |
        xor = ^
        
        */

        int a = 5; // Bit value is 0000 0101
        int b = 3; // Bit value is 0000 0011

        int andResult = a & b; // 0000 0001 (1 in decimal)
        // you just multiplied the bits of a and b, if both bits are 1 then the result is 1, otherwise it's 0
        System.out.println(andResult);

        int orResult = a | b; // 0000 0111 (7 in decimal)
        // you just added the bits of a and b, if either bit is 1 then
        System.out.println(orResult);

        int xorResult = a^b; // 0000 0110 (6 in decimal)
        // the calculation is the opposide of and, if both bits are 1 then the result is 0, otherwise it's 1
        System.out.println(xorResult);


        // Bit Merging
        
        int a2 = 5; // Bit value is 0000 0101
        int b2 = 3; // Bit value is 0000 0011
        int merged = (a2 << 8) | b2; // 0000 0101 0000 0011 (1283 in decimal)
        // you just merged the bits of a and b, you shifted a to the left by 8 bits and then you added b to the result using the or operator
        System.out.println(merged);

        // Bit Masking (used to extract specific bits from a number)

        int aExtract = (merged >> 8) & 0xFF; // 0000 0000 0000 0101 (5 in decimal)
        // you just extracted the bits of a from the merged number, you shifted the merged number to the right by 8 bits and then you used the and operator with 0xFF to get the last 8 bits of the merged number

        int bExtract = (merged) & 0xFF; // 0000 0000 0000 0011 (3 in decimal)
        // you just extracted the bits of b from the merged number, you used the and operator with 0xFF to get the last 8 bits of the merged number

        System.out.println(aExtract);
        System.out.println(bExtract);
    }    
}
