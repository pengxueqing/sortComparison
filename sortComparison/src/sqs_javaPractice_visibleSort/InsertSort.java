package sqs_javaPractice_visibleSort;
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
			} catch (Exception e) {
				System.err.println("����");
			}			
		}	
	}
	
	//ֱ�Ӳ���������ӻ�
	@Override
	public void startSort() {
		for (int i = 1; i < 100; i++) {
			int temp = super.array.get(i); //��Ҫ��������������ݴ浽��ʱ������
			int j = i - 1; //���ڱ�ǲ���λ��
			while(temp < array.get(j)) {//Ѱ�Ҳ���λ��
				array.set(array.get(j), j+1);
				j -= 1;
				try {
					Thread.sleep(10); //ÿ���ػ���Ҫ��һ�����ӳ٣�Ϊ�˿��壡
				} catch (Exception e) {}
                super.repaint();
			}
			array.set(temp, j+1);	
		}
		//�������ͣ2s�˳�
		try {
			Thread.sleep(2000); 
		} catch (Exception e) {}
//		super.jFrame.setVisible(false);
	}
}
