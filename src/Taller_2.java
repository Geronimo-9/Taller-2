public class Taller_2{
    public static void main(String[] args) {


Producto tottoPrime = new Producto("Totto", 49.90);
Producto mentaHelada_Fresa = new Producto("mentahelada", 100);

//Ejercicio 1
mentaHelada_Fresa.mostrarProducto();
tottoPrime.mostrarProducto();


// Ejercicio 2
Estudiante e1 = new Estudiante();
Estudiante e2 = new Estudiante("Gregorio", 18);


e1.datos();
e2.datos();





//Ejercicio 3 y ultimo de taller 2


Estudiante e3 = new Estudiante("Static man", 20);

Estudiante.test(e3); // ¡¡Amazing, :D!!
        

    }





}

