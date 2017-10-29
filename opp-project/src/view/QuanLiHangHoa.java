package vn.com.dt5.view;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
public class QuanLiHangHoa extends JFrame {
  /**
   * Contructor chua 2 phuong thuc : cai dat giao dien hien thi & Tabbedpane.
   */
  public QuanLiHangHoa() {
    setTitle("Giao diện quản lí hàng hóa");
    setSize(1100, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    createTabbedPane();
  }
  /**
   * Tabbedpane chua 3 Tab.
   */
  private void createTabbedPane() {
    Container con = getContentPane();
    con.setLayout(new BorderLayout());
    JTabbedPane tabbedpane = new JTabbedPane();
    tabbedpane.addTab("Quản lí sách", new ImageIcon("images/book.png"), new QuanLiSach());
    tabbedpane.addTab("Quản lí đĩa nhạc", new ImageIcon("images/disc_music.png"), new QuanLiDiaNhac());
    tabbedpane.addTab("Quản lí đĩa phim", new ImageIcon("images/disc_movie.png"), new QuanLiDiaPhim());
    con.add(tabbedpane, BorderLayout.CENTER);
  }
}
