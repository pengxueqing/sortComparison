package sqs_javaPractice_visibleSort;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * ���������Ŀ��ӻ�
 * to make sort visually
 * */
public class VisibleSort extends JPanel{
	JFrame jFrame;
	JPanel jpanel;
	ArrayNeedToSort array;

	VisibleSort() {
		array = new ArrayNeedToSort();
		array.initalArray();
		array.messArray();
		windowFrom();
	}

	//������ӻ�
	public void paint(Graphics g) {
		//ÿ�λ�֮ǰ��Ҫ����ջ���
		g.clearRect(0, 0, 510,150);



		for (int i = 0; i < 100; i++) {
			g.setColor(Color.BLACK);
			g.fillRect(i*5+5,(130-(array.get(i))),5, array.get(i));
		}

	}



	//��������
	public void windowFrom() {
		jpanel=new JPanel();
		jpanel.setBackground(Color.white);
		jpanel.setPreferredSize(new Dimension(510, 150)); //����jpanel�ߴ�
//		jFrame = new JFrame();
//
//		jFrame.setSize(1200,580);
//		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		jFrame.setLocationRelativeTo(null);
//
//
//		jFrame.add(this);
//		jFrame.setVisible(true);
	}
}
