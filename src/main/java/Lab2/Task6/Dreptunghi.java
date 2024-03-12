package Lab2.Task6;

class Dreptunghi extends Paralelogram {
    public Dreptunghi(int lungime, int latime) {
        super(lungime, latime, 90); // Unghiul de 90 de grade pentru dreptunghi
    }

    @Override
    public double arie() {
        return latura1 * latura2;
    }
}
