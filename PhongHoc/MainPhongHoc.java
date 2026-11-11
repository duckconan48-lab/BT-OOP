package DoanNguyenMinhDuc_25649461;

import java.util.Scanner;

public class MainPhongHoc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        QuanLyDanhSachPhongHoc ql = new QuanLyDanhSachPhongHoc();
        int chon;
        do
        {
            System.out.println("------------------------------");
            System.out.println("1/ them phong hoc");
            System.out.println("2/ tim kiem phong hoc theo ma phong");
            System.out.println("3/ in toan bo danh sach phong hoc");
            System.out.println("4/ in cac phong hoc dat chuan");
            System.out.println("5/ sap xep tang dan theo day nha");
            System.out.println("6/ sap xep giam dan theo dien tich");
            System.out.println("7/ sap xep tang dan theo so bong den");
            System.out.println("8/ cap nhat so may tinh theo ma phong");
            System.out.println("9/ xoa phong hoc theo ma phong");
            System.out.println("10/ tinh tong so phong hoc");
            System.out.println("11/ in cac phong may co 60 may");
            System.out.println("0/ thoat chuc nang");
            System.out.println("------------------------------");
            System.out.print("nhap lua chon cua ban: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon)
            {
                case 1:
                    System.out.print("nhap loai phong (1: ly thuyet, 2: may tinh, 3: thi nghiem): ");
                    int loai = sc.nextInt();
                    sc.nextLine();
                    System.out.print("nhap ma phong: ");
                    String ma = sc.nextLine();
                    System.out.print("nhap day nha: ");
                    String day = sc.nextLine();
                    System.out.print("nhap dien tich: ");
                    float dienTich = sc.nextFloat();
                    System.out.print("nhap so bong den: ");
                    int soBongDen = sc.nextInt();
                    sc.nextLine();
                    PhongHoc p = null;
                    if (loai == 1)
                    {
                        System.out.print("co may chieu khong (y/n): ");
                        boolean coMayChieu = sc.nextLine().equalsIgnoreCase("y");
                        p = new PhongHocLyThuyet(ma, day, dienTich, soBongDen, coMayChieu);
                    }
                    else if (loai == 2)
                    {
                        System.out.print("nhap so may tinh: ");
                        int soMay = sc.nextInt();
                        sc.nextLine();
                        p = new PhongHocMayTinh(ma, day, dienTich, soBongDen, soMay);
                    }
                    else if (loai == 3)
                    {
                        System.out.print("nhap chuyen nganh: ");
                        String chuyenNganh = sc.nextLine();
                        System.out.print("nhap suc chua: ");
                        int sucChua = sc.nextInt();
                        sc.nextLine();
                        System.out.print("co bon rua khong (y/n): ");
                        boolean coBonRua = sc.nextLine().equalsIgnoreCase("y");
                        p = new PhongHocThiNghiem(ma, day, dienTich, soBongDen, chuyenNganh, sucChua, coBonRua);
                    }
                    if (p == null)
                    {
                        System.out.println("loai phong khong hop le");
                    }
                    else
                    {
                        try
                        {
                            ql.them(p);
                            System.out.println("them thanh cong");
                        }
                        catch (Exception e)
                        {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 2:
                    System.out.print("nhap ma phong can tim: ");
                    String ma2 = sc.nextLine();
                    PhongHoc kq = ql.timKiem(ma2);
                    if (kq != null)
                        System.out.println(kq);
                    else
                        System.out.println("khong tim thay phong hoc");
                    break;
                case 3:
                    ql.layThongTinToanBo();
                    break;
                case 4:
                    ql.layThongTinCacPhongHocDatChuan();
                    break;
                case 5:
                    ql.sapXepDanhSachTangDanTheoDayNha();
                    break;
                case 6:
                    ql.sapXepDanhSachGiamDanTheoDienTich();
                    break;
                case 7:
                    ql.sapXepDanhSachTangDanTheoSoBongDen();
                    break;
                case 8:
                    System.out.print("nhap ma phong may can cap nhat: ");
                    String ma8 = sc.nextLine();
                    System.out.print("nhap so may tinh moi: ");
                    int soMayMoi = sc.nextInt();
                    sc.nextLine();
                    ql.capNhat(ma8, soMayMoi);
                    break;
                case 9:
                    System.out.print("nhap ma phong can xoa: ");
                    String ma9 = sc.nextLine();
                    if (ql.timKiem(ma9) == null)
                    {
                        System.out.println("khong tim thay phong hoc");
                    }
                    else
                    {
                        System.out.print("ban co chac chan muon xoa khong (y/n): ");
                        String xacNhan = sc.nextLine();
                        if (xacNhan.equalsIgnoreCase("y"))
                        {
                            ql.xoa(ma9);
                            System.out.println("da xoa");
                        }
                        else
                        {
                            System.out.println("da huy xoa");
                        }
                    }
                    break;
                case 10:
                    System.out.println("tong so phong hoc: " + ql.tinhTongSoPhongHoc());
                    break;
                case 11:
                    ql.layDanhSachCacPhongMayCo60May();
                    break;
            }
        } while (chon != 0);
    }
}
