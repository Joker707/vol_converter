import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("insert input type ('bls', 'gal' or 'l') or 'stop' to stop converter: ");
        String inputType = bufferedReader.readLine();
        while (true) {
            if (inputType.equals("stop")) {
                return;
            } else if (inputType.equals("bls") || inputType.equals("gal") | inputType.equals("l")) {
                break;
            } else {
                System.out.println("incorrect type, insert 'bls', 'gal', 'l' or 'stop' to stop converter: ");
                inputType = bufferedReader.readLine();
            }
        }
        Double value = null;
        do {
            System.out.println("insert your value: ");
            String number = bufferedReader.readLine();
            try {
                value = Double.parseDouble(number);
            } catch (NumberFormatException e) {
                System.out.println("That's not a number");
            }
        } while (value == null);
        System.out.println("insert output type ('bls', 'gal' or 'l'):");
        String outputType = bufferedReader.readLine();
        while (true) {
            if (outputType.equals("bls") || outputType.equals("gal") | outputType.equals("l")) {
                break;
            } else {
                System.out.println("incorrect type, insert 'bls', 'gal' or  'l' : ");
                outputType = bufferedReader.readLine();
            }
        }
        String fullType = inputType + " -> " + outputType;
        result(fullType, value);
    }

    private static void result(String fullType, Double value) {
        String result;
        switch (fullType) {
            case "bls -> gal" :
                result = String.format("%.3f", value * 42);
                System.out.println(value + " bls -> " + result + " gal");
                break;
            case "bls -> l" :
                result = String.format("%.3f", value * 158.97);
                System.out.println(value + " bls -> " + result + " l");
                break;
            case "gal -> bls" :
                result = String.format("%.3f", value * 0.024);
                System.out.println(value + " gal -> " + result + " bls");
                break;
            case "gal -> l" :
                result = String.format("%.3f", value * 3.785);
                System.out.println(value + " gal -> " + result + " l");
                break;
            case "l -> bls" :
                result = String.format("%.3f", value * 0.0063);
                System.out.println(value + " l -> " + result + " bls");
                break;
            case "l -> gal" :
                result = String.format("%.3f", value * 0.264);
                System.out.println(value + " l -> " + result + " gal");
                break;
        }
    }
}
