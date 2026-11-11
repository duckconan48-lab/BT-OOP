package DoanNguyenMinhDuc_25649461;

public class PhongHocMayTinh extends PhongHoc{
	private int soMayTinh;
	public PhongHocMayTinh(String maPhong, String dayNha, float dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}
	public int getSoMayTinh() {
		return soMayTinh;
	}
	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}
	@Override
	public boolean datChuanRieng()
	{
		return this.soMayTinh>=(getDienTich()/1.5);
	}
	@Override
	public String toString()
	{
		return "PhongHocMayTinh{" +
				"soMayTinh=" + soMayTinh +
				"} " + super.toString();
	}
}
