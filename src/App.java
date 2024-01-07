public class App {
    
    public static int fakultaetBerechnen(int input) {
        if (input <= 0) {
            return 1;
        }
        return input * fakultaetBerechnen(input - 1);
    }

    
    public static void main(String[] args) throws Exception {
        System.out.println(fakultaetBerechnen(0));
    }
}
