public class day10 {
    public static void main(String[]args){

        String x = "hello";
        String y = "WORLD";
        String h = x.concat(y);
        System.out.println(h);

        System.out.println(y.toLowerCase());
        System.out.println(x.toUpperCase());
        int a = x.indexOf('h'); //this will return the index of the first occurrence of 'h' in x
        System.out.println(a);
        char ch = x.charAt(0);
        System.out.println(ch);
        String s=x.replace('h','H'); //this will replace the first occurrence of 'h' with 'H'
        System.out.println(s);
        System.out.println(x.contains("ll")); //this will return true if 'll' is present in x


        

    }
}
