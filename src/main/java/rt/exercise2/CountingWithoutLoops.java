package rt.exercise2;

public class CountingWithoutLoops {

    void countUp(int start, int end) {
        if (start <= end) {
            System.out.println(start);
            countUp(start + 1, end);
        }
    }

    void countUpAndDown(int start, int end) {
        System.out.println(start);
        if (end == start)
            return;

        countUpAndDown(start + 1, end);

        System.out.println(start);

    }

    public static void main(String[] args) {
        CountingWithoutLoops countingWithoutLoops = new CountingWithoutLoops();
        System.out.println("Count up:");
        countingWithoutLoops.countUp(0, 5);

        System.out.println("Count up and down:");
        countingWithoutLoops.countUpAndDown(0, 5);
    }
}
