package sqs_javaPractice_visibleSort;
/**
 * 归并排序
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

        //悬停2s后隐藏 hide this frame after 2s
        try {
            Thread.sleep(2000);
        } catch (Exception e) {}
//        super.jFrame.setVisible(false);
    }

    public void mergeSort(int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            // 左边
            mergeSort(low, mid);
            // 右边
            mergeSort(mid + 1, high);
            // 左右归并
            merge(low, mid, high);
        }
    }


    public void merge(int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;// 左指针
        int j = mid + 1;// 右指针
        int k = 0;
        // 把较小的数先移到新数组中
        while (i <= mid && j <= high) {
            if (array.get(i) < array.get(j)) {
                temp[k++] = array.get(i++);
            } else {
                temp[k++] = array.get(j++);
            }
        }
        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = array.get(i++);
        }
        // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = array.get(j++);
        }
        // 把新数组中的数覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            array.set(temp[k2], k2+low);

            try {
                Thread.sleep(10);
            } catch (Exception e) {}
            super.repaint();
        }

    }


    public void mergeSort() {
    }
}
