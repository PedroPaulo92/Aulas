public class Media
{
    public static void calcularMedia(double[] array)
    { double soma = 0;
       for(int i = 0; i < array.length;i++)
       {
            soma = soma+array[i];
            
       } 
       double media = soma / array.length; 
       System.out.println("Media" + media );
    }
}