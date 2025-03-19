public class Calendario {
    public String mese = "Febbraio";
    public int meseMaxGiorni = 0;

    public void controlloMese() {
        switch (mese) {
            case "Gennaio":
            case "Marzo":
            case "Maggio":
            case "Luglio":
            case "Agosto":
            case "Ottobre":
            case "Dicembre":
                meseMaxGiorni = 31;

                break;
            case "Aprile":
            case "Giugno":
            case "Settembre":
            case "Novembre":
                meseMaxGiorni = 30;

                break;
            case "Febbraio":
                meseMaxGiorni = 28;
                
                break;
            default:
                System.out.println("Nome del mese non valido");

        }
    }

}