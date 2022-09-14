public class SentenciaSwitch {
    public static void main(String[] args) {
        var estacion = "Verano";

        switch (estacion.toLowerCase()){
            case "verano":
                System.out.println("Es verano!!!");
                break;
            case "invierno":
                System.out.println("Es invierno!!!");
                break;
            case "otoño":
                System.out.println("Es otoño!!!");
                break;
            default:
                System.out.println("Estacion no registrada");

        }
    }
}
