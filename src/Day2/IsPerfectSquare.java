package Day2;

public class IsPerfectSquare {
    public static void main(String[] args) {
        int num = 2147483647;
        long l = 1;
        long r = num;
        while(l<=r){
            long m = l+ (r-l)/2;
            if(m*m == num) {
                System.out.println(true);
                return ;
            }
            else if(m*m > num) r = m-1;
            else l = m+1;
        }
        System.out.println(false);
        return;
    }
}
