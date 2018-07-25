public class Sedan extends Cars {

    private int doors;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }


//    @Override
//    public String toString() {
//        return "The" +
//                " " + color +
//                 company +
//
//                this.start();
//    }

    @Override
    public String start() {
        return "The" + " " +   " " + super.getCompany() + " " + "is starting";
    }
    @Override
    public String accelerate() {
        return "The" + " " + super.getColor() + " " + super.getCompany() + " " + "is accelerating";
    }
    @Override
    public String stop() {
        return "The" +  " " + super.getColor() + " " + super.getCompany() + " " + "is stopped to have its emissions checked" + "\n" + "The " + super.getColor() + " " + super.getCompany() +" " + "passes its emission test";
    }
    @Override
    public String stopped() {
        return "The" +  " " + super.getColor() + " " + super.getCompany() + " " + "is stopped to have its emissions checked" + "\n" + "The " + super.getColor() + " " + super.getCompany() +" " + "passes its emission test";
    }
    @Override
    public String speed() {
        return "The" +  " " + super.getColor() + " " + super.getCompany() + " " + "is going" + " " + super.getSpeed();
    }


}
