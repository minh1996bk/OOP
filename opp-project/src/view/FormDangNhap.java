package vn.com.dt5.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class FormDangNhap extends JFrame {
  JTextField txtUser;
  JPasswordField txtPass;
  JButton btnThoat, btnDangNhap;
  public FormDangNhap() {
    setTitle("Màn Hình Đăng Nhập");
    setSize(600, 500);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(false);
    createManHinhDangNhap();
    addEvents();
  }

  private void addEvents() {
    txtUser.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        txtUser.setText("");
      }
    });
    btnThoat.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        int x = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn thoát",null, NORMAL);
        if(x==JOptionPane.YES_OPTION) {
          dispose();
        }else return;
      }
    });
    btnDangNhap.addActionListener(new ActionListener() {

      @SuppressWarnings("deprecation")
      @Override
      public void actionPerformed(ActionEvent e) {
        if(txtUser.getText().equals("admin")&&txtPass.getText().equals("admin")) {
          LuaChon luachon = new LuaChon();
          luachon.show();
          dispose();
        }
        btnDangNhap.getRootPane().setDefaultButton(btnDangNhap);
        btnDangNhap.setMnemonic(KeyEvent.VK_ENTER);
        if(txtUser.getText().equals("")||txtPass.getText().equals("")) {
          JOptionPane.showMessageDialog(null, "Không được để trống tên tài khoản hoặc mật khẩu !!!","Empty !!!", JOptionPane.WARNING_MESSAGE);
        }
      }
    });
  }

  private void createManHinhDangNhap() {
    add(createBorderLayOut());
  }

  private Component createBorderLayOut() {
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());
    JPanel panelNorth = createPanelNorth();
    JPanel panelCenter = createPaneCenter();
    JPanel panelSouth = createPaneSouth();
    panel.add(panelNorth, BorderLayout.NORTH);
    panel.add(panelCenter, BorderLayout.CENTER);
    panel.add(panelSouth, BorderLayout.SOUTH);
    return panel;
  }

  private JPanel createPaneSouth() {
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
    JPanel btnDangNhap = createBtnDangNhap();
    JPanel btnThoat = createBtnThoat();
    panel.add(btnDangNhap);
    panel.add(btnThoat);
    return panel;
  }

  private JPanel createBtnThoat() {
    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout());
    btnThoat = new JButton("Thoát");
    btnThoat.setIcon(new ImageIcon("images/logout.png"));
    btnThoat.setPreferredSize(btnDangNhap.getPreferredSize());
    panel.add(btnThoat);
    return panel;
  }

  private JPanel createBtnDangNhap() {
    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout());
    btnDangNhap = new JButton("Đăng Nhập");
    btnDangNhap.setIcon(new ImageIcon("images/login.png"));
    panel.add(btnDangNhap);
    return panel;
  }

  private JPanel createPaneCenter() {
    JPanel panel = new JPanel();
    TitledBorder title = new TitledBorder(BorderFactory.createLineBorder(Color.RED), "Nhập thông tin");
    panel.setLayout(new BorderLayout());

    JPanel panelNhapThongTin = createPaneNhapThongTin();
    panelNhapThongTin.setBorder(title);
    panel.add(panelNhapThongTin, BorderLayout.CENTER);
    return panel;
  }

  private JPanel createPaneNhapThongTin() {
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    JPanel panelUsername = createPanelUsername();
    JPanel panelPassword = createPanelPassword();
    panel.add(panelUsername);
    panel.add(panelPassword);

    return panel;
  }

  private JPanel createPanelUsername() {
    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout(FlowLayout.CENTER));
    JLabel lblUsername = new JLabel("Nhập tài khoản: ");
    lblUsername.setIcon(new ImageIcon("images/id.png"));
    txtUser = new JTextField(20);
    txtUser.setText("Bạn nhập tên tài khoản vào đây !");
    txtUser.setForeground(Color.gray);
    txtUser.setToolTipText("Bạn tên tài khoản vào đây");
    txtUser.requestFocus();
    panel.add(lblUsername);
    panel.add(txtUser);

    return panel;
  }

  private JPanel createPanelPassword() {
    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout(FlowLayout.CENTER));
    JLabel lblPassword = new JLabel("Nhập mật khẩu: ");
    lblPassword.setIcon(new ImageIcon("images/pass.png"));
    txtPass = new JPasswordField(20);
    txtPass.setToolTipText("Bạn nhập mật khẩu của bạn vào đây");
    panel.add(lblPassword);
    panel.add(txtPass);
    return panel;
  }

  private JPanel createPanelNorth() {
    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout(FlowLayout.CENTER));
    JLabel lblAnh = new JLabel(new ImageIcon("images/Capture.png"));
    panel.add(lblAnh);
    return panel;
  }
}
