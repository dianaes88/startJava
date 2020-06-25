public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger ("Striker Eureka" ,"Mark-5", "Australia", "gray",
                                        1.850f, 76.2f, 10, 9, 11, true);
        System.out.println(jaeger1.toString());

        Jaeger jaeger2 = new Jaeger();
        jaeger2.setModel("Gipsy Danger");
        jaeger2.setMark("Mark-3");
        jaeger2.setOrigin("USA");
        jaeger2.setColor("blue");
        jaeger2.setWeight(1.980f);
        jaeger2.setHeight(79.25f);
        jaeger2.setSpeed(7);
        jaeger2.setArmour(6);
        jaeger2.setNumKaijuKilled(9);
        jaeger2.setIsDestroyed(true);
        System.out.println(jaeger2.toString());

        jaeger1.setModel("Coyote Tango");
        System.out.println(jaeger1.toString());

        jaeger2.setIsDestroyed(false);
        System.out.println(jaeger2.toString());

        jaeger1.move(35,18);
        jaeger2.attackKaiju();
        jaeger1.useWeapon();
        jaeger2.kick();
        jaeger1.jump();
        jaeger2.avaidAttack();
    }
}
