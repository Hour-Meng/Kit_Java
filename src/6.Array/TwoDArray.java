public class TwoDArray {

    public static void main(String[] args) {
        
        // Create the 2d array

        int [][] matrix = new int[2][2];

        matrix = new int[][]{{1,2}, {1,3}};

        System.out.println(matrix[0][1]); 

        // Unpack
        System.out.println("\n\nUnpack\n\n");
        for( int i = 0; i < matrix.length ; i++){

            for (int j = 0; j < matrix[i].length; j++){
                System.out.println(matrix[i][j]);
            }
        }

    }
    
}
