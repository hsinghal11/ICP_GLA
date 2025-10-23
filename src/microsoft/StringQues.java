package microsoft;

public class StringQues {
    public static void main(String[] args) {
        String s  = "YXXXYXY";
        System.out.println(solve(s));
    }

    public static int solve(String s){
        int y = 0;
        int del = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'X'){
                del = Math.min(y, del + 1);
            }else{
                y++;
            }
        }
        return del;
    }
}
