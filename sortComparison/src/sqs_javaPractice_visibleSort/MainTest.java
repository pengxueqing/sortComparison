package sqs_javaPractice_visibleSort;
/**
 * ������
 * the entrance of this program
 * �ڲ�����
 * ->����������
 * -->ֱ�Ӳ�������(insert sort)
 * -->�۰��������(binary sort)
 * -->ϣ������(shell sort)
 * ->����������
 * -->ð������(bubble sort)
 * -->��������(quick sort)
 * ->ѡ��������
 * -->��ѡ������
 * -->����ѡ������
 * -->������
 * ->�鲢����
 * ->����������
 * -->��ؼ�������
 * -->��ʽ��������
 * */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainTest{
	public MainTest()
	{
		JFrame jf=new JFrame("�����㷨�Ƚ�ϵͳ");    //����һ��JFrame����
		//�۰��������
		BinarySort binarySort = new BinarySort();
		//ֱ�Ӳ�������(insert sort)
		InsertSort insertSort = new InsertSort();
		//ð������(bubble sort)
		BubbleSort bubbleSort = new BubbleSort();
		//ϣ������(shell sort)
		ShellSort shellSort = new ShellSort();
		//��������(quick sort)
		QuickSort quickSort = new QuickSort();
		//ѡ������
		SelectSort selectSort= new SelectSort();
		//�鲢����
		MergeSort mergeSort= new MergeSort();
		//������
		HeapSort heapSort= new HeapSort();
		//��������
		RadixSort radixSort= new RadixSort();

//		Box b1=Box.createHorizontalBox();    //��������Box����
		JPanel jp0=new JPanel();    //����һ��JPanel����

		JButton jb = new JButton("��ʼ�Ƚ�");//����һ����ť
		JLabel jl1=new JLabel("�۰��������");    //����һ����ǩ
		JLabel jl2=new JLabel("ֱ�Ӳ�������");
		JLabel jl3=new JLabel("ð������");
		JLabel jl4=new JLabel("ϣ������");
		JLabel jl5=new JLabel("��������");
		JLabel jl6=new JLabel("ѡ������");
		JLabel jl7=new JLabel("�鲢����");
		JLabel jl8=new JLabel("������");
		JLabel jl9=new JLabel("��������");

//		jf.add(b1);    //��������Box��ӽ�����
		jf.add(jp0);
		jf.add(binarySort);
		jf.add(insertSort);
		jf.add(bubbleSort);
		jf.add(shellSort);
		jf.add(quickSort);
		jf.add(selectSort);
		jf.add(mergeSort);
		jf.add(heapSort);
		jf.add(radixSort);

		jp0.add(jb);    //����ť��ӵ����
		jp0.add(jl1);
		jp0.add(jl2);
		jp0.add(jl3);
		jp0.add(jl4);
		jp0.add(jl5);
		jp0.add(jl6);
		jp0.add(jl7);
		jp0.add(jl8);
		jp0.add(jl9);

		jp0.setBackground(Color.white);    //���ñ���ɫ
		jp0.setPreferredSize(new Dimension(510, 150)); //����jpanel�ߴ�
		binarySort.setPreferredSize(new Dimension(510, 150)); //����jpanel�ߴ�
		insertSort.setPreferredSize(new Dimension(510, 150)); //����jpanel�ߴ�
		bubbleSort.setPreferredSize(new Dimension(510, 150)); //����jpanel�ߴ�
		shellSort.setPreferredSize(new Dimension(510, 150)); //����jpanel�ߴ�
//		jp4.setBackground(Color.white);
		quickSort.setPreferredSize(new Dimension(510, 150)); //����jpanel�ߴ�
		selectSort.setPreferredSize(new Dimension(510, 150)); //����jpanel�ߴ�
//		jp6.setBackground(Color.white);
		mergeSort.setPreferredSize(new Dimension(510, 150)); //����jpanel�ߴ�
		heapSort.setPreferredSize(new Dimension(510, 150)); //����jpanel�ߴ�
		radixSort.setPreferredSize(new Dimension(510, 150)); //����jpanel�ߴ�
//		jb.setPreferredSize(new Dimension(100, 40)); //���ð�ť�ߴ�
		//��JPanel���FlowLayout���ֹ��������������ĺ���������϶������Ϊ20����

		jb.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				binarySort.thread.start();
				insertSort.thread.start();
				bubbleSort.thread.start();
				shellSort.thread.start();
				quickSort.thread.start();
				selectSort.thread.start();
				mergeSort.thread.start();
				heapSort.thread.start();
				radixSort.thread.start();
			}
		});

		jf.setLayout(new GridLayout(5,2,0,0));
		jp0.setLayout(new GridLayout(5,2,20,5));
		jf.setBounds(520, 150, 1020, 750);    //���ô��ڴ�С��λ��
		jf.setVisible(true);    //���ô��ڿɼ�
	}

	public static void main(String[] args) throws InterruptedException {
		new MainTest();    //����һ��ʵ��������
	}
}
