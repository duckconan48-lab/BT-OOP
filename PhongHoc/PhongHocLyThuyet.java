package DoanNguyenMinhDuc_25649461;

public class PhongHocLyThuyet extends PhongHoc{
    private boolean coMayChieu;
    public PhongHocLyThuyet(String maPhong, String dayNha, float dienTich, int soBongDen, boolean coMayChieu)
    {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.coMayChieu = coMayChieu;
    }
    public boolean isCoMayChieu()
    {
        return coMayChieu;
    }
    public void setCoMayChieu(boolean coMayChieu)
    {
        this.coMayChieu = coMayChieu;
    }
    @Override
    public boolean datChuanRieng()
    {
        return isCoMayChieu();
    }
    @Override
    public String toString() {
        return "PhongHocLyThuyet{" +
                "coMayChieu=" + coMayChieu +
                "} " + super.toString();
    }
}
