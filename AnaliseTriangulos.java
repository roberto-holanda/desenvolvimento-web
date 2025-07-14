package projetos.triangulos;

public class AnaliseTriangulos {
    public static void main(String[] args) {
        float a = 7F;
        float b = 7F;
        float c = 7F;
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("As retas podem formar um triangulo!");
            if (a == b && b == c) {
                System.out.println("Equilátero!");
            } else if ((a == b && b != c) || (a != b && b == c) || (a == c && c != b)) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Escaleno!");
            }
        } else {
            System.out.println("As retas não podem formar um triangulo!");
        }
    }
}