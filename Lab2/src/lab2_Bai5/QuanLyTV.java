/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_Bai5;

/**
 *
 * @author Dac Hung
 */
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class QuanLyTV {
           private ArrayList<TaiLieu> taiLieus;
           private Scanner reader;
           public QuanLyTV() {
               taiLieus = new ArrayList<>();
               reader = new Scanner(System.in);
    }
        public Sach taoMoiSach(){
           Sach s = new Sach();
           System.out.println("Mã tài liệu: ");
           s.setMaTaiLieu(reader.nextLine());
           System.out.println("Tên nhà xuất bản: ");
           s.setTenNhaXuatBan(reader.nextLine());
           System.out.println("Số bản phát hành: ");
           s.setSoBanPhatHanh(Integer.parseInt(reader.nextLine()));
           System.out.println("Tên tác giả: ");
           s.setTenTacGia(reader.nextLine());
           System.out.println("Tên sách: ");
           s.setTenSach(reader.nextLine());
           System.out.println("Số trang: ");
           s.setSoTrang(Integer.parseInt(reader.nextLine()));
        return s;
     }
        public TapChi taoMoiTapChi(){
           TapChi tapChi = new TapChi();
           System.out.println("Mã tài liệu: ");
           tapChi.setMaTaiLieu(reader.nextLine());
           System.out.println("Tên nhà xuất bản: ");
           tapChi.setTenNhaXuatBan(reader.nextLine());
           System.out.println("Số bản phát hành: ");
           tapChi.setSoBanPhatHanh(Integer.parseInt(reader.nextLine()));
           System.out.println("Số phát hành: ");
           tapChi.setSoPhatHanh(Integer.parseInt(reader.nextLine()));
           System.out.println("Tháng phát hành: ");
           tapChi.setThangPhatHanh(Integer.parseInt(reader.nextLine()));
        return tapChi;
     }
        public Bao taoMoiBao(){
           Bao bao = new Bao();
           System.out.println("Mã tài liệu: ");
           bao.setMaTaiLieu(reader.nextLine());
           System.out.println("Tên nhà xuất bản: ");
           bao.setTenNhaXuatBan(reader.nextLine());
           System.out.println("Số bản phát hành: ");
           bao.setSoBanPhatHanh(Integer.parseInt(reader.nextLine()));
           System.out.println("Ngày phát hành: ");
           bao.setNgayPhatHanh(convertStringToDate(reader.nextLine()));
        return bao;
     }
        private Date convertStringToDate(String ddMMyyyy) {
        try {
           return new SimpleDateFormat("dd/MM/yyyy").parse(ddMMyyyy);
        } catch (ParseException ex) {
        }
        return null;
     }
        public void nhapDanhSachTaiLieu(){
           System.out.println("Nhập 1 - Tạo mới sách");
           System.out.println("Nhập 2 - Tạo mới tạp chí");
           System.out.println("Nhập 3 - Tạo mới báo");
           System.out.println("Nhập 4 - Kết thúc");
        int selectedValue;
           do {
                 System.out.println("Bạn chọn: ");
                 selectedValue = Integer.parseInt(reader.nextLine());
            switch(selectedValue){
                 case 1:
                 taiLieus.add(taoMoiSach());
                 break;
                 case 2:
                 taiLieus.add(taoMoiTapChi());
                 break;
                 case 3:
                 taiLieus.add(taoMoiBao());
                 break;
     }
    }       while (selectedValue!=4);
    }
        private void xuatThongTin(TaiLieu taiLieu){
           System.out.println("Mã tài liệu: " + taiLieu.getMaTaiLieu());
           System.out.println("Tên nhà xuất bản: "+ taiLieu.getTenNhaXuatBan());
           System.out.println("Số bản phát hành:" + taiLieu.getSoBanPhatHanh());
        if (taiLieu instanceof Sach) {
           Sach sach = (Sach) taiLieu;
           System.out.println("Tên tác giả: " + sach.getTenTacGia());
           System.out.println("Tên sách: " + sach.getTenSach());
           System.out.println("Số trang: " + sach.getSoTrang());
     }
        else{
           if (taiLieu instanceof TapChi) {
              TapChi tapChi = (TapChi) taiLieu;
              System.out.println("Số phát hành: " + tapChi.getSoPhatHanh());
              System.out.println("Tháng phát hành:" + tapChi.getThangPhatHanh());
     }else{
           Bao bao = (Bao)taiLieu;
              System.out.println("Ngày phát hành"+
              convertDateToString(bao.getNgayPhatHanh()));
     }
     }
     }
        private String convertDateToString(Date ngayPhatHanh) {
        return new SimpleDateFormat("dd/MM/yyyy").format(ngayPhatHanh);
     }
        public void xuatDanhSachTaiLieu(){
        for (TaiLieu taiLieu : taiLieus) {
           xuatThongTin(taiLieu);
     }
     }
        public void timTheoLoai(String loai){
           if (loai.equalsIgnoreCase("Sach")) {
           for (TaiLieu taiLieu : taiLieus) {
           if (taiLieu instanceof Sach) {
            xuatThongTin(taiLieu);
     }
     }
     } else {
        if (loai.equalsIgnoreCase("Tap Chi")) {
        for (TaiLieu taiLieu : taiLieus) {
        if (taiLieu instanceof TapChi) {
           xuatThongTin(taiLieu);
     }
     }
     } else {
        for (TaiLieu taiLieu : taiLieus) {
        if (taiLieu instanceof Bao) {
           xuatThongTin(taiLieu);
     }
     }
     }
     }
     }
        public void timGanDungTheoTenSach(String str){
           for (TaiLieu taiLieu : taiLieus) {
           if (taiLieu instanceof Sach) {
               Sach sach = (Sach) taiLieu;
           if (sach.getTenSach().indexOf(str)!=-1) {
               xuatThongTin(taiLieu);
     }
     }
     }
     }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            QuanLyTV QuanLyTV = new QuanLyTV();
            QuanLyTV.nhapDanhSachTaiLieu();
            QuanLyTV.xuatDanhSachTaiLieu();
            System.out.println("Nhập loại bạn muốn tìm: ");
            QuanLyTV.timTheoLoai(input.nextLine());
     }
}
