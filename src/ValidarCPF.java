public class ValidarCPF {

    public void validarCPF(String x) {

        String[] cpf = x.split("");

        int valor10;
        int valor11;
        int valorRegiao = Integer.parseInt(cpf[8]);

        int soma = 0;
        for (int i = 0; i < cpf.length - 2; i++) {
            soma = soma + Integer.parseInt(cpf[i]) * (10 - i);
        }

        int dv = soma % 11;
        if (dv == 0 || dv == 1) {
            valor10 = 0;
        } else {
            valor10 = 11 - dv;
        }

        int soma2 = 0;
        for (int i = 1; i < cpf.length - 1; i++) {
            if (Integer.parseInt(cpf[i]) == Integer.parseInt(cpf[9])) {
                cpf[9] = String.valueOf(valor10);
            }
            soma2 = soma2 + Integer.parseInt(cpf[i]) * (11 - i);
        }

        int dv2 = soma2 % 11;
        if (dv2 == 0 || dv2 == 1) {
            valor11 = 0;
        } else {
            valor11 = 11 - dv2;
        }

        if (valor10 == Integer.parseInt(cpf[9]) && valor11 == Integer.parseInt(cpf[10])) {
            System.out.println("CPF VALIDO !");
        } else {
            System.out.println("CPF INVALIDO");
        }

        if (valorRegiao == 1) {
            System.out.println("Regiao: DF, GO, MT, MS e TO");
        } else if (valorRegiao == 2) {
            System.out.println("Regiao:  AC, AP, AM, PA, RO e RR");
        } else if (valorRegiao == 3) {
            System.out.println("Regiao: CE, MA e PI;");
        } else if (valorRegiao == 4) {
            System.out.println("Regiao:  AL, PB, PE e RN;");
        } else if (valorRegiao == 5) {
            System.out.println("Regiao:  BA e SE;");
        } else if (valorRegiao == 6) {
            System.out.println("Regiao:  MG;");
        } else if (valorRegiao == 7) {
            System.out.println("Regiao: ES, RJ");
        } else if (valorRegiao == 8) {
            System.out.println("Regiao:  SP;");
        } else if (valorRegiao == 9) {
            System.out.println("Regiao:  PR e SC");
        } else {
            System.out.println("Regiao:  RS");
        }

    }

}
