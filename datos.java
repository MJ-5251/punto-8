public class datos {

    private String Nombre;
    private double Peso;
    private String Categoria;

    public datos(String nombre, double peso, String categoria) {
        Nombre = nombre;
        Peso = peso;
        Categoria = categoria;
    }
    
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public double getPeso() {
        return Peso;
    }
    public void setPeso(double peso) {
        Peso = peso;
    }
    public String getCategoria() {
        return Categoria;
    }
    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public datos() {
    }

}
