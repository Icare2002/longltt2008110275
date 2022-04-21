package kiemtracuoiki;

public class DanhSachHangHoa {
    public static void main(String[] args) throws ParseException {
        Danhsachhanghoa danhsachhanghoa = new Danhsachhanghoa();
        Scanner nhap = new Scanner(System.in);
        int chon;
        list.add(new HangThucPham("Thịt", "Thực phẩm", "001", 10, 30.000, simpleDateFormat.parse("2/7/2020"), simpleDateFormat.parse("18/7/2022"), "AEON"));

        list.add(new HangThucPham("Cá", "Thực phẩm", "002", 20, 25.000, simpleDateFormat.parse("1/4/2020"), simpleDateFormat.parse("18/4/2022"), "AEON"));

        list.add(new HangThucPham("rau", "Thực phẩm", "003", 20, 7.000, simpleDateFormat.parse("23/3/2020"), simpleDateFormat.parse("12/3/2022"), "AEON"));
        
        list.add(new HangThucPham("quả", "Thực phẩm", "004", 50, 5.000, simpleDateFormat.parse("28/6/2020"), simpleDateFormat.parse("30/6/2022"), "AEON"));
        
        list.add(new HangDienMay("Điện thoại", "Điện máy", "005", 70, 5000.000, 12, 100.000));
        
        list.add(new HangDienMay("Máy lạnh", "Điện máy", "006", 120, 6000.000, 32, 150.000));
        
        list.add(new HangDienMay("Tivi", "Điện máy", "007", 150, 4000.000, 32, 170.000));
        
        list.add(new HangSanhSu("Bình", "Sành sứ", "008", 200, 55.000, "Gốm sứ Hải Long", simpleDateFormat.parse("4/5/2022")));
        
        list.add(new HangSanhSu("Ly", "Sành sứ", "009", 200, 25.000, "Gốm sứ Hải Long", simpleDateFormat.parse("27/2/2022")));
        
        list.add(new HangSanhSu("Tô", "Sành sứ", "010", 200, 20.000, "Gốm sứ Lan Phương", simpleDateFormat.parse("4/6/2022")));

        list.add(new HangSanhSu("chén", "Sành sứ", "011", 100, 15.000, "Gốm sứ Nhật", simpleDateFormat.parse("18/1/2022")));
        do{
            System.out.println("===================MENU===================");
            System.out.println(">>1: Thêm hàng hoá mới vào đầu danh sách kho.");
            System.out.println(">>2: Thêm hàng hoá mới vào cuối danh sách kho.");
            System.out.println(">>3: Thêm hàng hoá mới vào trước một hàng hoá tìm được.");
            System.out.println(">>4: Xoá hàng hoá ở đầu danh sách.");
            System.out.println(">>5: Xoá hàng hoá ở cuối danh sách.");
            System.out.println(">>6: Xoá hàng hoá ở một vị trí bất kì.");
            System.out.println(">>7: Sửa thông tin của hàng hoá trong kho.");
            System.out.println(">>8: Tìm kiếm hàng hoá theo loại.");
            System.out.println(">>9: Tìm kiếm hàng hoá theo khoảng giá.");
            System.out.println(">>10: Tìm kiếm hàng hoá theo khoang thời gian nhập hàng.");
            System.out.println(">>11: Sắp xếp hàng hoá tăng dần theo giá.");
            System.out.println(">>12: Sắp xếp hàng hoá giảm dần theo giá.");
            System.out.println(">>13: Sắp xếp hàng hoá tăng dần theo ngày.");
            System.out.println(">>14: Sắp xếp hàng hoá giảm dần theo ngày.");
            System.out.println(">>15: Sắp xếp hàng hoá theo loại.");
            System.out.println(">>16: Sắp xếp hàng hoá theo loại và tăng dần theo ngày nhập.");
            System.out.println(">>17: Sắp xếp hàng hoá theo loại và giảm dần theo ngày nhập.");
            System.out.println(">>18: Sắp xếp hàng hoá theo loại và tăng dần theo giá.");
            System.out.println(">>19: Sắp xếp hàng hoá theo loại và giảm dần theo giá.");
            System.out.println(">>20: Thống kê tổng số lượng hàng hoá trong kho.");
            System.out.println(">>21: Thống kê tổng giá trị của hàng hoá trong kho.");
            System.out.println(">>22: Thống kê số lượng hàng hoá của từng loại hàng.");
            System.out.println(">>23: In danh sách hàng hoá trong kho.");
            System.out.println(">>24: Kết thúc.");
            System.out.println("==========================================");
            System.out.print("- Nhập vào sự lựa chọn(1 -> 24): ");
            chon = nhap.nextInt();
            switch(chon){
                case 1:
                    danhsachhanghoa.themDau();
                    break;
                case 2:
                    danhsachhanghoa.themCuoi();
                    break;
                case 3: 
                    danhsachhanghoa.themTruoc();
                    break;
                case 4:
                    danhsachhanghoa.xoaDau();
                    break;
                case 5:
                    danhsachhanghoa.xoaCuoi();
                    break;
                case 6:
                    danhsachhanghoa.xoa();
                    break;
                case 7:
                    danhsachhanghoa.suaThongTin();
                    break;
                case 8:
                    danhsachhanghoa.timKiemTheoLoai();
                    break;
                case 9:
                    danhsachhanghoa.timKiemTheoGia();
                    break;
                case 10:
                    danhsachhanghoa.timKiemtheoNgay();
                    break;
                case 11:
                    danhsachhanghoa.tangDanTheoGia();
                    break;
                case 12:
                    danhsachhanghoa.giamDanTheoGia();
                    break;
                case 13:
                    danhsachhanghoa.tangTheoNgay();
                    break;
                case 14:
                    danhsachhanghoa.giamTheoNgay();
                    break;
                case 15:
                    System.out.println("- Sắp xếp hàng hoá theo loại hàng: ");
                    danhsachhanghoa.xepTheoLoai();
                    System.out.println("+ Sắp xếp thành công.");
                    break;
                case 16:
                    danhsachhanghoa.loaiVaNgayTang();
                    break;
                case 17:
                    quanLiHangHoa.loaiVaNgayGiam();
                    break;
                case 18:
                    quanLiHangHoa.loaiVaGiaTang();
                    break;
                case 19: 
                    quanLiHangHoa.loaiVaGiaGiam();
                    break;
                case 20:
                    quanLiHangHoa.tongSL();
                    break;
                case 21:
                    quanLiHangHoa.tongGT();
                    break;
                case 22:
                    quanLiHangHoa.soLuong();
                    break;
                case 23:
                    quanLiHangHoa.in();
                    break;
                case 24:
                    System.out.println("- KẾT THÚC!!!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ vui lòng nhập lại!");
            }
            System.out.print("- Quay lại MENU chính(1:yes/0:no): ");
            chon = nhap.nextInt(); 
        }while(chon == 1);
        nhap.close();
    }
    
}