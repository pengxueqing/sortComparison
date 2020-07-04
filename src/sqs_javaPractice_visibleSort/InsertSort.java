package sqs_javaPractice_visibleSort;

import sun.security.util.ArrayUtil;

/**
 * 插入排序----直接插入排序(insert sort---InsertSort)
 * */
public class InsertSort extends VisibleSort implements Sort,Runnable{	
	
	Thread thread ;
	
	InsertSort(){
		thread = new Thread(this);
//		thread.start();
	}
	
	
	@Override
	public void run() {
		while (true) {
			try {
				startSort();
			} catch (Exception e) {}
		}	
	}
	
	//直接插入排序可视化
	@Override
	public void startSort() {
		try {
			Thread.sleep(500);
		} catch (Exception e) {}
		int j; // 已排序列表下标
		int t; // 待排序元素
		for (int i = 1; i < 100; i++) {
			if (array.get(i) < array.get(i-1)) {
				t = array.get(i); // 赋值给待排序元素
				for (j = i - 1; j >= 0 && array.get(j) > t; j--) {
					array.set(array.get(j),j+1);

					try {
						Thread.sleep(speed);
					} catch (Exception e) {}
					repaint();
					// 从后往前遍历已排序列表，逐个和待排序元素比较，如果已排序元素较大，则将它后移
				}
				array.set(t,j+1);
				// 将待排序元素插入到正确的位置
			}
		}
		//排序完成停2s退出
		try {
			Thread.sleep(2000); 
		} catch (Exception e) {}
//		super.jFrame.setVisible(false);
	}
}
