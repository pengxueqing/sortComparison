package sqs_javaPractice_visibleSort;
/**
 * Ñ¡ÔñÅÅÐò
 * */
public class SelectSort extends VisibleSort implements Sort,Runnable{

    Thread thread;

    SelectSort(){
        thread = new Thread(this);
//        thread.start();
    }


    @Override
    public void run() {
        while(true) {
            try {
                startSort();
            } catch (Exception e) {}
        }
    }
    @Override
    public void startSort() {
        try {
            Thread.sleep(500);
        } catch (Exception e) {}
        for (int i = 0; i < 100; i++) {
            for(int j = i+1; j < 100; j++){
                if (array.get(i) > array.get(j)){
                    int temp = array.get(i);
                    array.set(array.get(j), i);
                    array.set(temp, j);
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {}
                    super.repaint();
                }


            }



        }

        //ÐüÍ£2sºóÒþ²Ø hide this frame after 2s
        try {
            Thread.sleep(2000);
        } catch (Exception e) {}
//        super.jFrame.setVisible(false);
    }
}
