public class Sinif {
    public static void main(String[] args) {
        Ogrenci[] ogrenciler={

                new Ogrenci("Kaan","Bilgisayar Müh",3.8,2020,"135","005"),
                new Ogrenci("Berat","Endüstri Müh",3.4,2022,"146","031"),
                new Ogrenci("Hande ","Tıp ",3.0,2019,"151","002"),
                new Ogrenci("Nisa","Tıp",3.5,2019,"140","001")};
        for (Ogrenci o:ogrenciler){
            if(o.getGano()<0||o.getGano()>4)
                throw  new IllegalArgumentException("GANO geçersiz");
        }
        System.out.println("OGR 1 :"+ogrenciler[0].getAd()+" "+ogrenciler[0].getBolum()+" "+ogrenciler[0].getGano()+" "+ogrenciler[0].ogrenciNoOlustur());
        System.out.println("OGR 2 :"+ogrenciler[1].getAd()+" "+ogrenciler[1].getBolum()+" "+ogrenciler[1].getGano()+" "+ogrenciler[1].ogrenciNoOlustur());
        System.out.println("OGR 3 :"+ogrenciler[2].getAd()+" "+ogrenciler[2].getBolum()+" "+ogrenciler[2].getGano()+" "+ogrenciler[2].ogrenciNoOlustur());
        System.out.println("OGR 4 :"+ogrenciler[3].getAd()+" "+ogrenciler[3].getBolum()+" "+ogrenciler[3].getGano()+" "+ogrenciler[3].ogrenciNoOlustur());
        System.out.println("3. öğrencinin ödeyeceği harç: "+ogrenciler[2].harcHesaplama(9));
        System.out.println("4. öğrencinin ödeyeceği harç: "+ogrenciler[3].harcHesaplama(8,2));
    }
}