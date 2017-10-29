package vn.com.dt5.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class BaoCao extends JFrame {
 
 public BaoCao() {
   this.setTitle("Màn hình báo cáo");
   setDisplay();
   createGui();
 }
 
 
 private void createGui() {
   Container con = getContentPane();
   con.setLayout(new BorderLayout());
   
   JPanel pnCenter = createPnCenter();
   
   con.add(pnCenter, BorderLayout.CENTER);
}

private JPanel createPnCenter() {
  JPanel panel2 = new JPanel();
  panel2.setLayout(new BorderLayout());
  TitledBorder titleCenter = new TitledBorder(
      BorderFactory.createLineBorder(Color.GREEN),
          "Thống kê doanh thu");
  panel2.setBorder(titleCenter);
  
  JPanel pnThongKe1 = new JPanel();
  pnThongKe1.setLayout(new BoxLayout(pnThongKe1, BoxLayout.Y_AXIS));
  
  JPanel pnRow1 = new JPanel();
  pnRow1.setLayout(new FlowLayout(FlowLayout.CENTER));
  pnThongKe1.add(pnRow1);
  JLabel lblTu = new JLabel("Từ:  ");
  JComboBox<Object>ngay1 = new JComboBox<Object>();
  JComboBox<Object>thang1 = new JComboBox<Object>();
  JComboBox<Object>nam1 = new JComboBox<Object>();
  
  JLabel lblDen = new JLabel("Đến:  ");
  JComboBox<Object>ngay2 = new JComboBox<Object>();
  JComboBox<Object>thang2 = new JComboBox<Object>();
  JComboBox<Object>nam2 = new JComboBox<Object>();
  
  pnRow1.add(lblTu);
  pnRow1.add(ngay1);
  pnRow1.add(thang1);
  pnRow1.add(nam1);
  pnRow1.add(lblDen);
  pnRow1.add(ngay2);
  pnRow1.add(thang2);
  pnRow1.add(nam2);
  
  JPanel pnRow2 = new JPanel();
  pnRow2.setLayout(new FlowLayout(FlowLayout.CENTER));
  pnThongKe1.add(pnRow2);
  JLabel lblDoanhThu2 = new JLabel("Doanh thu: ");
  JTextField txtDoanhThu2 = new JTextField(15);
  txtDoanhThu2.setEnabled(false);
  pnRow2.add(lblDoanhThu2);
  pnRow2.add(txtDoanhThu2);
  
  JPanel pnRow3 = new JPanel();
  pnRow3.setLayout(new FlowLayout(FlowLayout.CENTER));
  pnThongKe1.add(pnRow3);
  JButton btnThongKe1 = new JButton("Thống kê");
  btnThongKe1.setIcon(new ImageIcon("images/report.png"));
  JButton btnChiTiet = new JButton("Chi tiết");
  btnChiTiet.setIcon(new ImageIcon("images/report.png"));
  pnRow3.add(btnThongKe1);
  pnRow3.add(btnChiTiet);
  panel2.add(pnThongKe1, BorderLayout.CENTER);
  return panel2;
}
private void setDisplay() {
   this.setSize(600, 300);
   this.setDefaultCloseOperation(EXIT_ON_CLOSE);
   this.setResizable(false);
   this.setLocationRelativeTo(null);
   this.setVisible(true);
}
}
