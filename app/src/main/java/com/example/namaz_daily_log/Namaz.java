package com.example.namaz_daily_log;

public class Namaz {
    private String name;
    private boolean isprayed;
    private boolean isprayedjamat;
    private int rakat;

    public boolean getisIsprayed() {
        return isprayed;
    }

    public String getName() {
        return name;
    }

    public boolean getisIsprayedjamat() {
        return isprayedjamat;
    }
    public int getrakat()
    {
        return rakat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsprayed(boolean isprayed) {
        this.isprayed = isprayed;
    }

    public void setIsprayedjamat(boolean isprayedjamat) {
        this.isprayedjamat = isprayedjamat;
    }

    public void setRakat(int rakat) {
        this.rakat = rakat;
    }

    @Override
    public String toString() {
        return "Namaz [name=" + name + ", isprayed=" + isprayed + ", isprayedjamat=" + isprayedjamat + ",rakat="+rakat+"]";
    }

}
