package questoes;

public class questaoCinco {
    public static void main(String[] args) {
        String original = "Palavras inversas!";
        System.out.println("String original: " + original);
        inverteString(original);
    }

    public static void inverteString(String string) {
        StringBuilder inversa = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            inversa.append(string.charAt(i));
        }
        System.out.println("Palavra invertida: " + inversa);
    }
}
