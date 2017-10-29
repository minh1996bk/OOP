package vn.com.dt5.view;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SuaNhanVien extends JFrame {
  
  public SuaNhanVien() {
    this.setTitle("Giao Diện Sửa Nhân Viên");
    setDiplay();
   add(createGui());
  }
  
  private Component createGui() {
    //tạo 1 panel chứa cả giao diện
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    //tạo label Mời Bạn Nhập Vào Thông Tin
    JPanel pnThongTin = new JPanel();
    pnThongTin.setLayout(new FlowLayout(FlowLayout.CENTER));
    JLabel lblThongTin = new JLabel("Mời bạn sửa thông tin: ");
    Font font = new Font("Consolas", Font.BOLD, 30);
    lblThongTin.setFont(font);
    lblThongTin.setIcon(new ImageIcon("images/themnhanvien.png"));
    pnThongTin.add(lblThongTin);
    //Tạo Jpanel Họ Và Tên gồm: label và textfield họ và tên
    JPanel pnHoVaTen = new JPanel();
    pnHoVaTen.setLayout(new FlowLayout(FlowLayout.CENTER));
    JLabel lblHoVaTen = new JLabel("Họ và tên: ");
    pnHoVaTen.add(lblHoVaTen);
    JTextField txtHoVaTen = new JTextField(20);
    pnHoVaTen.add(txtHoVaTen);
    //Tạo jpanel địa chỉ gồm: label và textfield địa chỉ
    JPanel pnDiaChi = new JPanel();
    pnDiaChi.setLayout(new FlowLayout(FlowLayout.CENTER));
    JLabel lblDiaChi = new JLabel("Địa chỉ: ");
    JTextField txtDiaChi = new JTextField(20);
    pnDiaChi.add(lblDiaChi);
    pnDiaChi.add(txtDiaChi);
    //Tạo panel Số điện thoại gồm: label và textfield số điện thoại
    JPanel pnSoDienThoai = new JPanel();
    pnSoDienThoai.setLayout(new FlowLayout(FlowLayout.CENTER));
    JLabel lblSoDienThoai = new JLabel("Số điện thoại: ");
    pnSoDienThoai.add(lblSoDienThoai);
    JTextField txtSoDienThoai = new JTextField(20);
    pnSoDienThoai.add(txtSoDienThoai);
    //tạo panel chứa ngày sinh
    JPanel pnNgaySinh = new JPanel();
    pnNgaySinh.setLayout(new FlowLayout(FlowLayout.CENTER));
    JLabel lblNgaySinh = new JLabel("Ngày Sinh: ");
    JComboBox<DayOfWeek> cbNgay = new JComboBox<DayOfWeek>();
    JComboBox<Month> cbThang = new JComboBox<Month>();
    JComboBox<Year> cbNam = new JComboBox<Year>();
    pnNgaySinh.add(lblNgaySinh);
    pnNgaySinh.add(cbNgay);
    pnNgaySinh.add(cbThang);
    pnNgaySinh.add(cbNam);
    //Tạo panel chứa combobox giới tính gồm: nam, nữ, khác.
    JPanel pnComboboxGioiTinh = new JPanel();
    pnComboboxGioiTinh.setLayout(new FlowLayout(FlowLayout.CENTER));
    JLabel lblGioiTinh = new JLabel("Giới Tính: ");
    JComboBox<Object> comboboxGioiTinh = new JComboBox<Object>();
    comboboxGioiTinh.addItem("Nam");
    comboboxGioiTinh.addItem("Nữ");
    comboboxGioiTinh.addItem("Khác");
    pnComboboxGioiTinh.add(lblGioiTinh);
    pnComboboxGioiTinh.add(comboboxGioiTinh);
    //tạo ra panel chứa các button thêm và làm mới
    JPanel pnButton = new JPanel();
    pnButton.setLayout(new FlowLayout(FlowLayout.CENTER));
    JButton btnSua = new JButton("Sửa");
    btnSua.setIcon(new ImageIcon("images/add24px.png"));
    pnButton.add(btnSua);
    JButton btnLamMoi = new JButton("Làm Mới ");
    btnLamMoi.setIcon(new ImageIcon("images/refresh24px.png"));
    pnButton.add(btnLamMoi);
    
    panel.add(pnThongTin);
    panel.add(pnHoVaTen);
    panel.add(pnDiaChi);
    panel.add(pnSoDienThoai);
    panel.add(pnComboboxGioiTinh);
    panel.add(pnNgaySinh);
    panel.add(pnButton);
    //Căn chỉnh lại các label cho thẳng hàng
    lblDiaChi.setPreferredSize(lblSoDienThoai.getPreferredSize());
    lblHoVaTen.setPreferredSize(lblSoDienThoai.getPreferredSize());
    //Căn chỉnh lại các button cho cùng kích cỡ
    btnSua.setPreferredSize(btnLamMoi.getPreferredSize());
    
    return panel;
  }

  public void setDiplay() {
    this.setSize(500, 400);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    this.setResizable(false);
    this.setVisible(true);
  }
}
