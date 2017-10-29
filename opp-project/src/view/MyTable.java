package vn.com.dt5.view;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("all")
public class MyTable extends JPanel {
	
	public MyTable(String[] tenCot) {
		DefaultTableModel dtm = new DefaultTableModel(tenCot, 0);
		JTable table = new JTable(dtm);
		this.setLayout(new BorderLayout());
		this.add(new JScrollPane(table));
	}
}
