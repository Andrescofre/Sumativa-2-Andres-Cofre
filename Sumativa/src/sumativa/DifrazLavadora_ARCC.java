package sumativa;

class DisfrazLavadora_ARCC extends Outfit_ARCC {
    public DisfrazLavadora_ARCC(String color_ARCC) {
        super(color_ARCC);
    }

    public void aplicarOutfit_ARCC() {
        System.out.println("Aplicando disfraz de lavadora de color " + color_ARCC + ". El robot es literalmente una lavadora con problemas de ira.");
    }
}