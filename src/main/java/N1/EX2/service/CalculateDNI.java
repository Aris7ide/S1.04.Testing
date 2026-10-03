package N1.EX2.service;

public class CalculateDNI {

    private static final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";

    public char calcularLetra(String numeroDni) {
        if (numeroDni == null || !numeroDni.matches("\\d{8}")) {
            throw new IllegalArgumentException("El DNI debe tener exactamente 8 dígitos.");
        }
        int numeroDniInt = Integer.parseInt(numeroDni);
        int resto = numeroDniInt % 23;
        return LETRAS_DNI.charAt(resto);
    }
}
