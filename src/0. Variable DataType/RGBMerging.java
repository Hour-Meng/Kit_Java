
public class RGBMerging {
    public static void main(String[] args) {
        int red = 77; // 8 Bits
        int green = 77; // 8 Bits
        int blue= 77; // 8 Bits
        
        // Bit Merging
        int rgb = (red << 16)|green << 8 | blue; // 0000 0000 0000 0000 0000 0000 0000 0000 (32 Bits)
        // you just merged the bits of red, green and blue, you shifted red to the left by 16 bits, green to the left by 8 bits and then you added blue to the result using the or operator
        System.out.println(rgb);

    System.out.println("RGB Value: " + String.format("#%06X", rgb));
    /*

    # mean that the value is in hexadecimal format
    % mean that the value is a format specifier
    0 mean that the value should be padded with zeros if it's less than 6 digits
    6 mean that the value should be at least 6 digits long
    X mean that the value should be in uppercase hexadecimal format
    
    */

    // try to extract the red, green and blue values from the rgb variable using bit masking and bit shifting

    int extractedRed = (rgb >> 16) & 0xFF; // we right shift by 16 bits and mask it ( 0xFF )
    int extractedGreen = (rgb >> 8) & 0xFF;
    int extractedBlue = rgb & 0xFF;

    System.out.println("Extracted Red: " + extractedRed);
    System.out.println("Extracted Green: " + extractedGreen);
    System.out.println("Extracted Blue: " + extractedBlue);
    }    
}
