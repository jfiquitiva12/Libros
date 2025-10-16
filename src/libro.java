public class libro {

    protected String codigo;
    protected String titulo;
    protected String autor;
    protected double precio;
    protected int cantidadejemplares;

    private static int contadorFisico = 0;
    private static int contadorDigital = 0;

    public libro () {
    }

    public libro(String codigo, String titulo, String autor, double precio, int cantidadejemplares) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.cantidadejemplares = cantidadejemplares;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    @Override
    public String toString() {
        return "libro{" +
                "codigo='" + codigo +
                ", titulo='" + titulo +
                ", autor='" + autor +
                ", precio=" + precio +
                ", cantidadejemplares=" + cantidadejemplares +
                "";
    }

    public String mostrarlibro(){
        return "Titulo: " + titulo + "Autor: " + autor + "Precio: " + precio;
    }

    public String generarCodigo(String tipo) {
        if (tipo.equalsIgnoreCase("fisico")) {
            contadorFisico++;
            return "LF" + contadorFisico;
        } else if (tipo.equalsIgnoreCase("digital")) {
            contadorDigital++;
            return "LD" + contadorDigital;
        } else {
            return "No existe";
        }
    }
}

