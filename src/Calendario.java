public class Calendario {
    public String mese = "Febbraio";
    public int giorno = 1;

    public void controlloMeseGiorno() {
        switch (mese) {
            case "Gennaio":
                if (giorno >= 1 && giorno <= 31) {
                    System.out.println("Corso non ancora iniziato");
                } else {
                    System.out.println("Giorno non valido");
                }
                break;
            case "Marzo":
                if (giorno >= 1 && giorno <= 4) {
                    System.out.println("Lezione Web");
                } else if (giorno == 5) {
                    System.out.println("Lezione Dasa");
                } else if (giorno > 5 && giorno <= 10) {
                    System.out.println("Lezione Java");
                } else if (giorno == 11) {
                    System.out.println("Lezione GitHub");
                } else if (giorno > 11 && giorno <= 31) {
                    System.out.println("Lezione Java");
                } else {
                    System.out.println("Giorno non valido");
                }
                break;
            case "Maggio":
                if (giorno == 1) {
                    System.out.println("Giorno festivo");
                } else if (giorno > 1 && giorno <= 8) {
                    System.out.println("Lezione Java Spring");
                } else if (giorno > 8 && giorno <= 21) {
                    System.out.println("Project Work");
                } else if (giorno > 21 && giorno <= 30) {
                    System.out.println("Corso terminato");
                } else if (giorno == 31) {
                    System.out.println("Corso non presente");
                } else {
                    System.out.println("Giorno non valido");
                }
                break;

            case "Luglio":
                if (giorno >= 1 && giorno <= 31) {
                    System.out.println("Corso non presente");
                } else {
                    System.out.println("Giorno non valido");
                }
                break;
            case "Agosto":
                if (giorno >= 1 && giorno <= 31) {
                    System.out.println("Corso non presente");
                } else {
                    System.out.println("Giorno non valido");
                }
                break;
            case "Ottobre":
                if (giorno >= 1 && giorno <= 31) {
                    System.out.println("Corso non presente");
                } else {
                    System.out.println("Giorno non valido");
                }
                break;
            case "Dicembre":
                if (giorno >= 1 && giorno <= 31) {
                    System.out.println("Corso non presente");
                } else {
                    System.out.println("Giorno non valido");
                }
                break;
            case "Aprile":
                if (giorno >= 1 && giorno <= 8) {
                    System.out.println("Lezione Java");
                } else if (giorno > 8 && giorno <= 17) {
                    System.out.println("Lezione Database");
                } else if (giorno > 17 && giorno <= 20) {
                    System.out.println("Lezione JDBC");
                } else if (giorno == 21 || giorno == 25) {
                    System.out.println("Giorno festivo");
                } else if (giorno > 21 && giorno <= 23) {
                    System.out.println("Lezione JDBC");
                } else if (giorno == 24) {
                    System.out.println("Lezione Java Spring");
                } else if (giorno > 25 && giorno <= 30) {
                    System.out.println("Lezione Java Spring");
                } else {
                    System.out.println("Giorno non valido");
                }
                break;
            case "Giugno":
                if (giorno >= 1 && giorno <= 30) {
                    System.out.println("Corso non presente");
                } else {
                    System.out.println("Giorno non valido");
                }
                break;
            case "Settembre":
                if (giorno >= 1 && giorno <= 30) {
                    System.out.println("Corso non presente");
                } else {
                    System.out.println("Giorno non valido");
                }
                break;
            case "Novembre":
                if (giorno >= 1 && giorno <= 30) {
                    System.out.println("Corso non presente");
                } else {
                    System.out.println("Giorno non valido");
                }
                break;
            case "Febbraio":
                if (giorno >= 1 && giorno <= 12) {
                    System.out.println("Corso non ancora avviato");
                } else if (giorno > 12 && giorno <= 28) {
                    System.out.println("Lezione Web");
                } else {
                    System.out.println("Giorno non valido");
                }
                break;
            default:
                System.out.println("Nome del mese non valido");
        }
    }

    
    public void controlloSegnoZodicale() {
        switch (mese) {
            case "Gennaio":
                if (giorno >= 1 && giorno <= 19) {
                    System.out.println("Capricorno");
                } else if (giorno >= 20 && giorno <= 31) {
                    System.out.println("Acquario");
                } else {
                    System.out.println("Giorno non valido");
                }
                break;
            case "Marzo":
                if (giorno >= 1 && giorno <= 20) {
                    System.out.println("Pesci");
                } else if (giorno >= 21 && giorno <= 31) {
                    System.out.println("Ariete");
                } else {
                    System.out.println("Giorno non valido");
                }
                break;
            case "Maggio":
                if (giorno > 1 && giorno <= 20) {
                    System.out.println("Toro");
                } else if (giorno >= 21 && giorno <= 31) {
                    System.out.println("Gemelli");
                } else {
                    System.out.println("Giorno non valido");
                } break;

            case "Luglio":
                if (giorno >= 1 && giorno <= 22) {
                    System.out.println("Cancro");
                } else if (giorno >= 23 && giorno <= 31) {
                    System.out.println("Leone");
                } else {
                    System.out.println("Giorno non valido");
                }
                break;
            case "Agosto":
                if (giorno >= 1 && giorno <= 23) {
                    System.out.println("Leone");
                } else if (giorno >= 24 && giorno <= 31) {
                    System.out.println("Vergine");
                } else {
                    System.out.println("Giorno non valido");
                }
                break;
            case "Ottobre":
                if (giorno >= 1 && giorno <= 22) {
                    System.out.println("Bilancia");
                } else if (giorno >= 23 && giorno <= 31) {
                    System.out.println("Scorpione");
                } else {
                    System.out.println("Giorno non valido");
                }
                break;
            case "Dicembre":
                if (giorno >= 1 && giorno <= 21) {
                    System.out.println("Sagittario");
                } else if (giorno >= 22 && giorno <= 31) {
                    System.out.println("Capricorno");
                } else {
                    System.out.println("Giorno non valido");
                }
                break;
            case "Aprile":
                if (giorno >= 1 && giorno <= 19) {
                    System.out.println("Ariete");
                } else if (giorno >= 20 && giorno <= 30) {
                    System.out.println("Toro");
                } else {
                    System.out.println("Giorno non valido");
                }
                break;
            case "Giugno":
                if (giorno >= 1 && giorno <= 20) {
                    System.out.println("Gemelli");
                } else if (giorno >= 21 && giorno <= 30) {
                    System.out.println("Cancro");
                } else {
                    System.out.println("Giorno non valido");
                }
                break;
            case "Settembre":
                if (giorno >= 1 && giorno <= 22) {
                    System.out.println("Vergine");
                } else if (giorno >= 23 && giorno <= 30) {
                    System.out.println("Bilancia");
                } else {
                    System.out.println("Giorno non valido");
                }
                break;
            case "Novembre":
                if (giorno >= 1 && giorno <= 21) {
                    System.out.println("Scorpione");
                } else if (giorno >= 22 && giorno <= 30) {
                    System.out.println("Sagittario");
                } else {
                    System.out.println("Giorno non valido");
                }
                break;
            case "Febbraio":
                if (giorno >= 1 && giorno <= 19) {
                    System.out.println("Acquario");
                } else if (giorno >= 20 && giorno <= 29) {
                    System.out.println("Pesci");
                } else {
                    System.out.println("Giorno non valido");
                }
                break;
            default:
                System.out.println("Nome del mese non valido");
        }
    }   
    

}