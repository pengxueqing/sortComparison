package sqs_javaPractice_visibleSort;
/**
 * ��������
 * */
public class RadixSort extends VisibleSort implements Sort,Runnable {

    Thread thread;

    RadixSort() {
        thread = new Thread(this);
//        thread.start();
    }


    @Override
    public void run() {
        try {
            startSort();
        } catch (Exception e) {
        }
    }

    @Override
    public void startSort() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}

        radixSort();

        //2s������
        try {
            Thread.sleep(3000);
        } catch (Exception e) {}
//        super.jFrame.setVisible(false);
    }

    public void radixSort() {
        int max = findMax(0, 100 - 1);

        //��Ҫ�����Ĵ������������ֵ��λ��������
        for (int i = 1; max / i > 0; i = i * 10) {

            int[][] buckets = new int[100][10];

            //��ȡÿһλ����(����ʮ���١�ǧλ...���䵽Ͱ����)
            for (int j = 0; j < 100; j++) {

                int num = (array.get(j) / i) % 10;

                //�������Ͱ����
                buckets[j][num] = array.get(j);

            }


            //����Ͱ�����Ԫ��
            int k = 0;

            //��10��Ͱ��
            for (int j = 0; j < 10; j++) {
                //��ÿ��Ͱ�����Ԫ�ؽ��л���

                for (int l = 0; l < 100; l++) {

                    //���Ͱ��������Ԫ�ؾͻ���(���ݳ�ʼ����Ϊ0)
                    if (buckets[l][j] != 0) {
                        array.set(buckets[l][j], k++);


                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {}
                        super.repaint();
                    }

                }

            }


        }


    }

    public int findMax(int L, int R) {

        //���������ֻ��һ��������ô���ľ��Ǹ������һ��ֵ��
        if (L == R) {
            return array.get(L);
        } else {

            int a = array.get(L);
            int b = findMax(L + 1, R);//�ҳ���������ֵ

            if (a > b) {
                return a;
            } else {
                return b;
            }
        }
    }

}
