package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemoDao;
import test.dto.MemoDto;

/* SQL> create table memo(
   num number primary key,
   content varchar2(3),
   regdate DATE);
 * CREATE SEQUENCE MEMO_SEQ;
 * 
 * 위와 같이 테이블과 시퀀스를 만들고 해당 테이블에 데이터를
 * SELECT, INSERT, UPDATE, DELETE 기능을 수행할수 있는 MemoFrame을 만들어 보세요.
 * 
 * 조건
 * 1. num 칼럼의 값은 시퀀스를 이용해서 넣으세요.
 * 2. regdate 칼럼의(등록일) 값은 SYSDATE를 이용해서 넣으세요
 * 3. 수정은 content 만 수정 가능하게 하세요
 * 4. MemoDto, MemoDao를 만들어서 프로그래밍 하세요.
 */
public class MemoFrame extends JFrame implements ActionListener{
	JTextField input;	
	
	public MemoFrame() {
			JLabel label=new JLabel("입력창 : ");
			input=new JTextField(10);
					
			JButton selectBtn=new JButton("SELECT");
			selectBtn.setActionCommand("select");
			selectBtn.addActionListener(this);
			
			JButton insertBtn=new JButton("INSERT");
			insertBtn.setActionCommand("insert");
			insertBtn.addActionListener(this);
			
			JButton updateBtn=new JButton("UPDATE");
			updateBtn.setActionCommand("update");
			updateBtn.addActionListener(this);
			
			JButton deleteBtn=new JButton("DELETE");
			deleteBtn.setActionCommand("delete");
			deleteBtn.addActionListener(this);
			
			JPanel panel=new JPanel();
			panel.add(label);
			panel.add(input);
			panel.add(selectBtn);
			panel.add(insertBtn);
			panel.add(updateBtn);
			panel.add(deleteBtn);
			
			add(panel, BorderLayout.NORTH);
			
			JTable table=new JTable();
			String[] colNames= {"num","content","date"};
			DefaultTableModel model=new DefaultTableModel(colNames, 0);
			table.setModel(model);
			JScrollPane scroll=new JScrollPane(table);
			add(scroll, BorderLayout.CENTER);
		}
	public static void main(String[] args) {
		MemoFrame m=new MemoFrame();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setBounds(100, 10, 800, 500);
		m.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String command=e.getActionCommand();
		if(command.equals("select")) {
			
		}else if(command.equals("insert")) {
			String content=input.getText();
			MemoDto dto=new MemoDto(num, content, regdate);
			dto.setContent(content);
			MemoDao dao=MemoDao.getInstance();
			dao.insert(dto);
		}else if(command.equals("update")) {
			
		}else if(command.equals("delete")) {
			
		}
	}
}
