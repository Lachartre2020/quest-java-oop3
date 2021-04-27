public class Nature {

    public static void main(String[] args) {

        Penguin pingou = new Penguin("Pingou");
        pingou.dive();
        pingou.swimDown(400);
        pingou.swimUp(1);
        pingou.swimDown(4);
        pingou.swimUp(5);
        pingou.swimUp(1);
        pingou.getOut();

        Eagle hawkeye = new Eagle("Hawkeye");
        // TODO : uncomment the following code in order to test it
        
        hawkeye.takeOff();
        hawkeye.ascend(120);
        hawkeye.ascend(10);
        hawkeye.glide();
        hawkeye.descend(20);
        hawkeye.land();
        hawkeye.descend(109);
        hawkeye.land();
   }
}
