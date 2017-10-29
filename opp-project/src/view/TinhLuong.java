package vn.com.dt5.view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")

public class TinhLuong extends JFrame {
  
  public TinhLuong() {
    setTitle("Giao Diện Tính Lương");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(800, 600);
    setLocationRelativeTo(null);
    createTable();
  }
  
  private void createTable() {
    Container con = getContentPane();
    con.setLayout(new BorderLayout());
    DefaultTableModel dtm = new DefaultTableModel();
    dtm.addColumn("Mã nhân viên");
    dtm.addColumn("Tên nhân viên");
    dtm.addColumn("Số tiền/ 1 ca");
    dtm.addColumn("Thành tiền");
    JTable tblTinhLuong = new JTable(dtm);
    JScrollPane sc = new JScrollPane(tblTinhLuong, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    con.add(sc, BorderLayout.CENTER);
    
  }
}
