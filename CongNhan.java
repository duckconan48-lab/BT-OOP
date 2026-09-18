package Tuan4_Bai9_CongNhan_DoanNguyenMinhDuc_25649461;

public class CongNhan 
{
	private String maCN;
	private String HoTen;
	private double SoSP;
	public String getMaCN() 
	{
		return maCN;
	}

	public void setMaCN(String maCN) 
	{
		this.maCN = maCN;
	}

	public String getHoTen() 
	{
		return HoTen;
	}

	public void setHoTen(String hoTen) 
	{
		this.HoTen = hoTen;
	}

	public double getSoSP() 
	{
		return SoSP;
	}

	public void setSoSP(double soSP) 
	{
		if(soSP>0)
		{
			this.SoSP = soSP;
		}
		else
		{
			System.out.println("So san pham khong hop le");
		}
	}
	public CongNhan(String maCN, String hoTen, double soSP) 
	{
		this.maCN = maCN;
		this.HoTen = hoTen;
		this.setSoSP(soSP);
	}
	public CongNhan(){}
	public double tinhLuong() 
	{
		if(getSoSP()>=1&&getSoSP()<=199)
		{
			return this.SoSP*0.5;
		}
		if(getSoSP()>=200&&getSoSP()<=399)
		{
			return this.SoSP*0.55;
		}
		if(getSoSP()>=400&&getSoSP()<=599)
		{
			return this.SoSP*0.6;
		}
		return getSoSP()*0.65;
	}
	@Override
	public String toString() 
	{
		return "CongNhan [maCN=" + maCN + ", HoTen=" + HoTen + ", SoSP=" + SoSP + ", Luong=" + tinhLuong()+ "]";
	}
}
