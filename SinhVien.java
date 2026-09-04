package Tuan2_BaiSinhVien;
import java.util.Scanner;
public class SinhVien 
{
	private int MaSV;
	private String HoTen;
	private double DiemLT;
	private double DiemTH;
	public SinhVien(int maSV, String hoTen, double diemLT, double diemTH) 
	{
		this.MaSV = maSV;
		this.HoTen = hoTen;
		this.DiemLT = diemLT;
		this.DiemTH = diemTH;
	}
	public SinhVien() 
	{
		this.MaSV = 1;
		this.HoTen = "Chua co ten";
		this.DiemLT = 0.0;
		this.DiemTH = 0.0;
	}
	public int getMaSV() 
	{
		return MaSV;
	}
	public void setMaSV(int maSV) 
	{
		if(maSV>0)
		{
			this.MaSV = maSV;
		}
	}
	public String getHoTen() 
	{
		return HoTen;
	}
	public void setHoTen(String hoTen) 
	{
		if(hoTen!=null)
		{
			this.HoTen = hoTen;
		}
	}
	public double getDiemLT()
	{
		return DiemLT;
	}
	public void setDiemLT(double diemLT) 
	{
		if(diemLT>=0&&diemLT<=10)
		{
			this.DiemLT = diemLT;
		}
	}
	public double getDiemTH() 
	{
		return DiemTH;
	}
	public void setDiemTH(double diemTH) 
	{
		if(diemTH>=0&&diemTH<=10)
		{
			this.DiemTH = diemTH;
		}
	}
	public double DiemTB()
	{
		return (this.DiemLT+this.DiemTH)/2;
	}
	@Override
	public String toString() 
	{
		return this.MaSV+"\t"+this.HoTen+"\t"+this.DiemLT+"\t"+this.DiemTH+"\t"+this.DiemTB();
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		SinhVien sv3=new SinhVien();
		System.out.println("nhap ma so cua sinh vien sv3:");
		int a=sc.nextInt();
		sv3.setMaSV(a);
		sc.nextLine();
		System.out.println("nhap ho va ten cua sinh vien sv3:");
		String ten=sc.nextLine();
		sv3.setHoTen(ten);
		System.out.println("nhap diem ly thuyet cua sinh vien sv3:");
		double diemLT=sc.nextDouble();
		sv3.setDiemLT(diemLT);
		System.out.println("nhap diem thuc hanh cua sinh vien sv3:");
		double DiemTH=sc.nextDouble();
		sv3.setDiemTH(DiemTH);
		SinhVien sv1=new SinhVien(25649461, "Doan Nguyen Minh Duc", 10.0, 10.0);
		SinhVien sv2=new SinhVien(25649467, "Le Hoang Phu Hieu", 9.0, 7.0);
		System.out.println("masv\thoten\tdiemlt\tdiemth\tdiemtb");
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
	}
}
