public class Estudiante {
    private String nombre;
    private int edad;


    public Estudiante(String nombre, int edad){
        this.edad = edad;
        this.nombre = nombre;
    }

    public Estudiante(){
        this("Elena", 28);

    }

    public void datos(){
        System.out.println("Nombre estudiante: "+nombre+", Edad: "+edad+" ");
    }









}
