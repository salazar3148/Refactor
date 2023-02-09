public abstract class Vehiculo {
    protected int limiteInferior;
    protected int limiteInferiorIntermedio;
    protected int limiteSuperior;
    protected String tipo;

    public Vehiculo(int limiteInferior, int limiteInferiorIntermedio, int limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteInferiorIntermedio = limiteInferiorIntermedio;
        this.limiteSuperior = limiteSuperior;
    }

    public int getLimiteInferior() {
        return limiteInferior;
    }

    public int getLimiteInferiorIntermedio() {
        return limiteInferiorIntermedio;
    }

    public int getLimiteSuperior() {
        return limiteSuperior;
    }

    public String getTipo() {
        return tipo;
    }
}
