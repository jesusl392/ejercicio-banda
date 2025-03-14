public class Banda {

    String nombre;
    String genero;
    int integrantes;


    public Banda(String nombre, String genero, int integrantes) {
        this.nombre = nombre;
        this.genero = genero;
        this.integrantes = integrantes;
    }


    public void guitarra() {
        System.out.println(nombre + " empezo a tocar la guitarra");
    }

    public void bateria() {
        System.out.println(nombre + " empezo a tocar la bateria");
    }

    public void presentarse() {
        System.out.println("la banda se llama: " + nombre + " y tiene " + integrantes + " integrantes");
    }
    public void genero(){
        System.out.println("la banda toca: " +  genero);
    }
}

