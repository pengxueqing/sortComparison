package sqs_javaPractice_visibleSort;
/**
 * ��������---ϣ������(insert sort---shell sort)
 * */
public class ShellSort extends VisibleSort implements Sort,Runnable{

	Thread thread;
	int[] delta = {4,2,1}; //����
	
	ShellSort(){
		thread = new Thread(this);
//		thread.start();
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				startSort();
			} catch (Exception e) {}
		}
		
	}

	@Override
	public void startSort() {
		try {
			Thread.sleep(500);
		} catch (Exception e) {}
		
		for (int i = 0; i < 3; i++) {
			shellSort(delta[i]);
		}
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {}
//		super.jFrame.setVisible(false);
	}
	
	
	public void shellSort(int delta) {
		for (int i = delta; i < 100; i++) {
			if (array.get(i) < array.get(i-delta)) {
				int temp = array.get(i);
				//������������--subsequent sort
				int j;
				for (j = i-delta; j>=0 && temp < array.get(j); j-=delta) {
					array.set(array.get(j), j+delta);
					//�ػ�--redraw
					try {
						Thread.sleep(10);
					} catch (Exception e) {}
					super.repaint();
				}
				array.set(temp, j+delta);	
			}
		}
	}

}
