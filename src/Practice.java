public class Practice {
    public static void main(String[] args) {
//        if(System.out.printf("hello world %d", 10) == null){} // display ("hello") without semi-colon (;)
        long num1 = 100*24*12*60*60*60l;
        System.out.println(num1);
        System.out.println(Long.bitCount(num1));
    }
}
