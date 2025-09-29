package Day3.practiceSesssion;

public class RowWiseTraverse {
    public static void main(String[] args) {
        int[][] arr =     {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};

        rowWise(arr);
        System.out.println();
        columnWise(arr);
        System.out.println();
        reverse(arr);
        System.out.println();
        spiral(arr);
        System.out.println();
        zigzagRow(arr);
    }

    public static void rowWise(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void columnWise(int[][] arr){
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }

    public static void reverse(int[][] arr){
        for (int i = arr.length-1; i >=0 ; i--) {
            for (int j = arr[0].length-1; j >= 0; j--) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void spiral(int[][] arr){
        int minR = 0, minC = 0;
        int maxR = arr[0].length-1, maxC = arr.length-1;
        int m = arr.length, n = arr[0].length;
        int total = 0;
        while (total < m*n){
            for (int i = minR; i <= maxR && total < m*n; i++) {
                System.out.print(arr[minC][i]+"->");
                total++;
            }
            minC++;
            for (int i = minC; i <= maxC && total < m*n; i++) {
                System.out.print(arr[i][maxR]+"->");
                total++;
            }
            maxR--;
            for (int i = maxR; i >= minR && total < m*n; i--) {
                System.out.print(arr[maxC][i]+"->");
                total++;
            }
            maxC--;
            for (int i = maxC; i >= minC && total < m*n; i--) {
                System.out.print(arr[i][minR]+"->");
                total++;
            }
            minR++;
        }
    }

    public static void zigzagRow(int[][] arr){
        int n = arr[0].length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < n; j++) {
                if(i%2 == 0){
                    System.out.print(arr[i][j]+" ");
                }else{
                    System.out.print(arr[i][n-j-1]+" ");
                }
            }
            System.out.println();
        }
    }
}
