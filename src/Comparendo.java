public class Comparendo {
    Vehiculo vehiculo;
    public Comparendo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public void construirFotoMulta(int velocidad) {
        int tipoComparendo = calcularComparendo(velocidad);
        String txt = enviarCorreoFotomulta();
        System.out.println("----El tipo de comparendo es: " + tipoComparendo + " ----Cuerpo del correo" + txt);
    }
    public int calcularComparendo(int velocidad) {
        if(velocidad <= vehiculo.getLimiteInferior()) {
            return 0;
        }else if (velocidad >= vehiculo.getLimiteInferiorIntermedio() && velocidad <= vehiculo.getLimiteSuperior()) {
            return 1;
        }
        return 2;
    }
    public String enviarCorreoFotomulta() {
        String cuerpoMensaje = "//Enviando correo para el tipo " + vehiculo.getTipo() + ".\n";
        String asunto = "//Asunto Comparendo: " + vehiculo.getTipo() + ".\n";
        return asunto + cuerpoMensaje;
    }
}