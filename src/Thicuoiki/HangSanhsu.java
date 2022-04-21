package kiemtracuoiki;

import java.util.Date;

public class HangSanhSu extends QuanLyHangHoa
{
    private String nhaSanXuat;
    private Date ngayNhapKho;
 
    public HangSanhSu(){}
    public HangSanhSu(String tenHang, String loaiHang, String maHang, int soLuongTonKho, double donGia, String nhaSanXuat, Date ngayNhapKho) 
    {
        super(tenHang, loaiHang, maHang, soLuongTonKho, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }
 
    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }

    @Override
    public double ThueVAT() {
        return getDonGia() * 0.1;
    }

    @Override
    public String getDanhGia() {
        String d = "không có";
        if(getSoLuongTonkho() > 50 && ( new Date().getTime() - ngayNhapKho.getTime() )/100000000 >10)
        {
            d = "bán chậm";
        }
        return d;
    }
    
    @Override
    public String toString() {
        String str = DanhSachHangHoa.simpleDateFormat.format(getNgayNhapKho());
        return super.toString()+ "Nhà sản xuất: " +getNhaSanXuat()+ "Ngày nhập kho: " +str+ "Thuế: " +getThue()+ "Đánh giá hàng sành sứ: " +getDanhGia();
    }
}