package ayiacademy.tp1.ejercicio2.persistence.entities;

public class Estado {
    public static final int ACTIVO = 1;
    public static final int INACTIVO = 2;
    public static final int DADO_DE_BAJA = 3;

    public static String toString(int estado) {
        switch (estado) {
            case ACTIVO:
                return "Activo";
            case INACTIVO:
                return "Inactivo";
            case DADO_DE_BAJA:
                return "Dado de baja";
            default:
                throw new IllegalArgumentException("Estado inexistente");
        }
    }
}
