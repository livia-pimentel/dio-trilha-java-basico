public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "B";

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Whats e Instagram grátis");
            } // quando não usa o break ele vai executar o que for verdadeiro com a variavel e os logo abaixo da instrução.
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
