public class Denda {
    private Peminjaman peminjaman;
    private int hariTerlambat;
    private int TARIF_DENDA;

    public Peminjaman Denda (Peminjaman peminjaman, int hariTerlambat )throws Exception{
        
        if(hariTerlambat >=10){
    System.out.println(" Denda Yang Dibayar   : " + denda1);
}else if(hariTerlambat==20){
    TARIF_DENDA = hariTerlambat * 10000;
    System.out.println(" Denda yang dibayar   : " + denda1);
    tagihan = 10000 + TARIF_DENDA;
    System.out.println("yangdibayar : " + tagihan);
}else if(hariTerlambat>=30){
    TARIF_DENDA = hariTerlambat * 10000;
    System.out.println(" Denda yang dibayar   : " + denda1);
    tagihan = 10000 + TARIF_DENDA;
    System.out.println("yangdibayar : " + tagihan);
}

    }
}
