public class Mahasiswa extends Peminjam {
    private String namaMhs;
    private String nim;

    @Override
    public void setKodePeminjam(String nim){
        this.nim = nim;
    }
    @Override
    public String getKodePeminjam(){
        return nim;
    }
    @Override
    public void setNamaPeminjam(String namaMhs){
        this.namaMhs = namaMhs;
    }
    @Override
    public String getNamaPeminjam(){
        return namaMhs;
    }
    @Override
    public void isAntiDenda() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isAntiDenda'");
    }
    @Override
    public void removeAntiDenda() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeAntiDenda'");
    }
    @Override
    public boolean getAntiDenda() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAntiDenda'");
    }
}
