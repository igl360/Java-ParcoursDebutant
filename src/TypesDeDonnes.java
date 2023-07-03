public class TypesDeDonnes {
    public static void main(String[] args) {

        boolean faitTilBeau = true; //binaire

        byte unByte = 3; //1octet => 8bits => -128<byte<127 soit 256 valeurs possibles

        char unCaractere = 'C'; //2octets => 16bits => -32768<char<32767 soit 65535 valeurs possibles

        short nombreDeBallons = 7; //2octets => 16bits => -32768<short<32767 soit 65535 valeurs possibles

        int age = 35; //4octets => 32bits => -2,1milliards<int<2,1milliards soit 4,2milliards valeurs possibles

        long chiffreDaffaire = 34575L; //8octets => 64bits => Je vous laisse faire le calcul

        float petitNombreDecimal = 7.3f; //4octets => 32bits //8octets => 64bits

        double grandNombreDecimal = 97345.37d; //8octets => 64bits

        System.out.println("Fait-il vraiment beau? La réponse est: " + faitTilBeau);
        System.out.println("le byte renseigné est: " + unByte);
        System.out.println("le caractère renseigné est: " + unCaractere);
        System.out.println("Le nombre de ballons est de: " + nombreDeBallons);
        System.out.println("L'âge renseigné est de: " + age);
        System.out.println("Le C.A de l'entreprise est de: " + chiffreDaffaire);
        System.out.println("Ce petit nombre décimal vaut: " + petitNombreDecimal);
        System.out.println("Ce grand nombre décimal vaut: " + grandNombreDecimal);

    }
}
