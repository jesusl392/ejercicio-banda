public class Main {
    public static void main(String[] args) {
        Banda banda1 = new Banda("band 1", "rock", 5);
        Banda banda2 = new Banda("band 2", "funk", 3);
        Banda banda3 = new Banda("band 3", "pop", 6);
        banda3.presentarse();
        banda2.guitarra();
        banda3.bateria();
        banda3.genero();
    }
}