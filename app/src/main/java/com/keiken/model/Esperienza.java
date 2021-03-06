package com.keiken.model;

import java.util.*;

public class Esperienza {

    private String titolo, descrizione, luogo, ID_CREATORE, prezzo;
    private ArrayList<String> categorie;
    private HashMap<Date, Long> date;
    private long ore, minuti, nPostiDisponibili;
    private String photoUri;
    private String ID_ESPERIENZA;
    private String ID_PRENOTAZIONE_ASSOCIATA;

    private Date data_prenotazione;

    //COSTRUTTORE ESPERIENZA CON PIù DATE
    public Esperienza(String titolo, String descrizione, String luogo, String ID_CREATORE, String prezzo, ArrayList<String> categorie, HashMap<Date, Long> date, long ore, long minuti, long nPostiDisponibili, String photoUri, String ID_ESPERIENZA) {
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.luogo = luogo;
        this.ID_CREATORE = ID_CREATORE;
        this.prezzo = prezzo;
        this.categorie = new ArrayList<String>(categorie);
        this.date = date;
        this.ore = ore;
        this.minuti = minuti;
        this.nPostiDisponibili = nPostiDisponibili;
        this.photoUri = photoUri;
        this.ID_ESPERIENZA=ID_ESPERIENZA;
    }

    //COSTRUTTORE PER ESPERIENZA CON UNA SINGOLA DATA
    public Esperienza(String titolo, String descrizione, String luogo, String ID_CREATORE, String prezzo, ArrayList<String> categorie, Date data_prenotazione, long ore, long minuti, long nPostiDisponibili, String photoUri, String ID_ESPERIENZA) {
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.luogo = luogo;
        this.ID_CREATORE = ID_CREATORE;
        this.prezzo = prezzo;
        this.categorie = new ArrayList<String>(categorie);
        this.data_prenotazione = data_prenotazione;
        this.ore = ore;
        this.minuti = minuti;
        this.nPostiDisponibili = nPostiDisponibili;
        this.photoUri = photoUri;
        this.ID_ESPERIENZA=ID_ESPERIENZA;
    }

    public Esperienza(String titolo, String descrizione, String luogo, String ID_CREATORE, String prezzo, ArrayList<String> categorie, Date data_prenotazione, long ore, long minuti, long nPostiDisponibili, String photoUri, String ID_ESPERIENZA, String ID_PRENOTAZIONE_ASSOCIATA) {
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.luogo = luogo;
        this.ID_CREATORE = ID_CREATORE;
        this.prezzo = prezzo;
        this.categorie = categorie;
        this.ore = ore;
        this.minuti = minuti;
        this.nPostiDisponibili = nPostiDisponibili;
        this.photoUri = photoUri;
        this.ID_ESPERIENZA = ID_ESPERIENZA;
        this.ID_PRENOTAZIONE_ASSOCIATA = ID_PRENOTAZIONE_ASSOCIATA;
        this.data_prenotazione = data_prenotazione;
    }
    // GETTERS & SETTERS


    public String getID_PRENOTAZIONE_ASSOCIATA() {
        return ID_PRENOTAZIONE_ASSOCIATA;
    }

    public String getID_ESPERIENZA() { return ID_ESPERIENZA; }

    public String getPhotoUri() { return photoUri; }
    public String getID_CREATORE() { return  ID_CREATORE; }

    public String getTitolo() {
        return titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getLuogo() {
        return luogo;
    }

    public String getPrezzo() {
        return prezzo;
    }

    public ArrayList<String> getCategorie() {
        return categorie;
    }

    public HashMap<Date, Long> getDate() {
        return date;
    }

    public long getOre() {
        return ore;
    }

    public long getMinuti() {
        return minuti;
    }

    public long getnPostiDisponibili() {
        return nPostiDisponibili;
    }

    public Date getData_prenotazione() {
        return data_prenotazione;
    }
}


