public class Main {
    public static void main(String[] args) {
        byte bytey = 0;
        short shorty = 1;
        int inty = 2;
        long longy = 3;
        double x = 2.0;
        char d = 'd';
        boolean truthy = true;
        char H = 'H';
        char r = 'r';
        char w = 'w';



        String output = "" + H + longy + shorty + shorty + bytey + " " + w + bytey + r + shorty + d + " " +
                x + " " + truthy;
        System.out.println(output);
    }
}

//Create all of the primitives (except long and double) with different values.
// Concatenate them into a string and print it to the screen so it
// will print: H3110 w0r1d 2.0 true

//    byte (number, 1 byte)
//    short (number, 2 bytes)
//    int (number, 4 bytes)
//    long (number, 8 bytes)
//    float (float number, 4 bytes)
//    double (float number, 8 bytes)
//    char (a character, 2 bytes)
//    boolean (true or false, 1 byte)