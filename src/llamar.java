public class llamar {
    public static void main(String[] args) {
        System.out.println("datos del jugador 1");
        jugador jugador1=new jugador();
        System.out.println("datos del jugador 2");
        jugador jugador2=new jugador();
        System.out.println("el jugador 1");
        jugador1.patear();
        jugador1.correr();
        System.out.println("el jugador 2");
        jugador2.patear();
        jugador2.correr();
        jugador2.saltar();

    }
}



