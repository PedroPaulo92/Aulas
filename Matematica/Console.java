import java.util.Scanner;


public class Console {

    public static void main(String[] args) {
        String input = "";

        Scanner sc1 = new Scanner(System.in);
        while (!input.equals("Sair".toLowerCase())) {

            input = sc1.nextLine();
            switch (input) {
            case "media":
                input = sc1.nextLine();
                Media media = new Media();

                double[] meuArray = new double[5];

                String[] strings = input.split(" ");
                for (int i = 0; i < strings.length; i++) {
                    System.out.println(strings[i]);
                }

               media.calcularMedia(meuArray);
                break;

            default:
                break;
            }
        }
    }
}