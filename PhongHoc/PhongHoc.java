package DoanNguyenMinhDuc_25649461;

public abstract class PhongHoc implements Comparable<PhongHoc>
{
	protected String maPhong, dayNha;
	protected float dienTich;
	protected int soBongDen;
	public PhongHoc(String maPhong, String dayNha, float dienTich, int soBongDen) {
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {this.maPhong = maPhong;}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}
	public float getDienTich() {
		return dienTich;
	}
	public void setDienTich(float dienTich) {
		this.dienTich = dienTich;
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}
	public boolean datChuanChung()
	{
		return this.soBongDen>=(this.dienTich/10);
	}
	public abstract boolean datChuanRieng();
	public boolean datChuan()
	{
		return datChuanChung()&&datChuanRieng();
	}
	@Override
	public String toString() {
		return "PhongHoc{" +
				"dayNha='" + dayNha + '\'' +
				", maPhong='" + maPhong + '\'' +
				", dienTich=" + dienTich +
				", soBongDen=" + soBongDen +
				'}';
	}
	@Override
	public int compareTo(PhongHoc a)
	{
		return this.maPhong.compareTo(a.maPhong);
	}
}
