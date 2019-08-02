public class Main {
    public static void main(String[] args) {
        String a = "Wow";
        String b = "Wow";
        String c = a + "!";
        String d = c ;

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!"); // this is the difference, swapped the first b for a d
        boolean b3 = !c.equals(a);

        System.out.println("b1:" + b1);
        System.out.println("b2:" + b2);
        System.out.println("b3:" + b3);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}