package behave.behavetask1;

public class BehaveTask1 {

    public static void main(String[] args) {
        for (int i : new Randoms(70, 100)) {
            System.out.println("Случайное число: " + i);
            if (i == 100) {
                System.out.println("Все. Сматываем удочки.");
                break;
            }
        }
    }
}
