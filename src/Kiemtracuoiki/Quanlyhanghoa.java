package kiemtracuoiki;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
 

public abstract class QuanLyHangHoa 
{
    private String maHang;
    private String  tenHang;
    private int soLuongTon; // >= 0
    private double donGia; // > 0
    private double thueVAT;
    private Date nSX, hSD;
    private String nhaCungCap ;


    public QuanLyHangHoa(String maHang, String tenHang, int soLuongTon, double donGia, double thueVAT)
    {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
        this.thueVAT = thueVAT;
        this.nSX = nSX;
        this.hSD = hSD;
        this.nhaCungCap = nhaCungCap;
    }

    private void setMaHang(String maHang) 
    {
        this.maHang = maHang;
    }

    public String getMaHang() 
    {
        return maHang;
    }

    public void setTenHang(String tenHang) 
    {
        this.tenHang = tenHang;
    }

    public String getTenHang() 
    {
        return tenHang;   
    }

    public void setSoLuongTon(int soLuongTon) 
    {
        this.soLuongTon = soLuongTon;
    }

    public int getSoLuongTon() 
    {
        return soLuongTon;
    }

    public void setDon_Gia(double donGia) 
    {
        this.donGia = donGia;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setThueVAT(double thueVAT) 
    {
        this.thueVAT = thueVAT;
    }

    public double getThueVAT() 
    {
        return thueVAT;
        // VAT SanhSu = 10%
        // VAT ThucPham = 5%
        // VAT DienMay = 10%
    }

    public Date getnSX() {
        return nSX;
    }
 
    public void setnSX(Date nSX) {
        this.nSX = nSX;
    }
 
    public Date gethSD() {
        return hSD;
    }
 
    public void sethSD(Date hSD) {
        this.hSD = hSD;
    }
    @Override
    public String toString() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
        String str = numberFormat.format(donGia);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String str1 = simpleDateFormat.format(nSX);
        String str2 = simpleDateFormat.format(hSD);
        return "Thông tin về thực phẩm: \n" +
                "Mã hàng : " + maHang +
                "\nTên hàng : '" + tenHang +
                "\nĐơn giá : " + str +
                "\nthuế VAT :" + thueVAT +
                "\nNgày sản xuất : " + str1 +
                "\nHạn sử dụng : " + str2 +
                "\nNhà cung cấp :" + nhacungcap +
                ;

}
public void setNSX(int year, int month, int day) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(year, month - 1, day);
    this.nSX = calendar.getTime();
}

public void setHSD(int year, int month, int day) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(year, month - 1, day);
    this.hSD = calendar.getTime();
}

public boolean kiemTraNgay(boolean t) {
    if (this.getnSX().compareTo(this.gethSD()) < 0) {
        t = false;
    } else {
        System.out.println("Ngày hết hạn không được nhỏ hơn ngày sản xuất : ");
    }
    return t;
}

public String getNhaCungCap() {
    return nhaCungCap;
}

public void setNhaCungCap(String nhaCungCap) {
    this.nhaCungCap = nhaCungCap;
}


public void kiemTraHSD() {
    Date today = new Date();
    today.getTime();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    String st = simpleDateFormat.format(today);
    if (this.gethSD().compareTo(today) < 0) {
        System.out.println("Hôm nay là ngày " + st + ", hàng hóa đã hết hạn ");
    } else {
        System.out.println("Hôm nay là ngày " + st + ", hàng hóa vẫn còn hạn ");
    }
}
}