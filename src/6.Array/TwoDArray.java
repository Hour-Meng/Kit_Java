public class TwoDArray {

    public static void main(String[] args) {
        
        // Create the 2d array

                                // this is a 2 by 2 array. It does not count like index which start from 0
        int [][] matrix = new int[2][2];

        matrix = new int[][]{{1,2}, {1,3}};

        System.out.println(matrix[0][1]); 

        // Unpack
        System.out.println("\n\nUnpack\n\n");
        for( int i = 0; i < matrix.length ; i++){

            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();

            // This will print out a matrix style output
        }

    }
    
}
