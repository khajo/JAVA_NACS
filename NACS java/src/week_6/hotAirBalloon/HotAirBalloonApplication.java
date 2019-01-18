package week_6.hotAirBalloon;

public class HotAirBalloonApplication {
    public static void main(String[] args) {

        System.out.println("********** SmalBallon************");
        SmallHotAirBallon smallHotAirBallon = new SmallHotAirBallon();
        smallHotAirBallon.liftUp();
        smallHotAirBallon.land();

        System.out.println("*********** BigBallon**********");
        BigHotAirBallon bigHotAirBallon = new BigHotAirBallon();
        bigHotAirBallon.liftUp();
        bigHotAirBallon.land();

        System.out.println("****** samll**********");
        HotAirBalloon small = smallHotAirBallon;
        small.liftUp();
        small.land();

        System.out.println("*********** big *********");
        HotAirBalloon big = bigHotAirBallon;
        big.liftUp();
        big.land();
    }
}
