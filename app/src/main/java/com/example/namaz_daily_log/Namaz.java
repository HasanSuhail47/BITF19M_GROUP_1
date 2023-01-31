package com.example.namaz_daily_log;

public class Namaz {




    private String fajrcheck;
    private String fajrcheck2;
    private String fajrrakat;

    private String dhurcheck;
    private String dhurcheck2;
    private String dhurrakat;

    private String asarcheck;
    private String asarcheck2;
    private String asarrakat;

    private String maghribcheck;
    private String maghribcheck2;
    private String maghribrakat;

    private String eshacheck;
    private String eshacheck2;
    private String esharakat;

    private String tahajjudcheck;
    private String tahajjudrakat;

    private String date;

    public Namaz(String fajrcheck, String fajrcheck2, String fajrrakat, String dhurcheck, String dhurcheck2, String dhurrakat, String asarcheck, String asarcheck2, String asarrakat, String maghribcheck, String maghribcheck2, String maghribrakat, String eshacheck, String eshacheck2, String esharakat, String tahajjudcheck, String tahajjudrakat, String date) {
        this.fajrcheck = fajrcheck;
        this.fajrcheck2 = fajrcheck2;
        this.fajrrakat = fajrrakat;
        this.dhurcheck = dhurcheck;
        this.dhurcheck2 = dhurcheck2;
        this.dhurrakat = dhurrakat;
        this.asarcheck = asarcheck;
        this.asarcheck2 = asarcheck2;
        this.asarrakat = asarrakat;
        this.maghribcheck = maghribcheck;
        this.maghribcheck2 = maghribcheck2;
        this.maghribrakat = maghribrakat;
        this.eshacheck = eshacheck;
        this.eshacheck2 = eshacheck2;
        this.esharakat = esharakat;
        this.tahajjudcheck = tahajjudcheck;
        this.tahajjudrakat = tahajjudrakat;
        this.date = date;
    }

    public String getFajrcheck() {
        return fajrcheck;
    }

    public String getFajrcheck2() {
        return fajrcheck2;
    }

    public String getFajrrakat() {
        return fajrrakat;
    }

    public String getDhurcheck() {
        return dhurcheck;
    }

    public String getDhurcheck2() {
        return dhurcheck2;
    }

    public String getDhurrakat() {
        return dhurrakat;
    }

    public String getAsarcheck() {
        return asarcheck;
    }

    public String getAsarcheck2() {
        return asarcheck2;
    }

    public String getAsarrakat() {
        return asarrakat;
    }

    public String getMaghribcheck() {
        return maghribcheck;
    }

    public String getMaghribcheck2() {
        return maghribcheck2;
    }

    public String getMaghribrakat() {
        return maghribrakat;
    }

    public String getEshacheck() {
        return eshacheck;
    }

    public String getEshacheck2() {
        return eshacheck2;
    }

    public String getEsharakat() {
        return esharakat;
    }

    public String getTahajjudcheck() {
        return tahajjudcheck;
    }

    public String getTahajjudrakat() {
        return tahajjudrakat;
    }

    public String getDate() {
        return date;
    }

    public void setFajrcheck(String fajrcheck) {
        this.fajrcheck = fajrcheck;
    }

    public void setFajrcheck2(String fajrcheck2) {
        this.fajrcheck2 = fajrcheck2;
    }

    public void setFajrrakat(String fajrrakat) {
        this.fajrrakat = fajrrakat;
    }

    public void setDhurcheck(String dhurcheck) {
        this.dhurcheck = dhurcheck;
    }

    public void setDhurcheck2(String dhurcheck2) {
        this.dhurcheck2 = dhurcheck2;
    }

    public void setDhurrakat(String dhurrakat) {
        this.dhurrakat = dhurrakat;
    }

    public void setAsarcheck(String asarcheck) {
        this.asarcheck = asarcheck;
    }

    public void setAsarcheck2(String asarcheck2) {
        this.asarcheck2 = asarcheck2;
    }

    public void setAsarrakat(String asarrakat) {
        this.asarrakat = asarrakat;
    }

    public void setMaghribcheck(String maghribcheck) {
        this.maghribcheck = maghribcheck;
    }

    public void setMaghribcheck2(String maghribcheck2) {
        this.maghribcheck2 = maghribcheck2;
    }

    public void setMaghribrakat(String maghribrakat) {
        this.maghribrakat = maghribrakat;
    }

    public void setEshacheck(String eshacheck) {
        this.eshacheck = eshacheck;
    }

    public void setEshacheck2(String eshacheck2) {
        this.eshacheck2 = eshacheck2;
    }

    public void setEsharakat(String esharakat) {
        this.esharakat = esharakat;
    }

    public void setTahajjudcheck(String tahajjudcheck) {
        this.tahajjudcheck = tahajjudcheck;
    }

    public void setTahajjudrakat(String tahajjudrakat) {
        this.tahajjudrakat = tahajjudrakat;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String tostring()
    {
        String s="Date:"+getDate()+"\n"+
                "Fajar:"+getFajrcheck()+"Jamat:"+getFajrcheck2()+" Rakat:"+getFajrrakat()+"\n"+
                "Dhur:"+getDhurcheck()+"Jamat:"+getDhurcheck2()+" Rakat:"+getDhurrakat()+"\n"+
                "Asar:"+getAsarcheck()+"Jamat:"+getAsarcheck2()+" Rakat:"+getAsarrakat()+"\n"+
                "Maghrib:"+getMaghribcheck()+"Jamat:"+getMaghribcheck()+" Rakat:"+getMaghribrakat()+"\n"+
                "Esha:"+getEshacheck()+"Jamat:"+getEshacheck2()+" Rakat:"+getEsharakat()+"\n"+
                "Tahajjud:"+getTahajjudcheck()+" Rakat:"+getTahajjudrakat()+"\n"+""
                ;
        return s;
    }
}
