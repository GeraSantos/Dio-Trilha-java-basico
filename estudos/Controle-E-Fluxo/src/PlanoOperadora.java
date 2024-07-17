public class PlanoOperadora {
    
    public static void main(String[] args) {
        
        String plano = "Basic";

        // if(plano == "Basic"){
        //     System.out.println("100 minutos de ligação");
        // } else if (plano == "Midia"){
        //     System.out.println("100 minutos de ligação");
        //     System.out.println("Whats e instagran gratis");
        // } else if(plano == "Advance"){
        //     System.out.println("100 minutos de ligação");
        //     System.out.println("Whats e instagran gratis");
        //     System.out.println("5GB e YouTube ");
        // }

        switch (plano) {
            case "Basic":
                System.out.println("100 minutos de ligação");
                break;

            case "Midia":
                System.out.println("100 minutos de ligação");
                System.out.println("Whats e instagran gratis");
                break;

            case "Advance":
                System.out.println("100 minutos de ligação");
                System.out.println("Whats e instagran gratis");
                System.out.println("5GB e YouTube ");
                break;
        
            default:
                break;
        }
    }
}
