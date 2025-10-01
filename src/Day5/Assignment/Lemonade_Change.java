package Day5.Assignment;

public class Lemonade_Change {
    public static void main(String[] args) {
        int[] bills = {5,5,10,10,20};
        System.out.println(lemonadeChange(bills));
    }
    public static boolean lemonadeChange(int[] bills) {
        int cnt5 = 0;
        int cnt10 = 0;
        int cnt20 = 0;
        for(int i: bills){
            if(i == 5) cnt5++;
            else if(i == 10){
                if(cnt5 == 0) return false;
                cnt10++;
                cnt5--;
            }
            else{
                if(cnt10 >= 1 && cnt5 >= 1){
                    cnt10--;
                    cnt5--;
                }else if((cnt5 >= 3)){
                    cnt5 -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
