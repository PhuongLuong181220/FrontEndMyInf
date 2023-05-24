package Day8.iso;

public abstract class AbtractISO {
    public void sanxuat(){
        chuanBiVatLieu();
        sanXuatCongNghiep();
        atvs();

    }

    protected abstract void chuanBiVatLieu(); //phuong thuc abtract
    protected abstract void sanXuatCongNghiep();
    protected abstract void atvs();

}
