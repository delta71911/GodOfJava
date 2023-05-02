package Chapter_06;

public class ControlLabel {
    public static void main(String[] args) {
        ControlLabel control = new ControlLabel();
        control.printTimesTable();
    }
    public void printTimesTable() {
        startLabel:
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j == 4) continue startLabel;
                System.out.println(i + "*" + j + "=" + (i * j));
            }
            System.out.println();
        }
    }
}
