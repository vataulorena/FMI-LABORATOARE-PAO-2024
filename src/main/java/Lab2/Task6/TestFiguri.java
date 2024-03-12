package Lab2.Task6;

public class TestFiguri {
    public static void main(String[] args) {
        Paralelogram paralelogram = new Paralelogram(10, 20, 30);
        Romb romb = new Romb(10, 14, 48);
        Dreptunghi dreptunghi = new Dreptunghi(10, 20);
        Patrat patrat = new Patrat(10);

        System.out.println("Aria Paralelogram: " + paralelogram.arie());
        System.out.println("Aria Romb: " + romb.arie());
        System.out.println("Aria Dreptunghi: " + dreptunghi.arie());
        System.out.println("Aria Patrat: " + patrat.arie());
    }
}
