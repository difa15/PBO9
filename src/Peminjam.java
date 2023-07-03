public abstract class Peminjam implements UserLogin {
    private boolean isLogin;

    @Override
    public void doLogin(){
        isLogin = true;
    }
    @Override
    public void doLogout(){
        isLogin = false;
    }
    @Override
    public boolean isLogin(){
        return isLogin;
    }
    public abstract void setKodePeminjam(String kodePeminjam);
    public abstract String getKodePeminjam();
    public abstract void setNamaPeminjam(String namaPeminjam);
    public abstract String getNamaPeminjam();
}
