package vn.com.dt5.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class QuanLiDiaNhac extends JPanel{
  JTextField txtMa, txtTen, txtNhaPhatHanh, txtCasi, txtNgayNhap, txtGia;
  JButton btnTimKiem, btnThem, btnLamMoi, btnSua, btnXoa, btnThoat;
  
  /**
   * Tab 2- Quan li dia nhac.
   */

  public QuanLiDiaNhac() {
    String [] tenCot2 = {"Mã", "Tên", "Nhà phát hành", "Ngày nhập", "Ca sĩ", "Giá" };
    this.setLayout(new BorderLayout());
    this.add(new MyTable(tenCot2), BorderLayout.CENTER);
    
    JPanel pnSouth = new JPanel();
    pnSouth.setLayout(new BoxLayout(pnSouth, BoxLayout.Y_AXIS));
    JLabel l1, l2, l3, l4, l5, l6;//tạo ra 6 cái label.
    //tạo ra cái panel1 chứa cái label mã và txt mã.
    JPanel panel1=new JPanel(new FlowLayout(FlowLayout.CENTER));
    panel1.add(l1= new JLabel("Mã")); panel1.add(txtMa = new JTextField(20));
    //tạo ra cái panel2 chứa cái label tên và txt tên.
    JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
    panel2.add(l2= new JLabel("Tên")); panel2.add(txtTen= new JTextField(20));
    //tạo ra cái panel3 chứa cái label & txt nhà xuất bản.
    JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
    panel3.add(l3 = new JLabel("Nhà phát hành")); panel3.add(txtNhaPhatHanh = new JTextField(20));
    //tạo ra cái panel4 chứa cái label & txt thể loại sách.
    JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
    panel4.add(l4 = new JLabel("Ca sĩ")); panel4.add(txtCasi = new JTextField(20));
    //tạo ra cái panel 5 chứa cái lbl & txt ngày nhập sách.
    JPanel panel5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
    panel5.add(l5 = new JLabel("Ngày nhập")); panel5.add(txtNgayNhap = new JTextField(20));
    //tạo ra cái panel 6 chứa cái lbl & txt Giá.
    JPanel panel6 = new JPanel(new FlowLayout(FlowLayout.CENTER));
    panel6.add(l6 = new JLabel("Giá")); panel6.add(txtGia = new JTextField(20));
    //tạo ra cái panel  7 chứa các button thêm, lưu, sửa, xóa,  thoát.
    JPanel panel7 = new JPanel(new FlowLayout(FlowLayout.CENTER));
    panel7.add(btnTimKiem = new JButton("Tìm kiếm", new ImageIcon("images/search.png")));
    panel7.add(btnThem = new JButton("Thêm mới", new ImageIcon("images/add24px.png"))); 
    panel7.add(btnLamMoi = new JButton("Làm mới", new ImageIcon("images/refresh24px.png")));
    panel7.add(btnSua = new JButton("Sửa", new ImageIcon("images/edit24px.png")));
    panel7.add(btnXoa = new JButton("Xóa", new ImageIcon("images/remove24px.png")));
    panel7.add(btnThoat = new JButton("Thoát", new ImageIcon("images/goback24.png")));
    //căn chỉnh cho các label thẳng hàng
    l1.setPreferredSize(l3.getPreferredSize());
    l2.setPreferredSize(l3.getPreferredSize());
    l4.setPreferredSize(l3.getPreferredSize());
    l5.setPreferredSize(l3.getPreferredSize());
    l6.setPreferredSize(l3.getPreferredSize());
    
    pnSouth.add(panel1); pnSouth.add(panel2);
    pnSouth.add(panel3); pnSouth.add(panel4);
    pnSouth.add(panel5); pnSouth.add(panel6);
    pnSouth.add(panel7);
    this.add(pnSouth, BorderLayout.SOUTH);
  }
}
