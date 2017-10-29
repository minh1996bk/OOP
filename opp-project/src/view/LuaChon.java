package vn.com.dt5.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class LuaChon extends JFrame {
  JMenu menuDangXuat, menuGioiThieu;
  JButton btnQLNV, btnQLHH, btnTimKiem, btnBaoCao;
  Font font = new Font("Consolas", Font.BOLD, 15);
  public LuaChon() {
    setTitle("Giao diện lựa chọn");
    setSize(600, 300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setResizable(false);
    addJMenuBar();
    createDesktop();
    addEvents();

  }
  private void addEvents() {
    menuDangXuat.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent arg0) {
        int y= JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn thoát ?", "Exit", NORMAL);
        if(y==JOptionPane.YES_OPTION) {
          System.exit(0);
        }else return;
      }
    });

  }
  private void addJMenuBar() {
    JMenuBar menubar = new JMenuBar();
    setJMenuBar(menubar);
    menuDangXuat = new JMenu("Đăng xuất");
    menuDangXuat.setIcon(new ImageIcon("images/exit.png"));

    menuGioiThieu = new JMenu("Giới thiệu");
    menuGioiThieu.setIcon(new ImageIcon("images/home.png"));

    menubar.add(menuGioiThieu);
    menubar.add(menuDangXuat);
  }
  private void createDesktop() {
    Container con = getContentPane();
    con.setLayout(new BorderLayout());
    JPanel pnTitle = createPnTitle();
    JPanel pnButtons = createPnButtons();
    con.add(pnTitle, BorderLayout.NORTH);
    con.add(pnButtons, BorderLayout.CENTER);


  }
  private JPanel createPnButtons() {
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

    JPanel pnBtn1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
    btnQLNV = new JButton("Quản lí nhân viên");
    btnQLNV.setIcon(new ImageIcon("images/manage_employee.png"));
    btnQLNV.setToolTipText("Hiển thị ra danh mục quản lí nhân viên");
    btnQLNV.setFont(font);

    btnQLHH = new JButton("Quản lí hàng hóa");
    btnQLHH.setIcon(new ImageIcon("images/manage_items.png"));
    btnQLHH.setToolTipText("Hiển thị ra danh mục quản lí hàng hóa của cửa hàng");
    btnQLHH.setFont(font);

    pnBtn1.add(btnQLNV);
    pnBtn1.add(btnQLHH);
    panel.add(pnBtn1);

    JPanel pnBtn2 = new JPanel();
    btnBaoCao = new JButton("Báo cáo doanh thu");
    btnBaoCao.setIcon(new ImageIcon("images/report.png"));
    btnBaoCao.setToolTipText("Hiển thị ra báo cáo về tài chính của cửa hàng Media One");
    btnBaoCao.setFont(font);

    pnBtn2.add(btnBaoCao);
    panel.add(pnBtn2);

    btnBaoCao.setPreferredSize(btnQLNV.getPreferredSize());
    btnQLHH.setPreferredSize(btnQLNV.getPreferredSize());
    return panel;
  }
  private JPanel createPnTitle() {
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    JPanel pnTitle = new JPanel(new FlowLayout(FlowLayout.CENTER));
    Font f = new Font("Consolas", Font.BOLD, 30);
    JLabel lblTitle = new JLabel("Mời bạn lựa chọn chức năng");
    lblTitle.setIcon(new ImageIcon("images/select.png"));
    lblTitle.setFont(f);
    pnTitle.add(lblTitle);
    panel.add(pnTitle);

    return panel;
  }
}
