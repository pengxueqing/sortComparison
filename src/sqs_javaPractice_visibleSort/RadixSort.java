package sqs_javaPractice_visibleSort;
/**
 * 基数排序
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
            Thread.sleep(500);
        } catch (Exception e) {}

        radixSort();

        //2s后隐藏
        try {
            Thread.sleep(2000);
        } catch (Exception e) {}
//        super.jFrame.setVisible(false);
    }

    public void radixSort() {
        int max = findMax(0, 100 - 1);

        //需要遍历的次数由数组最大值的位数来决定
        for (int i = 1; max / i > 0; i = i * 10) {

            int[][] buckets = new int[100][10];

            //获取每一位数字(个、十、百、千位...分配到桶子里)
            for (int j = 0; j < 100; j++) {

                int num = (array.get(j) / i) % 10;

                //将其放入桶子里
                buckets[j][num] = array.get(j);

            }


            //回收桶子里的元素
            int k = 0;

            //有10个桶子
            for (int j = 0; j < 10; j++) {
                //对每个桶子里的元素进行回收

                for (int l = 0; l < 100; l++) {

                    //如果桶子里面有元素就回收(数据初始化会为0)
                    if (buckets[l][j] != 0) {
                        array.set(buckets[l][j], k++);


                        try {
                            Thread.sleep(10);
                        } catch (Exception e) {}
                        super.repaint();
                    }

                }

            }


        }


    }

    public int findMax(int L, int R) {

        //如果该数组只有一个数，那么最大的就是该数组第一个值了
        if (L == R) {
            return array.get(L);
        } else {

            int a = array.get(L);
            int b = findMax(L + 1, R);//找出整体的最大值

            if (a > b) {
                return a;
            } else {
                return b;
            }
        }
    }

}
