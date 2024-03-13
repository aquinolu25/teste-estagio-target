package questoes;

public class questaoUm {
    public static void main(String[] args) {

         int indice = 13;
         int soma = 0;
         int k = 0;

         while (k < indice) {
             k++;
             soma += k;
         }

        System.out.println("O valor da variável soma é de: " +soma);
    }
}
