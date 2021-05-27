/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_Bai6.newpackage;

/**
 *
 * @author Dac Hung
 */
public class khachHangList extends khachHang{
    private khachHang kh[] = new khachHang[100];
    private int CountKH, sum1=0, sum2=0, dem=0, sumtien=0;
    public khachHangList(){
        CountKH = 0;
        for(int i=0;i<100;i++)
            kh[i] = new khachHang();
    }
    public void ThemKH(int temp)
    {
        if(CountKH>100)
            System.out.println(" MEMORY IS FULL, CANNOT BE ADD ! ");
        else{
            if(temp==1)
            {
                kh[CountKH] = new khachHangViet();
                khachHangViet khv = new khachHangViet();
                khv.nhap();
                khv.ThanhTien = khv.TTien();
                kh[CountKH]=khv;
                sum1+=khv.SoLuong;
            }
            else{
                kh[CountKH] = new khachHangNuocNgoai();
                khachHangNuocNgoai khnn = new khachHangNuocNgoai();
                khnn.nhap();
                khnn.ThanhTien = khnn.TTien();
                kh[CountKH] = khnn;
                sum2+= khnn.SoLuong;
                sumtien+= khnn.ThanhTien;
                dem++;
            }
            CountKH++;
        }
    }
    public void HienThiKH(){
        for(int i=0;i<CountKH;i++){
            System.out.println("\n SO TT: " + (i+1));
            System.out.println(kh[i].toString());
        }  
    }
    public void TongSL(){
        System.out.println("=> TONG SO LUONG(KW) DIEN CUA KHACH HANG VIET NAM :" + sum1);
        System.out.println("=> TONG SO LUONG(KW) DIEN CUA KHACH HANG NUOC NGOAI :" + sum2);
    }
public void TrungBinh(){
    System.out.println(" ==> TRUNG BINH THANH TIEN CUA KHACH HANG NUOC NGOAI : " +(sumtien/dem));
    
}
}
