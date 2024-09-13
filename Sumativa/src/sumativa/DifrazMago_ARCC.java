package sumativa;

class DisfrazMago_ARCC extends Outfit_ARCC {
    public DisfrazMago_ARCC(String color_ARCC) {
        super(color_ARCC);
    }

    public void aplicarOutfit_ARCC() {
        System.out.println("Aplicando disfraz de mago de color " + color_ARCC + ". El robot lleva un sombrero puntiagudo, una capa y una barba pegada con la gotita.");
    }
}
