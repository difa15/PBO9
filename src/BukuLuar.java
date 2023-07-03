import java.time.LocalDate;
public class BukuLuar extends Buku {
    public BukuLuar(String idBuku, String namaBuku) {
        super(idBuku, namaBuku);
        //TODO Auto-generated constructor stub
    }
    private String imporOleh;
    private LocalDate tglImpor;

    
    public void setImporOleh (String imporOleh){
        this.imporOleh = imporOleh;
    }
    public String getImporOleh(){
        return imporOleh;
    }
    public void setTglImpor(LocalDate tglImpor){
        this.tglImpor = tglImpor;
    }
    public LocalDate getTglImpor(){
        return tglImpor;
    }
}
