package module6;

public class BusinessTaskUpdateCustomerAge extends  Thread implements  BusinessTask {

    @Override
    public  void updateStateInDB(){
    System.out.println("We are doing that");
}
}
