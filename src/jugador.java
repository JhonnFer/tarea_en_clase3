import java.util.Scanner;

public class jugador {
    String avatar;
    int edad;
    String pais;


    public jugador() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del avatar:");
        this.avatar = scanner.nextLine();

        System.out.println("Ingrese la edad del jugador:");
        this.edad = scanner.nextInt();


        scanner.nextLine();

        System.out.println("Ingrese el país del jugador:");
        this.pais = scanner.nextLine();
    }


    public jugador(String avatar, int edad, String pais) {
        this.avatar = avatar;
        this.edad = edad;
        this.pais = pais;
    }


    public void patear() {
        System.out.println("El jugador: " + avatar +
                "----------------------" +
                "ha pateado y su edad es: " + edad +
                "----------------------" +
                "del país: " + pais);
    }


    public void correr() {
        System.out.println("El jugador: " + avatar +
                "----------------------" +
                "ha corrido y su edad es: " + edad +
                "----------------------" +
                "del país: " + pais);
    }


    public void saltar() {
        System.out.println("El jugador: " + avatar +
                "----------------------" +
                "ha saltado y su edad es: " + edad +
                "----------------------" +
                "del país: " + pais);
    }
}


