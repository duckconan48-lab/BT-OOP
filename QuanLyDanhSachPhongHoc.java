package DoanNguyenMinhDuc_25649461;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLyDanhSachPhongHoc
{
    private ArrayList<PhongHoc> danhSach;

    public QuanLyDanhSachPhongHoc(ArrayList<PhongHoc> danhSach)
    {
        this.danhSach = danhSach;
    }
    public QuanLyDanhSachPhongHoc()
    {
        this.danhSach= new ArrayList<PhongHoc>();
    }
    public void them(PhongHoc a) throws Exception
    {
        for(PhongHoc phongHoc: danhSach)
        {
            if(phongHoc.getMaPhong().equals(a.getMaPhong()))
            {
                throw new Exception("ma phong hoc da bi trung");
            }
        }
        this.danhSach.add(a);
    }
    public PhongHoc timKiem(String ma)
    {
        for(PhongHoc phongHoc: danhSach)
        {
            if(phongHoc.getMaPhong().equals(ma))
            {
                return phongHoc;
            }
        }
        return null;
    }
    public void layThongTinToanBo()
    {
        if(this.danhSach.isEmpty())
        {
            System.out.println("Danh sach rong!");
            return;
        }
        for(PhongHoc phongHoc: danhSach)
        {
            System.out.println(phongHoc);
        }
    }
    public void layThongTinCacPhongHocDatChuan()
    {
        for(PhongHoc phongHoc: danhSach)
        {
            if(phongHoc.datChuan())
            {
                System.out.println(phongHoc);
            }
        }
    }
    public void sapXepDanhSachTangDanTheoDayNha()
    {
        Collections.sort(this.danhSach, new Comparator<PhongHoc>()
        {
            @Override
            public int compare(PhongHoc a, PhongHoc b)
            {
                if(a.getDayNha().compareTo(b.getDayNha())<0)
                {
                    return -1;
                }
                else if(a.getDayNha().compareTo(b.getDayNha())>0)
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
        });
    }
    public void sapXepDanhSachGiamDanTheoDienTich()
    {
        Collections.sort(this.danhSach, new Comparator<PhongHoc>()
        {
            @Override
            public int compare(PhongHoc a, PhongHoc b)
            {
                if(a.getDienTich()<b.getDienTich())
                {
                    return 1;
                }
                else if(a.getDienTich()>b.getDienTich())
                {
                    return -1;
                }
                else
                {
                    return 0;
                }
            }
        });
    }
    public void sapXepDanhSachTangDanTheoSoBongDen()
    {
        Collections.sort(this.danhSach, new Comparator<PhongHoc>()
        {
            @Override
            public int compare(PhongHoc a, PhongHoc b)
            {
                if(a.getSoBongDen()<b.getSoBongDen())
                {
                    return -1;
                }
                else if(a.getSoBongDen()>b.getSoBongDen())
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
        });
    }
    public void capNhat(String ma, int soMayTinh)
    {
        for(PhongHoc phongHoc: danhSach)
        {
            if(phongHoc.getMaPhong().equals(ma)&&phongHoc instanceof PhongHocMayTinh)
            {
                ((PhongHocMayTinh)phongHoc).setSoMayTinh(soMayTinh);
                return;
            }
        }
    }
    public void xoa(String ma)
    {
        for(PhongHoc phongHoc: danhSach)
        {
            if(phongHoc.getMaPhong().equals(ma))
            {
                this.danhSach.remove(phongHoc);
                return;
            }
        }
    }
    public int tinhTongSoPhongHoc()
    {
        return this.danhSach.size();
    }
    public void layDanhSachCacPhongMayCo60May()
    {
        for(PhongHoc phongHoc: danhSach)
        {
            if(phongHoc instanceof PhongHocMayTinh && ((PhongHocMayTinh) phongHoc).getSoMayTinh()==60)
            {
                System.out.println(phongHoc);
            }
        }
    }
}