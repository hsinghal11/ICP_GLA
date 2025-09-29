package Day3.leetcode;

import java.util.Arrays;

public class Flipping_an_Image {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(arr);
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int add = n%2==0?0:1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2+add; j++){
                int temp = image[i][j];
                image[i][j] = (image[i][n-j-1])^1;
                image[i][n-j-1] = temp^1;
            }
        }
        return image;
    }
}
