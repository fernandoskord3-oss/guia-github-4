import com.uped.proyecto.modelo.Vehículo;

public class Main {
    public static void main(String[] args) {
        Vehículo v1 = Vehículo.nuevo("P123-789", "Kia");
        System.out.println(v1);
        v1.recorrer(150);
        System.out.println(v1);
        v1.recorrer(-20);
    }
}
