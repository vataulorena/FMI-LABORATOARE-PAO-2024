package Lab2.Task6;

class Paralelogram extends Patrulater {
    public Paralelogram(int latura1, int latura2, double unghi1) {
        super(latura1, latura2, latura1, latura2, unghi1, 0, 0, 0);
    }

    public double arie() {
        return latura1 * latura2 * Math.sin(Math.toRadians(unghi1));
    }
}
