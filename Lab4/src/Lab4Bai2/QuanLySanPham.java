
package Lab4Bai2;
//theo menu sau.
//1. Nhập danh sách sản phẩm từ bàn phím
//2. Xuất danh sách vừa nhập.
//3. Xuất danh sách ngẫu nhiên.
//4. Sắp xếp giảm dần theo giá và xuất giá ra màn hình
//5. Tìm và xóa sản phẩm theo tên nhập từ bàn phím.
//6. Xuất giá trung bình của các sản phẩm
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class QuanLySanPham {
    public static void main(String[] args) {
        ArrayList<SanPham> dssp = new ArrayList<>();
        int option;
        Scanner sc = new Scanner(System.in);
        do{
            showMenu();
            System.out.println("Nhập lựa chọn của bạn :");
            option =Integer.parseInt(sc.nextLine());
            switch(option){
                //
            case 1:
                int n;
                System.out.println("Nhập số lượng sản phẩm :");
                n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        SanPham sp =new SanPham();
                        sp.nhapthongtin();
                        dssp.add(sp);
                    }
            case 2:
                for (int i = 0; i < dssp.size(); i++) {
                    dssp.get(i).xuatthongtin();
                }
            case 4:
                
                break;
            }
            
        }while(option !=6);
    }
    static void showMenu(){
        System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
        System.out.println("2. Xuất danh sách vừa nhập");
        System.out.println("3. Xuất danh sách ngẫu nhiên.");
        System.out.println("4. Sắp xếp giảm dần theo giá và xuất giá ra màn hình");
        System.out.println("5. Tìm và xóa sản phẩm theo tên nhập từ bàn phím.");
        System.out.println("6. Xuất giá trung bình của các sản phẩm");
    }
}
