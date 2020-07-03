package sqs_javaPractice_visibleSort;
/**
 * 插入排序---折半插入排序(insert sort---BinarySort)
 * */
public class BinarySort extends VisibleSort implements Sort,Runnable{

	Thread thread;

	
	BinarySort(){
		thread = new Thread(this);
//		thread.start();
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				startSort();
			} catch (Exception e){}
		}		
	}
	@Override
	public void startSort() {
		try {
			Thread.sleep(500);
		} catch (Exception e) {}
		for (int i = 1; i < 100; i++) {
			int temp = super.array.get(i);
			int low = 0;
			int high = i - 1;
			while(low <= high) { //确定插入位置
				int mid = (low + high)/2;
				if (temp < array.get(mid)) {
					high = mid - 1;
				}else {
					low = mid + 1;
				}
			}
			//移动,插入
			for (int j = i-1; j >= low; j--) {
				array.set(array.get(j), j+1);
				try {
					Thread.sleep(10);
				} catch (Exception e) {}
				super.repaint();
			}
			array.set(temp, low);
		}
		try {
			Thread.sleep(2000);
		} catch (Exception e) {}
	}
}
