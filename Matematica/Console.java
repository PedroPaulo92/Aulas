import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;



// Adicionar uma nova condição no metodo de escolha paracalular a média ponderada 
// e no terminal passar a media e a nota para cada 'Prova' e passar os valores para o mótodo 
// que calcula  a média. É necessário de alguma forma indicar que a cada 
// 2 números será uma prova {n,p} new Prova()

public class Console {

    public static void main(String[] args) {
        String input = "";

        Scanner sc1 = new Scanner(System.in);
        while (!input.equals("Sair".toLowerCase())) {

            input = sc1.nextLine();
            switch (input) {
            case "media":
            System.out.println("Digite os valores a seem calculados separados por espaço!");
                input = sc1.nextLine();
                Media media = new Media();

                List<Double> myNumberList = new ArrayList<Double>();
                String[] strings = input.split(" ");
                //Atribuir os valores de entrada do usuário para array de double e calcular a média desses valores
                for (String inputValue : strings) {
                    //System.out.println(valor);
                    myNumberList.add( Double.parseDouble(inputValue));
                }

               media.calcularMedia(myNumberList);
                break;

            default:
                break;
            }
        }
    }
}