public class libroimpreso extends libro {
    private String peso;


    public libroimpreso() {
    }

    public libroimpreso(String codigo, String titulo, String autor, double precio, int cantidadejemplares, String peso) {
        super(codigo, titulo, autor, precio, cantidadejemplares);
        this.peso = peso;
    }

    public String getPeso() {
        return peso;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }


    @Override
    public String mostrarlibro() {
        return super.mostrarlibro() +
        "Peso: " + peso +
        "Numero de libros fisicos: " + cantidadejemplares;
    }

    public void prestar() {
        if (cantidadejemplares > 0) {
            cantidadejemplares--;
            System.out.println("Libro impreso prestado correctamente ");
        } else {
            System.out.println("No hay libros impresos disponibles ");
        }
    }

    public void devolver() {
        if (cantidadejemplares < 2) {
            cantidadejemplares++;
            System.out.println("Libro impreso devuelto correctamente ");
        } else {
            System.out.println("No se pueden devolver más de dos libros disponibles ");
        }
    }

}
