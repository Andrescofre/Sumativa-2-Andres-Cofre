package sumativa;

public class Robot_ARCC {
    Mano_ARCC manoIzquierda_ARCC = new Mano_ARCC();
    Mano_ARCC manoDerecha_ARCC = new Mano_ARCC();
    Pierna_ARCC piernaIzquierda_ARCC = new Pierna_ARCC();
    Pierna_ARCC piernaDerecha_ARCC = new Pierna_ARCC();
    Torso_ARCC torso_ARCC = new Torso_ARCC();
    Cabeza_ARCC cabeza_ARCC = new Cabeza_ARCC();

    public void mostrarEstado_ARCC() {
        System.out.println("Operativo: Buscando objetivos");
        piernaIzquierda_ARCC.encendido_ARCC();
        piernaDerecha_ARCC.encendido_ARCC();
        piernaIzquierda_ARCC.volar_ARCC();
        piernaDerecha_ARCC.volar_ARCC();
        manoIzquierda_ARCC.apuntar_ARCC();
        manoIzquierda_ARCC.disparar_ARCC();
        torso_ARCC.recargar_ARCC();
        torso_ARCC.energia_ARCC();
        cabeza_ARCC.buscar_ARCC();
        cabeza_ARCC.comunicacion_ARCC();
    }
}