
package Lab4Bai1;

public class TestSinhVien{

    public static void main(String[] args) {
    DanhSachSinhVien qlsv=new DanhSachSinhVien();
    Sinhvien teo=new Sinhvien();
    teo.setMasv("001\n");
    teo.setTensv("Nguyễn Văn Tèo\n");
    qlsv.addSinhVien(teo);
    teo.setDiachi("HP\n");
    teo.setLop("MMT12A1HN\n ");
    
    Sinhvien ty=new Sinhvien();
    ty.setMasv("002\n");
    ty.setTensv("Nguyễn Thị Tý\n");
    ty.setDiachi("Hà nội\n ");
    ty.setLop("Tin 12a1\n");
    Sinhvien anh = new Sinhvien();
    anh.setMasv("003\n");
    ty.setTensv("Louis Daniel\n");
    ty.setDiachi("Canada\n ");
    ty.setLop("Tin 12a1\n");
    qlsv.addSinhVien(ty);
    qlsv.sort();
    System.out.println(qlsv);
    }
}
