package sqs_javaPractice_visibleSort;

import sun.security.util.ArrayUtil;

/**
 * ��������----ֱ�Ӳ�������(insert sort---InsertSort)
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
	
	//ֱ�Ӳ���������ӻ�
	@Override
	public void startSort() {
		try {
			Thread.sleep(500);
		} catch (Exception e) {}
		int j; // �������б��±�
		int t; // ������Ԫ��
		for (int i = 1; i < 100; i++) {
			if (array.get(i) < array.get(i-1)) {
				t = array.get(i); // ��ֵ��������Ԫ��
				for (j = i - 1; j >= 0 && array.get(j) > t; j--) {
					array.set(array.get(j),j+1);

					try {
						Thread.sleep(speed);
					} catch (Exception e) {}
					repaint();
					// �Ӻ���ǰ�����������б�����ʹ�����Ԫ�رȽϣ����������Ԫ�ؽϴ���������
				}
				array.set(t,j+1);
				// ��������Ԫ�ز��뵽��ȷ��λ��
			}
		}
		//�������ͣ2s�˳�
		try {
			Thread.sleep(2000); 
		} catch (Exception e) {}
//		super.jFrame.setVisible(false);
	}
}
