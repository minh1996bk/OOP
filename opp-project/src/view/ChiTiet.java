package vn.com.dt5.view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class ChiTiet extends JFrame {
  public ChiTiet() {
    setTitle("Chi Tiết");
    setSize(800, 600);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    createDefaultTableModel();
  }
  private void createDefaultTableModel() {
    Container con = getContentPane();
    con.setLayout(new BorderLayout());
    DefaultTableModel dtmChiTiet = new DefaultTableModel();
    dtmChiTiet.addColumn("Thời gian");
    dtmChiTiet.addColumn("Tên chi phí");
    dtmChiTiet.addColumn("Chi phí");
    JTable tblChiPhi = new JTable(dtmChiTiet);
    JScrollPane sc = new JScrollPane(tblChiPhi, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    con.add(sc, BorderLayout.CENTER);
  }
}
