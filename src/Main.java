import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // un sistema para representar diferentes tipos de que , la clase padre se llama libro
        // con los atributos titulo, autor, precio y cantidad de ejemplares,tiene metodo
        // mostrar libro, tiene una clase hija que se llama libro digital,que tiene como
        // atributo tamaño y disponibilidad, tiene metodo mostrar libro, el metodo prestar y
        // el metodo de volver,tiene otra clase hija que se llama libro impreso que tiene le
        // atributo peso,    tiene metodo mostrar libro (metodo poliformico),
        // metodo prestar y devolver. COnsideraciones para tener en cuenta, 1.no se puede prestar
        // un libro que no tiene disponibilidad. 2. no se puede devolver mas de dos libros. 3.
        // toca validar q no se pueda pedir prestado cantidades no existentes.
        // diagrama de clases, codigo y subir al repositorio
        // main con menu de interacciones que permita, 1.crear un libro impreso, 2. crear un libro
        // digital, 3. mostrar los libros, 4.buscar un libro por titulo cono interaccion de prestar
        // y devolver que tenga submenu donde al encontrar el libro te haga ese menu con el la
        // aceptacion de si le presto el libro o no

        Scanner sc = new Scanner(System.in);
        ArrayList<libro>libros = new ArrayList<>();
        int opcion;


        do {
            System.out.println("Sistema de libros ");
            System.out.println("1. Crear libro impreso");
            System.out.println("2. Crear libro digital");
            System.out.println("3. Mostrar todos los libros");
            System.out.println("4. Buscar libro por título");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el titulo: ");
                    String titulo1 = sc.nextLine();
                    System.out.print("Ingrese el autor: ");
                    String autor1 = sc.nextLine();
                    System.out.print("Ingrese el precio: ");
                    double precio1 = sc.nextDouble();
                    System.out.print("Ingrese la cantidad de libros: ");
                    int canti1 = sc.nextInt();
                    System.out.print("Ingrese el peso: ");
                    double peso1 = sc.nextDouble();
                    System.out.print("Ingrese el numero de ejemplares fisicos: ");
                    int numE = sc.nextInt();

                    libroimpreso li = new libroimpreso();
                    libros.add(li);
                    System.out.println("Libro creado exitosamente ");
                    break;
                case 2:
                    System.out.print("Ingrese el titulo: ");
                    String titulo2 = sc.nextLine();
                    System.out.print("Ingrese el autor: ");
                    String autor2 = sc.nextLine();
                    System.out.print("Ingrese el precio: ");
                    double precio2 = sc.nextDouble();
                    System.out.print("Ingrese la cantidad de libros: ");
                    int canti2 = sc.nextInt();
                    System.out.print("Ingrese el tamaño: ");
                    double tamaño2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Disponibilidad: ");
                    String disponible2 = sc.nextLine();

                    librodigital li2 = new librodigital();
                    libros.add(li2);
                    System.out.println("Libro creado exitosamente ");
                    break;
                case 3:
                    System.out.println("Lista de libros: ");
                    if (libros.isEmpty()) {
                        System.out.println("No hay libros registrados ");
                    } else {
                        for (libro l : libros) {
                            l.mostrarlibro();
                            System.out.println("");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Lista de libros: ");
                case 5:
                    System.out.println("Salir");

            }
        }





    }
}
