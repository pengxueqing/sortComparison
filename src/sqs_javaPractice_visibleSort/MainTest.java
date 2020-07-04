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
import com.sun.org.apache.regexp.internal.RE;
import jdk.internal.dynalink.beans.StaticClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainTest{


	public MainTest()
	{

		JFrame jf=new JFrame("�����㷨�Ƚ�ϵͳ");    //����һ��JFrame����
		//�۰��������
		BinarySort binarySort0 = new BinarySort();
		BinarySort binarySort = new BinarySort();
		arrClone(binarySort.array,binarySort0.array);

		//ֱ�Ӳ�������(insert sort)
		InsertSort insertSort = new InsertSort();
		arrClone(insertSort.array,binarySort0.array);
		//ð������(bubble sort)
		BubbleSort bubbleSort = new BubbleSort();
		arrClone(bubbleSort.array,binarySort0.array);
		//ϣ������(shell sort)
		ShellSort shellSort = new ShellSort();
		arrClone(shellSort.array,binarySort0.array);
		//��������(quick sort)
		QuickSort quickSort = new QuickSort();
		arrClone(quickSort.array,binarySort0.array);
		//ѡ������
		SelectSort selectSort= new SelectSort();
		arrClone(selectSort.array,binarySort0.array);
		//�鲢����
		MergeSort mergeSort= new MergeSort();
		arrClone(mergeSort.array,binarySort0.array);
		//������
		HeapSort heapSort= new HeapSort();
		arrClone(heapSort.array, binarySort0.array);
		//��������
		RadixSort radixSort= new RadixSort();
		arrClone(radixSort.array, binarySort0.array);

//		Box b1=Box.createHorizontalBox();    //��������Box����



		JPanel jp0 = new JPanel();    //����һ��JPanel����

<<<<<<< HEAD
=======

		JButton jbStart = new JButton("��ʼ�Ƚ�");//����һ����ť
		JButton jbSpeedUp = new JButton("����");
		JButton jbSpeedDown = new JButton("����");
		JButton jbAboutOrder = new JButton("��������");
		JButton jbReset = new JButton("����");
>>>>>>> 81ced97a97d4a0a60f341e7c5284f0087e674676
		JLabel jl1 = new JLabel("�۰��������");    //����һ����ǩ
		JLabel jl2 = new JLabel("ֱ�Ӳ�������");
		JLabel jl3 = new JLabel("ð������");
		JLabel jl4 = new JLabel("ϣ������");
		JLabel jl5 = new JLabel("��������");
		JLabel jl6 = new JLabel("ѡ������");
		JLabel jl7 = new JLabel("�鲢����");
		JLabel jl8 = new JLabel("������");
		JLabel jl9 = new JLabel("��������");
<<<<<<< HEAD
		JButton jbStart = new JButton("��ʼ�Ƚ�");//����һ����ť
		JButton jbSpeedUp = new JButton("����");
		JButton jbSpeedDown = new JButton("����");
		JButton jbAboutOrder = new JButton("��������");
		JButton jbReset = new JButton("����");

//		jf.add(b1);    //��������Box��ӽ�����
//		jf.add(jp0);
=======


//		jf.add(b1);    //��������Box��ӽ�����
		jf.add(jp0);
>>>>>>> 81ced97a97d4a0a60f341e7c5284f0087e674676

		jf.add(binarySort);
		jf.add(insertSort);
		jf.add(bubbleSort);

		jf.add(shellSort);
		jf.add(quickSort);
		jf.add(selectSort);
		jf.add(mergeSort);
		jf.add(heapSort);
		jf.add(radixSort);

<<<<<<< HEAD
=======
		jp0.add(jbStart);//����ť��ӵ����
		jp0.add(jbSpeedUp);
		jp0.add(jbSpeedDown);
		jp0.add(jbAboutOrder);
		jp0.add(jbReset);
>>>>>>> 81ced97a97d4a0a60f341e7c5284f0087e674676
		jp0.add(jl1);
		jp0.add(jl2);
		jp0.add(jl3);
		jp0.add(jl4);
		jp0.add(jl5);
		jp0.add(jl6);
		jp0.add(jl7);
		jp0.add(jl8);
		jp0.add(jl9);

<<<<<<< HEAD
		jp0.add(jbStart);//����ť��ӵ����
		jp0.add(jbSpeedUp);
		jp0.add(jbSpeedDown);
		jp0.add(jbAboutOrder);
		jp0.add(jbReset);
		jf.add(jp0);

=======
>>>>>>> 81ced97a97d4a0a60f341e7c5284f0087e674676
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

<<<<<<< HEAD
		jf.setLayout(new GridLayout(5, 2, 10, 0));
		jp0.setLayout(new GridLayout(7, 2, 5, 5));
		jf.setBounds(520, 150, 1030, 800);    //���ô��ڴ�С��λ��
=======
		jf.setLayout(new GridLayout(5, 2, 0, 0));
		jp0.setLayout(new GridLayout(5, 2, 20, 5));
		jf.setBounds(520, 150, 1020, 750);    //���ô��ڴ�С��λ��
>>>>>>> 81ced97a97d4a0a60f341e7c5284f0087e674676
		jf.setVisible(true);    //���ô��ڿɼ�


		jbStart.addActionListener(new ActionListener()
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




		//������������
		jbAboutOrder.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ShellSort shellSort1 = new ShellSort();
				for (int i = 4; i < 100; i++) {
					if (shellSort1.array.get(i) < shellSort1.array.get(i-4)) {
						int temp = shellSort1.array.get(i);
						//������������--subsequent sort
						int j;
						for (j = i-4; j>=0 && temp < shellSort1.array.get(j); j-=4) {
							shellSort1.array.set(shellSort1.array.get(j), j+4);
						}
						shellSort1.array.set(temp, j+4);
					}
				}




				arrClone(binarySort.array,shellSort1.array);
				binarySort.windowFrom();

				//�۰��������
				arrClone(insertSort.array,shellSort1.array);

				//ð������(bubble sort)
				arrClone(bubbleSort.array,shellSort1.array);

				//ϣ������(shell sort)
				arrClone(shellSort.array,shellSort1.array);

				//��������(quick sort)
				arrClone(quickSort.array,shellSort1.array);

				//ѡ������
				arrClone(selectSort.array,shellSort1.array);

				//�鲢����
				arrClone(mergeSort.array,shellSort1.array);

				//������
				arrClone(heapSort.array, shellSort1.array);

				//��������
				arrClone(radixSort.array, shellSort1.array);

			}
		});

		//�رյ�ǰ���ڣ����½�
		jbReset.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				jf.setVisible(false);
				new MainTest();
			}
		});

		jbSpeedDown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{

				binarySort.speed += 20;
				insertSort.speed += 20;
				bubbleSort.speed += 20;
				shellSort.speed  += 20;
				quickSort.speed  += 20;
				selectSort.speed += 20;
				mergeSort.speed  += 20;
				heapSort.speed   += 20;
				radixSort.speed  += 20;
			}
		});


		jbSpeedUp.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{


				if (selectSort.speed <= 0){
					System.out.println("�ٶȹ���");
				}else {

					binarySort.speed -= 20;
					insertSort.speed -= 20;
					bubbleSort.speed -= 20;
					shellSort.speed  -= 20;
					quickSort.speed  -= 20;
					selectSort.speed -= 20;
					mergeSort.speed  -= 20;
					heapSort.speed   -= 20;
					radixSort.speed  -= 20;
				}
			}
		});


	}
	public void arrClone(ArrayNeedToSort a,ArrayNeedToSort b){
		for (int i = 0; i < 100; i++){
			a.set(b.get(i),i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		new MainTest();    //����һ��ʵ��������

	}
}
