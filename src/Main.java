public class Main {
    public static void main(String[] args) {
        //construindo baloes
        Balao b1 = new Balao();
        // chamado metodo voar ()
        String resultado = b1.voar(new Combustivel());
        //exibindo resultado do voo
        System.out.println(resultado);
    }
}