package sqs_javaPractice_visibleSort;
/**
 * �������������
 * the arrary ready to sort
 * */
public class ArrayNeedToSort {
	int[] array;
	
	ArrayNeedToSort() {
		array = new int[100];
	}
	
	//��ʼ������
	public void initalArray() {
		for (int i = 0; i < 100; i++) {
			array[i] = i + 1;
		}
	}
	//α�����������
	public void messArray() {
		for (int i = 0; i < 100; i++) {
			int temp = array[i];
			int j = (int)(Math.random()*100);
			if (i != j) {
				array[i] = array[j];
				array[j] = temp;
			}
		}
	}	
	//���ָ���±������Ԫ��
	public int get(int i) {
		if (i > 100 || i < 0) {
			System.err.println("�±����");
		}else {
			return array[i];
		}		
		return 0;
	}
	//����ָ���±������Ԫ��
	//����temp�滻  array[i]��ֵ
	public void set(int temp,int i) {
		if (i > 100 || i < 0) {
			System.err.println("�±����");
		}else {
			array[i] = temp; //�޸��±�Ϊi�������ֵ
		}		
	}	
}
