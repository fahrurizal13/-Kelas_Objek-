class mobil{
    String warna;
    int tahunProduksi;
    
    void isiData(String warnaMobil, int tahunProduksiMobil){
        warna = warnaMobil;
        tahunProduksi = tahunProduksiMobil;
    }
    
    String ambilWarna(){
        return warna;
    }
    
    int ambilTahunProduksi(){
        return tahunProduksi;
    }
}
public class KelasMobil2 {
    public static void main(String[] args){
        mobil mobilku = new mobil();
        
        mobilku.isiData("Hijau", 2020);
        
        System.out.println("Warna :"+ mobilku.ambilWarna());
        System.out.println("Tahun :"+ mobilku.ambilTahunProduksi());
    }
}
