package sqs_javaPractice_visibleSort;

import sun.util.resources.cldr.en.TimeZoneNames_en_PK;

import java.util.Arrays;

/**
 * 堆排序
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
            Thread.sleep(500);
        } catch (Exception e) {}


        heapSort();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {}
//        super.jFrame.setVisible(false);

    }



    public void heapSort() {
        for (int i = (100 - 1) / 2; i >= 0; i--) {
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap( i, 100);
            try {
                Thread.sleep(10); //每次重画都要有一定的延迟，为了看清！
            } catch (Exception e) {}
            super.repaint();
        }

        //调整堆结构+交换堆顶元素与末尾元素
        for (int i = 100 - 1; i > 0; i--) {
            //将堆顶元素与末尾元素进行交换
            int temp = array.get(i);
            array.set(array.get(0), i);
            array.set(temp,0);

            //重新对堆进行调整
            adjustHeap(0, i);

            try {
                Thread.sleep(100); //每次重画都要有一定的延迟，为了看清！
            } catch (Exception e) {}
            super.repaint();


        }



    }
    private void adjustHeap(int parent, int length) {
        //将temp作为父节点
        int temp = array.get(parent);
        //左孩子
        int lChild = 2 * parent + 1;

        while (lChild < length) {
            //右孩子
            int rChild = lChild + 1;
            // 如果有右孩子结点，并且右孩子结点的值大于左孩子结点，则选取右孩子结点
            if (rChild < length && array.get(lChild) < array.get(rChild)) {
                lChild++;
            }

            // 如果父结点的值已经大于孩子结点的值，则直接结束
            if (temp >= array.get(lChild)) {
                break;
            }

            // 把孩子结点的值赋给父结点
            array.set(array.get(lChild),parent);


            //选取孩子结点的左孩子结点,继续向下筛选
            parent = lChild;
            lChild = 2 * lChild + 1;
        }
        array.set(temp,parent);
    }

}