package sqs_javaPractice_visibleSort;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * 界面和数组的可视化
 * to make sort visually
 * */
public class VisibleSort extends JPanel{
	int speed = 100;
	JFrame jFrame;
	JPanel jpanel;
	ArrayNeedToSort array;

	VisibleSort() {
		array = new ArrayNeedToSort();
		array.initalArray();
		array.messArray();
		windowFrom();
	}

	//排序可视化
	public void paint(Graphics g) {
		//每次画之前都要先清空画板
		g.clearRect(0, 0, 510,150);



		for (int i = 0; i < 100; i++) {
			g.setColor(Color.BLACK);
			g.fillRect(i*5+5,(130-(array.get(i))),5, array.get(i));
		}

	}



	//窗口设置
	public void windowFrom() {
		jpanel=new JPanel();
		jpanel.setBackground(Color.white);
		jpanel.setPreferredSize(new Dimension(510, 150)); //设置jpanel尺寸
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
