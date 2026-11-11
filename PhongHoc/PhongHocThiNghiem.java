package DoanNguyenMinhDuc_25649461;

public class PhongHocThiNghiem extends PhongHoc
{
    private String chuyenNganh;
    private int sucChua;
    private boolean coBonRua;
    public PhongHocThiNghiem(String maPhong, String dayNha, float dienTich, int soBongDen, String chuyenNganh, int sucChua, boolean coBonRua)
    {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.chuyenNganh = chuyenNganh;
        this.sucChua=sucChua;
        this.coBonRua=coBonRua;
    }
    public String getChuyenNganh()
    {
        return chuyenNganh;
    }
    public void setChuyenNganh(String chuyenNganh)
    {
        this.chuyenNganh = chuyenNganh;
    }
    public boolean isCoBonRua()
    {
        return coBonRua;
    }
    public void setCoBonRua(boolean coBonRua)
    {
        this.coBonRua = coBonRua;
    }
    public int getSucChua()
    {
        return sucChua;
    }
    public void setSucChua(int sucChua)
    {
        this.sucChua = sucChua;
    }
    @Override
    public boolean datChuanRieng()
    {
        return isCoBonRua();
    }

    @Override
    public String toString() {
        return "PhongHocThiNghiem{" +
                "chuyenNganh='" + chuyenNganh + '\'' +
                ", sucChua=" + sucChua +
                ", coBonRua=" + coBonRua +
                "} " + super.toString();
    }
}
