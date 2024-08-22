public class FlorSamambaia {

    public static String tentativaDesenhar(int r1, int x1, int y1, int r2, int x2, int y2) {

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (distancia + r2 <= r1) {
            return "RICO";
        } else {
            return "MORTO";
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o raio do caçador (R1):");
        int r1 = scanner.nextInt();
        System.out.println("Digite a coordenada X do centro do caçador (X1):");
        int x1 = scanner.nextInt();
        System.out.println("Digite a coordenada Y do centro do caçador (Y1):");
        int y1 = scanner.nextInt();
        System.out.println("Digite o raio da flor (R2):");
        int r2 = scanner.nextInt();
        System.out.println("Digite a coordenada X do centro da flor (X2):");
        int x2 = scanner.nextInt();
        System.out.println("Digite a coordenada Y do centro da flor (Y2):");
        int y2 = scanner.nextInt();

        String resultado = tentativaDesenhar(r1, x1, y1, r2, x2, y2);

        System.out.println(resultado);

        scanner.close();
    }
}