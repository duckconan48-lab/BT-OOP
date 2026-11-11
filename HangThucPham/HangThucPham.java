package Tuan3_HangThucPham;
import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class HangThucPham 
{
	private String MaHang;
	private String TenHang;
	private double DonGia;
	private LocalDate NgaySanXuat;
	private LocalDate NgayHetHan;
	public HangThucPham() 
	{
		this.MaHang="000";
		this.TenHang = "xxx";
		this.DonGia = 0.0;
		this.NgaySanXuat = LocalDate.now();
		this.NgayHetHan= NgaySanXuat;
	}
	public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) 
	{
		this.MaHang = maHang;
		this.TenHang = tenHang;
		this.DonGia = donGia;
		this.NgaySanXuat = ngaySanXuat;
		this.NgayHetHan= ngayHetHan;
	}
	public String getMaHang() 
	{
		return MaHang;
	}
	public void setMaHang(String maHang) throws Exception
	{	if(!maHang.trim().equals(""))
		{
			this.MaHang = maHang;
		}
		else
		{
			throw new Exception("Loi: ma hang rong!");
		}
	}
	public String getTenHang() 
	{
		return TenHang;
	}
	public void setTenHang(String tenHang) 
	{
		if(!tenHang.trim().equals(""))
		{
			this.TenHang = tenHang;
		}
	}
	public double getDonGia() 
	{
		return DonGia;
	}
	public void setDonGia(double donGia) 
	{
		if(donGia>=0)
		{
			this.DonGia = donGia;
		}
	}
	public LocalDate getNgaySanXuat() 
	{
		return NgaySanXuat;
	}
	public void setNgaySanXuat(LocalDate ngaySanXuat) 
	{
		if(!ngaySanXuat.isAfter(LocalDate.now()))
		{
			this.NgaySanXuat = ngaySanXuat;
		}
	}
	public LocalDate getNgayHetHan()
	{
		return NgayHetHan;
	}
	public void setNgayHetHan(LocalDate ngayHetHan)
	{
		if(ngayHetHan.isAfter(NgaySanXuat))
		{
			this.NgayHetHan=ngayHetHan;
		}
	}
	public boolean HetHan()
	{
		if (NgayHetHan.isBefore(LocalDate.now()))
		{
			System.out.print("Hang Het Han ");
			return true;
		}
		else
		{
			System.out.print("Hang Con Han Su Dung ");
			return false;
		}
	}
	@Override
	public String toString() 
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return MaHang + "\t" + TenHang + "\t" + DonGia + "\t" + dtf.format(NgaySanXuat) + "\t" + dtf.format(NgayHetHan) + "\t" + HetHan();
	}
	public static void main(String[] args) 
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("______________________________________________________");
		System.out.println("Ma_Hang Ten_Hang           Don_Gia   Ngay_San_Xuat   Ngay_Het_Han   Ghi_Chu");
		System.out.println("------------------------------------------------------");
		HangThucPham HTP1= new HangThucPham("001", "gao", 100000.0, LocalDate.parse("10/07/2018", dtf), LocalDate.parse("10/07/2018", dtf));
		HangThucPham HTP2= new HangThucPham("002", "mi", 5000.0, LocalDate.parse("01/03/2018", dtf), LocalDate.parse("01/03/2018", dtf));
		HangThucPham HTP3= new HangThucPham("003", "nuoc", 10000.0, LocalDate.parse("01/03/2017", dtf), LocalDate.parse("01/12/2026", dtf));
		System.out.println(HTP1);
		System.out.println(HTP2);
		System.out.println(HTP3);
	}
}
