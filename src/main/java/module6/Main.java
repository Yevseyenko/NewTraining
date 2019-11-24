package module6;

public class Main {
    public static void main(String[] args) {
        BusinessTaskUpdateCustomerAge task1 =
                new BusinessTaskUpdateCustomerAge();

        BusinessTaskUpdateCustomerAge task2 =
                new BusinessTaskUpdateCustomerAge();
//
//        task1.start();
//        task2.start();
//
//        task2.updateStateInDB();
//        task2.run();
//Runnable task = new Runnable() {
//    @Override
//    public void run() {
//new BusinessTaskUpdateCustomerAge().updateStateInDB();
//try{
//Thread.
//}catch (InterruptedException e){
//    e.printStackTrace();
//}
//    }
//};

    }
    private static void executeTask(Runnable threadLogic){
        new Thread(threadLogic).start();
    }
}
