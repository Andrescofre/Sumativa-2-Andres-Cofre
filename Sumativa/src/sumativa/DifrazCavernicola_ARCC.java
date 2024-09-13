package sumativa;

class DisfrazCavernicola_ARCC extends Outfit_ARCC {
    public DisfrazCavernicola_ARCC(String color_ARCC) {
        super(color_ARCC);
    }

    public void aplicarOutfit_ARCC() {
        System.out.println("Aplicando disfraz de cavernícola de color " + color_ARCC + ". El robot lleva una vestimenta hecha de pieles y un hueso en la cabeza.");
    }
}
