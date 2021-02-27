public class CPF {
    public static void main(String[] args) {

        GeradorCPF ge = new GeradorCPF();
        ValidarCPF v = new ValidarCPF();
        v.validarCPF(ge.geradorCPF());

    }
}
