package J05006;
import java.util.*;
import java.text.*;
public class Nhanvien {
    private String ma, ten, gioitinh, diachi, masothue;
    private Date ngaysinh, ngayky;
    private static int cnt = 0;
    public Nhanvien(String ten, String gioitinh, String ngaysinh, String diachi, String masothue, String ngayky) throws ParseException {
        cnt++;
        this.ma = String.format("%05d",cnt);
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.masothue = masothue;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        //this.date: Đây là tham chiếu đến biến thành viên date của đối tượng hiện tại.
        // Từ khóa this dùng để phân biệt giữa biến thành viên date và biến cục bộ date (được truyền vào phương thức hay constructor).

        this.ngayky = new SimpleDateFormat("dd/MM/yyyy").parse(ngayky);
    }
    //parse(): Chuyển chuỗi thành đối tượng Date.
    //format(): Chuyển đối tượng Date thành chuỗi.
    public String toString(){
        return ma + " " + ten + " " + gioitinh + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)
                + " " + diachi + " " + masothue + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngayky);
    }
}
