package vn.com.dt5.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
public class QuanLiHangHoa extends JFrame implements ActionListener{
  /**
   * Contructor chua 2 phuong thuc : cai dat giao dien hien thi & Tabbedpane.
   */
  public QuanLiHangHoa() {
    this.setTitle("Giao diện quản lí hàng hóa");
    setDisplay();
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
  /**
   * cai dat giao dien
   */
  private void setDisplay() {
    this.setSize(1100, 700);
    //this.setExtendedState(MAXIMIZED_BOTH);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
