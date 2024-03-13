package questoes;

public class questaoTres {

    // Sequência A)
    public static int proxElementoA(int atual) {
        return atual +2;
    }

    // Sequência B)
    public static int proxElementoB(int atual) {
        return atual * 2;
    }

    // Sequência C)
    public static int proxElementoC(int atual) {
        return atual + 13;
    }

    // Sequência D)
    public  static int proxElementoD(int atual) {
        return (int) Math.pow(Math.sqrt(atual) + 2, 2);
    }

    // Sequência E)
    public  static int proxElementoE(int atual) {
        return atual + 5;
    }

    // Sequência F)
    public static int proxElementoF(int atual) {
        return atual + 181;
    }

    public static void main(String[] args) {

        System.out.println("a) " + proxElementoA(7));
        System.out.println("b) " + proxElementoB(64));
        System.out.println("c) " + proxElementoC(36));
        System.out.println("d) " + proxElementoD(64));
        System.out.println("e) " + proxElementoE(8));
        System.out.println("f) " + proxElementoF(19));
    }
}
