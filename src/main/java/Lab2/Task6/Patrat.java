package Lab2.Task6;

class Patrat extends Dreptunghi {
    public Patrat(int latura) {
        super(latura, latura);
    }

    @Override
    public double arie() {
        return Math.pow(latura1, 2);
    }
}
