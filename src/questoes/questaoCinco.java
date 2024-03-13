package questoes;

public class questaoCinco {
    public static void main(String[] args) {
        String original = "Palavras inversas!";
        System.out.println("String original: " + original);
        inverteString(original);
    }

    public static void inverteString(String str) {
        StringBuilder inversa = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            inversa.append(str.charAt(i));
        }
        System.out.println("Palavra invertida: " + inversa);
    }
}
