package sqs_javaPractice_visibleSort;
/**
 * ��������
 * */
public class QuickSort extends VisibleSort implements Sort,Runnable{

	Thread thread;
	
	QuickSort(){
		thread = new Thread(this);
//		thread.start();
	}
	
	
	@Override
	public void run() {
		try {
			startSort();
		} catch (Exception e) {}
	}

	@Override
	public void startSort() {
		int low = 0;
		int high = 99;


		try {
			Thread.sleep(1000);
		} catch (Exception e) {}

		QuickSort(low,high);

		//2s������
		try {
			Thread.sleep(3000);
		} catch (Exception e) {}
//		super.jFrame.setVisible(false);
	}

	public void QuickSort(int low ,int high) {
		if (low < high) {
			int pos = QKSort(low, high);
			QuickSort(low,pos-1);  //�����ӱ�����
			QuickSort(pos+1,high); //���Ҳ��ӱ�����
		}
		
	}
	public int QKSort(int low,int high) {
		int temp = array.get(low); //��׼��¼
		while(low < high) {
			while(low < high && array.get(high) >= temp) {
				high--; //high����������С��temp����
			}
			if (low < high) { array.set(array.get(high), low); low++;}//�ҵ�������ߡ���λ�á�����ʱ�ұ��п�λ��
			while(low < high && array.get(low) <= temp) {
				low++; //low���������Ҵ���temp����
			}
			if(low < high) {array.set(array.get(low), high);high--;}//�ҵ������ұ�
			//�ػ�--redraw
			try {
				Thread.sleep(10);
			} catch (Exception e) {}
			super.repaint();
		}
		array.set(temp, low);//����м� low==highΪ��λ��		
		return low;	//���ػ�׼��¼��λ��
	}

}
