package sqs_javaPractice_visibleSort;
/**
 * 主函数
 * the entrance of this program
 * 内部排序
 * ->插入类排序
 * -->直接插入排序(insert sort)
 * -->折半插入排序(binary sort)
 * -->希尔排序(shell sort)
 * ->交换类排序
 * -->冒泡排序(bubble sort)
 * -->快速排序(quick sort)
 * ->选择类排序
 * -->简单选择排序
 * -->树形选择排序
 * -->堆排序
 * ->归并排序
 * ->分配类排序
 * -->多关键字排序
 * -->链式基数排序
 * */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainTest{
	public MainTest()
	{
		JFrame jf=new JFrame("排序算法比较系统");    //创建一个JFrame对象
		//折半插入排序
		BinarySort binarySort = new BinarySort();
		//直接插入排序(insert sort)
		InsertSort insertSort = new InsertSort();
		//冒泡排序(bubble sort)
		BubbleSort bubbleSort = new BubbleSort();
		//希尔排序(shell sort)
		ShellSort shellSort = new ShellSort();
		//快速排序(quick sort)
		QuickSort quickSort = new QuickSort();
		//选择排序
		SelectSort selectSort= new SelectSort();
		//归并排序
		MergeSort mergeSort= new MergeSort();
		//堆排序
		HeapSort heapSort= new HeapSort();
		//基数排序
		RadixSort radixSort= new RadixSort();

//		Box b1=Box.createHorizontalBox();    //创建横向Box容器
		JPanel jp0=new JPanel();    //创建一个JPanel对象

		JButton jb = new JButton("开始比较");//创建一个按钮
		JLabel jl1=new JLabel("折半插入排序");    //创建一个标签
		JLabel jl2=new JLabel("直接插入排序");
		JLabel jl3=new JLabel("冒泡排序");
		JLabel jl4=new JLabel("希尔排序");
		JLabel jl5=new JLabel("快速排序");
		JLabel jl6=new JLabel("选择排序");
		JLabel jl7=new JLabel("归并排序");
		JLabel jl8=new JLabel("堆排序");
		JLabel jl9=new JLabel("基数排序");

//		jf.add(b1);    //将外层横向Box添加进窗体
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

		jp0.add(jb);    //将按钮添加到面板
		jp0.add(jl1);
		jp0.add(jl2);
		jp0.add(jl3);
		jp0.add(jl4);
		jp0.add(jl5);
		jp0.add(jl6);
		jp0.add(jl7);
		jp0.add(jl8);
		jp0.add(jl9);

		jp0.setBackground(Color.white);    //设置背景色
		jp0.setPreferredSize(new Dimension(510, 150)); //设置jpanel尺寸
		binarySort.setPreferredSize(new Dimension(510, 150)); //设置jpanel尺寸
		insertSort.setPreferredSize(new Dimension(510, 150)); //设置jpanel尺寸
		bubbleSort.setPreferredSize(new Dimension(510, 150)); //设置jpanel尺寸
		shellSort.setPreferredSize(new Dimension(510, 150)); //设置jpanel尺寸
//		jp4.setBackground(Color.white);
		quickSort.setPreferredSize(new Dimension(510, 150)); //设置jpanel尺寸
		selectSort.setPreferredSize(new Dimension(510, 150)); //设置jpanel尺寸
//		jp6.setBackground(Color.white);
		mergeSort.setPreferredSize(new Dimension(510, 150)); //设置jpanel尺寸
		heapSort.setPreferredSize(new Dimension(510, 150)); //设置jpanel尺寸
		radixSort.setPreferredSize(new Dimension(510, 150)); //设置jpanel尺寸
//		jb.setPreferredSize(new Dimension(100, 40)); //设置按钮尺寸
		//向JPanel添加FlowLayout布局管理器，将组件间的横向和纵向间隙都设置为20像素

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
		jf.setBounds(520, 150, 1020, 750);    //设置窗口大小和位置
		jf.setVisible(true);    //设置窗口可见
	}

	public static void main(String[] args) throws InterruptedException {
		new MainTest();    //创建一个实例化对象
	}
}
