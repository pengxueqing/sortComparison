package sqs_javaPractice_visibleSort;

import sun.util.resources.cldr.en.TimeZoneNames_en_PK;

import java.util.Arrays;

/**
 * ������
 * */
public class HeapSort extends VisibleSort implements Sort,Runnable {
    Thread thread;

    HeapSort() {
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
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}


        heapSort();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {}
//        super.jFrame.setVisible(false);

    }



    public void heapSort() {
        for (int i = (100 - 1) / 2; i >= 0; i--) {
            //�ӵ�һ����Ҷ�ӽ��������ϣ�������������ṹ
            adjustHeap( i, 100);
        }

        //�����ѽṹ+�����Ѷ�Ԫ����ĩβԪ��
        for (int i = 100 - 1; i > 0; i--) {
            //���Ѷ�Ԫ����ĩβԪ�ؽ��н���
            int temp = array.get(i);
            array.set(array.get(0), i);
            array.set(temp,0);

            //���¶Զѽ��е���
            adjustHeap(0, i);

            try {
                Thread.sleep(100); //ÿ���ػ���Ҫ��һ�����ӳ٣�Ϊ�˿��壡
            } catch (Exception e) {}
            super.repaint();


        }



    }
    private void adjustHeap(int parent, int length) {
        //��temp��Ϊ���ڵ�
        int temp = array.get(parent);
        //����
        int lChild = 2 * parent + 1;

        while (lChild < length) {
            //�Һ���
            int rChild = lChild + 1;
            // ������Һ��ӽ�㣬�����Һ��ӽ���ֵ�������ӽ�㣬��ѡȡ�Һ��ӽ��
            if (rChild < length && array.get(lChild) < array.get(rChild)) {
                lChild++;
            }

            // ���������ֵ�Ѿ����ں��ӽ���ֵ����ֱ�ӽ���
            if (temp >= array.get(lChild)) {
                break;
            }

            // �Ѻ��ӽ���ֵ���������
            array.set(array.get(lChild),parent);


            //ѡȡ���ӽ������ӽ��,��������ɸѡ
            parent = lChild;
            lChild = 2 * lChild + 1;
        }
        array.set(temp,parent);
    }

}