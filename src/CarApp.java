public class CarApp {
    public static void main(String[] args){

        Sedan a = new Sedan();
       a.setColor("red");
        a.setCompany("Porsche");
        a.setSpeed(50);

        Sedan b = new Sedan();
        b.setColor("blue");
        b.setCompany("Jetta");
        b.setSpeed(90);

        System.out.println(a.start());
        System.out.println(a.accelerate());
        System.out.println(a.speed());
        System.out.println(a.stopped());
        System.out.println("\n");


        System.out.println(a.start());
        System.out.println(b.start());
        System.out.println(a.accelerate());
        System.out.println(a.accelerate());
        System.out.println(b.stop());
        System.out.println(a.speed());
        System.out.println(a.stopped());
       System.out.println("The " + b.getColor() + " " + b.getCompany() + " just passed the " + a.getColor() + " " + a.getCompany());


    }
}
