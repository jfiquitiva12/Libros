import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<libro> listaLibros = new ArrayList<>();
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
                    System.out.println("Crear libro impreso");
                    System.out.print("Titulo: ");
                    String tituloI = sc.nextLine();
                    System.out.print("Autor: ");
                    String autorI = sc.nextLine();
                    System.out.print("Precio: ");
                    double precioI = sc.nextDouble();
                    System.out.print("Cantidad de ejemplares: ");
                    int cantidadI = sc.nextInt();
                    System.out.print("Peso del libro: ");
                    String peso = sc.nextLine();
                    sc.nextLine();

                    libro libroTempI = new libro();
                    String codigoI = libroTempI.generarCodigo("fisico");

                    libroimpreso li = new libroimpreso(codigoI, tituloI, autorI, precioI, cantidadI, peso);
                    listaLibros.add(li);
                    System.out.println("Libro creado con exito " + codigoI);
                    break;

                case 2:
                    System.out.println("Crear libro digital");
                    System.out.print("Titulo: ");
                    String tituloD = sc.nextLine();
                    System.out.print("Autor: ");
                    String autorD = sc.nextLine();
                    System.out.print("Precio: ");
                    double precioD = sc.nextDouble();
                    System.out.print("Cantidad de ejemplares: ");
                    int cantidadD = sc.nextInt();
                    System.out.print("Tamaño del archivo: ");
                    double tamano = sc.nextDouble();
                    sc.nextLine();

                    libro libroTempD = new libro();
                    String codigoD = libroTempD.generarCodigo("digital");

                    String disponible = (cantidadD > 0) ? "disponible" : "no disponible";

                    librodigital ld = new librodigital(codigoD, tituloD, autorD, precioD, cantidadD, tamano, disponible);
                    listaLibros.add(ld);
                    System.out.println("Libro creado con exito " + codigoD);
                    break;

                case 3:
                    System.out.println("Lista de todos los libros:");
                    if (listaLibros.isEmpty()) {
                        System.out.println("No hay libros registrados" );
                    } else {
                        for (libro l : listaLibros) {
                            System.out.println("Codigo: " + l.getCodigo());
                            System.out.println("Titulo: " + l.getTitulo());
                            System.out.println("Autor: " + l.getAutor());
                            System.out.println("Precio: " + l.getPrecio());
                            System.out.println("Cantidad: " + l.getCantidadejemplares());
                        }
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el titulo del libro a buscar: ");
                    String buscar = sc.nextLine();
                    boolean encontrado = false;

                    for (libro l : listaLibros) {
                        if (l.getTitulo().equalsIgnoreCase(buscar)) {
                            encontrado = true;
                            System.out.println("Libro encontrado: ");
                            System.out.println("Codigo: " + l.getCodigo());
                            System.out.println("Titulo: " + l.getTitulo());
                            System.out.println("Autor: " + l.getAutor());
                            System.out.println("Precio: " + l.getPrecio());


                            if (l instanceof librodigital) {
                                System.out.println("Disponibilidad: " + ((librodigital) l).getDisponible(((librodigital) l).disponible));
                            }

                            int subopcion;
                            do {
                                System.out.println("Submenu");
                                System.out.println("1. Pedir prestado un libro");
                                System.out.println("2. Devolver libro");
                                System.out.println("0. Volver al menú principal");
                                System.out.print("Opcion: ");
                                subopcion = sc.nextInt();
                                sc.nextLine();

                                switch (subopcion) {
                                    case 1:
                                        if (l instanceof libroimpreso) {
                                            ((libroimpreso) l).prestar();
                                        } else if (l instanceof librodigital) {
                                            ((librodigital) l).prestar();
                                        }
                                        break;

                                    case 2:
                                        if (l instanceof libroimpreso) {
                                            ((libroimpreso) l).devolver();
                                        } else if (l instanceof librodigital) {
                                            ((librodigital) l).devolver();
                                        }
                                        break;

                                    case 0:
                                        System.out.println("Volviendo al menú principal ");
                                        break;

                                    default:
                                        System.out.println("Opcion invalida ");
                                }
                            } while (subopcion != 0);
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Libro no encontrado");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa ");
                    break;

                default:
                    System.out.println("Opcion invalida ");
                    break;
            }

        } while (opcion != 5);
    }
}
