package modell;

import nezet.KartyaTrukk;

public class Pakli {

    KartyaTrukk szoveg = new KartyaTrukk();
    private Lap[] lapok ;

    public Pakli() {
        lapok = new Lap[22];
        feltolt();
    }

    private void feltolt() {

        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int j = 1;
        for (String szin : szinek) {
            for (int a = 0; a < ertekek.length && j < lapok.length; a++) {
                Lap lap = new Lap(szin + "_" + ertekek[a]);
                lapok[j++] = lap;
            }
        }

    }

    public void kirak() {

        for (int i = 1; i < lapok.length; i++) {
            szoveg.kiirkartya(lapok[i].getLeiras());
            if (i % 3 == 0) {
                szoveg.kiir("\n");
            }
        }
    }
//    public Lap[] getLapok() {
//        return lapok;
//    }

    public void kever(int oszlop) {
        // mindig középre a választott
        Lap[] ujPakli = new Lap[22];
        switch (oszlop) {
            case 1:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = this.lapok[20 - (i - 1) * 3];
                    ujPakli[i + 7] = this.lapok[19 - (i - 1) * 3];
                    ujPakli[i + 14] = this.lapok[21 - (i - 1) * 3];
                }
                break;
            case 2:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = this.lapok[19 - (i - 1) * 3];
                    ujPakli[i + 7] = this.lapok[20 - (i - 1) * 3];
                    ujPakli[i + 14] = this.lapok[21 - (i - 1) * 3];
                }
                break;
            case 3:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = this.lapok[19 - (i - 1) * 3];
                    ujPakli[i + 7] = this.lapok[21 - (i - 1) * 3];
                    ujPakli[i + 14] = this.lapok[20 - (i - 1) * 3];
                }
                break;
        }
        this.lapok = ujPakli;
    }

    
//    public void setLapok(Lap[] lapok) {
//        this.lapok = lapok;
//    }

   
    public void ezVolt() {
        szoveg.kiir("A választott lap: " + lapok[11]);
    }

}