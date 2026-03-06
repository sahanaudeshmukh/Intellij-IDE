package Array.Basics;

public class twdarray {
    static void main(String[] args) {
        int[][] matrix = {{3,5,6},
                          {9,8,7},
                          {2,3,4}};
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print( matrix[i][j]);
            }
            System.out.println();
        }
    }
}
