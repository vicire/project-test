public class app {
    public static void main (String [] args){
        int a = 10;
        int b = 4;
        System.out.println(sum(a,b));
        System.out.println(div(a, b));
    }

    public static int sum (int a, int b){
        int c = 0;
        c = a + b;
        return (c);
    }

    public static int div (int a, int b){
        return (a - b);
    }
}
