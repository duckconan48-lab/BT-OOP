package Tuan4_Bai9_CongNhan_DoanNguyenMinhDuc_25649461;
import java.util.Scanner;

public class MainCongNhan 
{
	public static void menu()
	{
		System.out.println("-------------------------------");
		System.out.println("1/Them 1 cong nhan vao danh sach");
		System.out.println("2/xuat toan bo thong tin cua cong nhan");
		System.out.println("3/so luong cong nhan co trong danh sach");
		System.out.println("4/xuat thong tin cac cong nhan lam tren 200 san pham");
		System.out.println("5/sap xep cong nhan theo so san pham giam dan");
		System.out.println("0/thoat giao dien");
		System.out.println("-------------------------------");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("nhap so cong nhan toi da ban dau: ");
		int n=sc.nextInt();
		DanhSachCongNhan ds=new DanhSachCongNhan(n);
		int chon;
		do
		{
			menu();
			System.out.print("chon chuc nang tu 1->5: ");
			chon=sc.nextInt();
			sc.nextLine();
			switch(chon)
			{
				case 1:
					ds.NhapCongNhan(sc);
					break;
				case 2:
					ds.In();
					break;
				case 3:
					System.out.println("so luong cong nhan co trong danh sach la "+ ds.dem());
					break;
				case 4:
					ds.InTren200();
					break;
				case 5:
					ds.sapxepgiamdan();
					break;
				case 0:
					System.out.println("ket thuc chuong trinh");
			}
		}while(chon!=0);
		sc.close();
	}
}
