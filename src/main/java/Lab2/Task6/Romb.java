package Lab2.Task6;

class Romb extends Paralelogram {
    private int diag1, diag2;

    public Romb(int latura, int diag1, int diag2) {
        super(latura, latura, 0);
        this.diag1 = diag1;
        this.diag2 = diag2;
    }

    public double arie() {
        return (diag1 * diag2) / 2.0;
    }
}
