package Clase10EjercicioDos;

public class Persona {

    private int id;
    private String nombre;

    private String apellido;
    private int edad;
    private String fechaDeNacimiento;
    private Long documentoDeIdentidad;

    public Persona(){
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setDocumentoDeIdentidad(Long documentoDeIdentidad) {
        this.documentoDeIdentidad = documentoDeIdentidad;
    }

    @Override
    public String toString() {
        return "Clase10EjercicioDos.Persona{" +
                "\n  id = " + id +
                "\n  nombre = '" + nombre + '\'' +
                "\n  apellido = '" + apellido + '\'' +
                "\n  edad = " + edad +
                "\n  fechaDeNacimiento = " + fechaDeNacimiento +
                "\n  documentoDeIdentidad = " + documentoDeIdentidad +
                "\n}";
    }

    public boolean esMayorDeEdad() {

        return edad >= 18;
    }
}
