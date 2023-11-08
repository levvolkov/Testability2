public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 90;//вес кг.
        double height = 1.87;//рост метра
        int index;
        index = service.calculate(weight, height);
        System.out.println(index + " body mass index ");
    }
}
