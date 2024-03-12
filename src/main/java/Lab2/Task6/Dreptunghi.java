package Lab2.Task6;

class Dreptunghi extends Paralelogram {
    public Dreptunghi(int lungime, int latime) {
        super(lungime, latime, 90);
    }

    @Override
    public double arie() {
        return latura1 * latura2;
    }
}
