public class Ogrenci {
    private String ad;
    private String bolum;
    private double gano;
    private int girisYili;
    private String bolumKodu;
    private String girisSirasi;

    public Ogrenci(String ad,String bolum){
        this.ad=ad;
        this.bolum=bolum;
    }
    public Ogrenci(Ogrenci ogrenci){
        this.bolum=bolum;
        this.ad=ad;
        this.gano=gano;
        this.girisYili=girisYili;
        this.bolumKodu=bolumKodu;
        this.girisSirasi=girisSirasi;



    }
    public Ogrenci(String ad,String bolum,double gano,int girisYili,String bolumKodu,String girisSirasi){
        this.bolum=bolum;
        this.ad=ad;
        this.gano=gano;
        this.girisYili=girisYili;
        this.bolumKodu=bolumKodu;
        this.girisSirasi=girisSirasi;

    }

    public double harcHesaplama(int dersSayisi,double UzattigiYil){

        return UzattigiYil*dersSayisi*50;



    }
    public double harcHesaplama(int dersSayisi){
        return dersSayisi*50;
    }
    public String ogrenciNoOlustur(){
        String ogrenciNo=girisYili+bolumKodu+girisSirasi;
        return ogrenciNo;
    }
    public Ogrenci(){

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public String getBolumKodu() {
        return bolumKodu;
    }

    public void setBolumKodu(String bolumKodu) {
        this.bolumKodu = bolumKodu;
    }
}