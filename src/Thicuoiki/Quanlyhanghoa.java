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
    private Date ngaySX, ngayHetHan;
    private String nhaCungCap ;


    public QuanLyHangHoa(String maHang, String tenHang, int soLuongTon, double donGia, double thueVAT)
    {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
        this.thueVAT = thueVAT;
        this.ngaySX = ngaySX;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }

    private void setMaHang(String maHang) 
    {
        if (maHang != null) {
            this.maHang = maHang;
        } else {
            System.err.println("Ma hang khong duoc de trong!!!");
            System.err.println("Chuyen sang  mac dinh ");
            System.err.println("Ma hang: 0000\n");
            this.maHang = "0000";
        }
    }

    public String getMaHang() 
    {
        return maHang;
    }

    public void setTenHang(String tenHang) 
    {
        if (tenHang != null) {
            this.tenHang = tenHang;
        } else {
            System.err.println("Ten hang khong duoc rong!!!");
            System.err.println("Chuyen sang mac dinh");
            System.err.println("Ten Hang: Chua dat ten\n");
            this.tenHang = "Chua dat ten";
        }
    }

    public String getTenHang() 
    {
        return tenHang;   
    }

    public void setSoLuongTon(int soLuongTon) 
    {
        if (soLuongTon >= 0) {
            this.soLuongTon = soLuongTon;
        } else {
            System.err.println("So luong ton khong duoc am!!!");
            System.err.println("Chuyen sang mac dinh");
            System.err.println("So luong ton: 0\n");
            this.soLuongTon = 0;
        }
    }

    public int getSoLuongTon() 
    {
        return soLuongTon;
    }

    public void setDonGia(double donGia) 
    {
        if (donGia > 0) {
            this.donGia = donGia;
        } else {
            System.err.println("Don gia phai lon hon 0!!!");
            System.err.println("Chuyen sang mac dinh");
            System.err.println("Don gia: 1\n");
            this.donGia = 1;
        }
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

    public Date ngaySX() {
        return ngaySX;
    }
 
    public void ngaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }
 
    public Date ngayHetHan() {
        return ngayHetHan;
    }
 
    public void setngayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
    @Override
    public String toString() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
        String str = numberFormat.format(donGia);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String str1 = simpleDateFormat.format(ngaySX);
        String str2 = simpleDateFormat.format(ngayHetHan);
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
public void setngaySX(int year, int month, int day) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(year, month - 1, day);
    this.ngaySX = calendar.getTime();
}

public void setngayHetHan(int year, int month, int day) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(year, month - 1, day);
    this.ngayHetHan = calendar.getTime();
}

public boolean kiemTraNgay(boolean t) {
    if (this.getngaySX().compareTo(this.getngayHetHan()) < 0) {
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


public void kiemTrangayHetHan() {
    Date today = new Date();
    today.getTime();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    String st = simpleDateFormat.format(today);
    if (this.getngayHetHan().compareTo(today) < 0) {
        System.out.println("Hôm nay là ngày " + st + ", hàng hóa đã hết hạn ");
    } else {
        System.out.println("Hôm nay là ngày " + st + ", hàng hóa vẫn còn hạn ");
    }
}
}