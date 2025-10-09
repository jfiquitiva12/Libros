public class libro {
    protected String titulo;
    protected String autor;
    protected double precio;
    protected int cantidadejemplares;


    public libro () {
    }

    public libro( String titulo, String autor, double precio, int cantidadejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.cantidadejemplares = cantidadejemplares;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadejemplares() {
        return cantidadejemplares;
    }
    public void setCantidadejemplares(int cantidadejemplares) {
        this.cantidadejemplares = cantidadejemplares;
    }

    public String mostrarlibro(){
        return "Titulo: " + titulo + "Autor: " + autor + "Precio: " + precio;
    }


}
