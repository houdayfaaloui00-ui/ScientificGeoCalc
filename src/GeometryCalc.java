import java.util.Scanner;

public class GeometryCalc {
    public static double aireRectangle(double largeur, double hauteur) {
        return largeur * hauteur;
    }

    public static double perimetreCercle(double rayon) {
        return 2 * Math.PI * rayon;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Calculatrice Geometrique ===");
        System.out.print("Entrez le rayon du cercle : ");
        if (scanner.hasNextDouble()) {
            double r = scanner.nextDouble();
            System.out.println("Perimetre = " + perimetreCercle(r));
        }
        scanner.close();
    }
}