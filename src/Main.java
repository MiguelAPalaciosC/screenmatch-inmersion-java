import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo, primer mensaje de la inmercion java");
        //System.out.println("Pelicula Matrix");

        //Declaracion de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnELPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor pelicula del fin del milenio
                Tiene tres secuelas
                """;
        double mediaEvaluacionUsuario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Calificacion: " + evaluacion);
        System.out.println("Esta incluida en su plan: " + incluidoEnELPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 +3) / 3;

        System.out.println("Media de evaluacion de Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Pelicula popular en el momento");
        } else {
            System.out.println("Pelicula retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix");
            double notaDeMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaDeMatrix;
        }

        System.out.println("Media de la pelicula " +
                "Matrix Calculada por el usuario es: " + mediaEvaluacionUsuario / 3);
    }
}