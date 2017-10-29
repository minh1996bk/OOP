package vn.com.dt5.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class QuanLiNhanVien extends JFrame {

  JTextField txtTenNhanVien, txtDiaChi, txtSoDienThoai;
  JComboBox<Object> comboboxGioiTinh;

  DefaultTableModel dtmQuanLiNhanVien;
  JTable tblQuanLiNhanVien;
  JButton btnThemMoi, btnSua, btnLamMoi, btnQuayLaiManHinhLuaChon;
  public QuanLiNhanVien() {
    setTitle("Giao Diện Quản Lí Nhân Viên");
    setSize(800, 600);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(false);
    addGui();
  }

  private void addGui() {
    Container con = getContentPane();
    con.setLayout(new BorderLayout());
    JPanel pnNorth = createPnNorth();
    JPanel pnCenter = createPnCenter();
    con.add(pnNorth, BorderLayout.NORTH);
    con.add(pnCenter, BorderLayout.CENTER);
  }

  private JPanel createPnCenter() {
    //Tạo panel chứa tất cả các button kiểu boxlayout
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    //tạo panel chứa button thêm mới nhân viên và tính lương
    JPanel pnRow1 = new JPanel();
    pnRow1.setLayout(new FlowLayout(FlowLayout.CENTER));
    JButton btnTinhLuong = new JButton("Tính Lương");
    btnTinhLuong.setIcon(new ImageIcon("images/tinhluong24px.png"));
    btnThemMoi = new JButton("Thêm mới nhân viên");
    btnThemMoi.setIcon(new ImageIcon("images/add24px.png"));
    pnRow1.add(btnTinhLuong);
    pnRow1.add(btnThemMoi);
    
    JPanel pnRow2 = new JPanel();
    pnRow2.setLayout(new FlowLayout(FlowLayout.CENTER));
    JButton btnSua = new JButton("Sửa");
    btnSua.setIcon(new ImageIcon("images/edit24px.png"));
    JButton btnQuayLai = new JButton("Quay lại màn hình lựa chọn");
    btnQuayLai.setIcon(new ImageIcon("images/goback24.png"));
    pnRow2.add(btnSua);
    pnRow2.add(btnQuayLai);

    panel.add(pnRow1);
    panel.add(pnRow2);
    return panel;
  }

  private JPanel createPnNorth() {
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());

    dtmQuanLiNhanVien = new DefaultTableModel();
    String[] tenCot = {"Mã nhân viên", "Họ và tên nhân viên", "Địa chỉ", "Số điện thoại", "Giới tính", "Ngày sinh"};
    for(String add :tenCot) {
      dtmQuanLiNhanVien.addColumn(add);
    }

    tblQuanLiNhanVien = new JTable(dtmQuanLiNhanVien);
    JScrollPane jsc = new JScrollPane(tblQuanLiNhanVien, 
        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    panel.add(jsc, BorderLayout.CENTER);
    return panel;
  }
}
