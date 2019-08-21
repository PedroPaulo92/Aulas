import java.util.List;

public class Media
{
    public static void calcularMedia(List<Double> array)
    { 
        double soma = 0;
        for (Double valor : array) {
            soma += valor;
        }
       System.out.println("Media: " + (soma/array.size()));
    }
}