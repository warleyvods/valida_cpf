import static java.lang.Math.round;

public class GeradorCPF {

    public String geradorCPF() {
        int valor10;
        int valor11;
        int max = 8;
        int min = 0;
        int[] cpfNumeros = new int[10];

        int[] numeros = new int[9];

        for (int i = 0; i < 9; i++) {
            numeros[i] = (int) round((Math.random() * ((max - min) + 1)) + min);
        }

        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i] * (10 - i);
        }

        int dv = soma % 11;
        if (dv == 0 || dv == 1) {
            valor10 = 0;
        } else {
            valor10 = 11 - dv;
        }


        for (int i = 0; i < cpfNumeros.length; i++) {
            if (i == numeros.length) {
                cpfNumeros[i] = valor10;
            } else {
                cpfNumeros[i] = numeros[i];
            }
        }

        int soma2 = 0;
        for (int i = 1; i < cpfNumeros.length; i++) {
            soma2 = soma2 + cpfNumeros[i] * (11 - i);
        }

        int dv2 = soma2 % 11;
        if (dv2 == 0 || dv2 == 1) {
            valor11 = 0;
        } else {
            valor11 = 11 - dv2;
        }

        int[] cpfCompleto = new int[11];
        for (int i = 0; i < cpfCompleto.length; i++) {
            if (i == cpfCompleto.length - 1) {
                cpfCompleto[10] = valor11;
            } else {
                cpfCompleto[i] = cpfNumeros[i];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : cpfCompleto) {
            sb.append(i);
        }

        System.out.println("CPF Gerado: " + sb);

        return sb.toString();
    }

}
