public class FormatadorCep {
    
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23456000");
            System.out.println(cepFormatado);


        } catch (CepInvalidoException e) {
            System.out.println("O Cep não contem 8 digitos");
        }
        

    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();


            return "23.765-064";

    }
}
