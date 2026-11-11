package Tuan4_Bai9_CongNhan_DoanNguyenMinhDuc_25649461;
import java.util.Scanner;
public class DanhSachCongNhan 
{
	private CongNhan[] a;
	private int soluong;
	public DanhSachCongNhan(int n) 
	{
		this.a = new CongNhan[n];
		this.soluong = 0;
	}
	public int getsoluong() 
	{
		return soluong;
	}
	public void NhapCongNhan(Scanner sc)
	{
		System.out.print("nhap ma cong nhan: ");
		String ma=sc.nextLine();
		System.out.print("nhap ten cong nhan: ");
		String ten=sc.nextLine();
		System.out.print("nhap so san pham cua cong nhan: ");
		double sp=sc.nextDouble();
		CongNhan cn= new CongNhan(ma, ten, sp);
		if(ThemCongNhan(cn))
		{
			System.out.println("them cong nhan thanh cong");
		}
		else
		{
			System.out.println("ma cong nhan da trung, them cong nhan that bai");
		}
	}
	public void ktra() 
	{
		if(a.length==soluong)
		{
			CongNhan[] temp=new CongNhan[a.length*2];
			System.arraycopy(a, 0, temp, 0, soluong);
			a=temp;
		}
	}
	public boolean ThemCongNhan(CongNhan m)
	{
		for(int i=0;i<soluong;i++)
		{
			if(a[i].getMaCN().equalsIgnoreCase(m.getMaCN()))
			{
				return false;
			}
		}
		ktra();
		a[soluong]=m;
		soluong++;
		return true;
	}
	public void In()
	{
		for(int i=0;i<soluong;i++)
		{
			System.out.println(a[i]);
		}
	}
	public int dem()
	{
		int dem=0;
		for(int i=0;i<soluong;i++)
		{
			dem++;
		}
		return dem;
	}
	public void InTren200()
	{
		for(int i=0;i<soluong;i++)
		{
			if(a[i].getSoSP()>200)
			{
				System.out.println(a[i]);
			}
		}
	}
	public void sapxepgiamdan()
	{
		for(int i=0;i<soluong-1;i++)
		{
			for(int j=i+1;j<soluong;j++)
			{
				if(a[i].getSoSP()<a[j].getSoSP())
				{
					CongNhan temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
}
