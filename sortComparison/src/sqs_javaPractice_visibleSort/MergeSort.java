package sqs_javaPractice_visibleSort;
/**
 * �鲢����
 * */
public class MergeSort extends VisibleSort implements Sort,Runnable {
    Thread thread;

    MergeSort (){
        thread = new Thread(this);
//        thread.start();
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
        int mid = 49;
        int high = 99;

        try {
            Thread.sleep(500);
        } catch (Exception e) {}

        mergeSort(low,high);

        //��ͣ2s������ hide this frame after 2s
        try {
            Thread.sleep(2000);
        } catch (Exception e) {}
//        super.jFrame.setVisible(false);
    }

    public void mergeSort(int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            // ���
            mergeSort(low, mid);
            // �ұ�
            mergeSort(mid + 1, high);
            // ���ҹ鲢
            merge(low, mid, high);
        }
    }


    public void merge(int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;// ��ָ��
        int j = mid + 1;// ��ָ��
        int k = 0;
        // �ѽ�С�������Ƶ���������
        while (i <= mid && j <= high) {
            if (array.get(i) < array.get(j)) {
                temp[k++] = array.get(i++);
            } else {
                temp[k++] = array.get(j++);
            }
        }
        // �����ʣ�������������
        while (i <= mid) {
            temp[k++] = array.get(i++);
        }
        // ���ұ߱�ʣ�������������
        while (j <= high) {
            temp[k++] = array.get(j++);
        }
        // ���������е�������nums����
        for (int k2 = 0; k2 < temp.length; k2++) {
            array.set(temp[k2], k2+low);
        }
        try {
            Thread.sleep(100);
        } catch (Exception e) {}
        super.repaint();
    }


    public void mergeSort() {
    }
}
