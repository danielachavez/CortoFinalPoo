
package modelo;

/**
 *
 * @author UCA
 */
public class Filtro {
     private int id;
    private String  nombres;
    private String apellidos;
    private int afp;
    private int edad;
    private String profesion;
    private boolean estado;    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getAFP() {
        return afp;
    }

    public void setAFP(int afp) {
        this.afp = afp;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
        
    
    public Filtro(){}
    public Filtro(int id, int afp, String nombre, String apellido, int edad, String profesion, boolean estado){
        this.id = id;
        this.afp = afp;
        this.nombres = nombre;
        this.edad = edad;
        this.estado = estado;
        this.apellidos = apellido;
        this.profesion = profesion;
    }
    
    public Filtro(String nombre, String apellido, String profesion, int edad, boolean estado, int afp){
        this.afp = afp;
        this.nombres = nombre;
        this.edad = edad;
        this.estado = estado;
        this.apellidos = apellido;
        this.profesion = profesion;
    }
    
    /*public Filtro(String marca, int stock, boolean existencia){
        this.marca = marca;
        this.stock = stock;
        this.existencia = existencia;
    }*/
}
