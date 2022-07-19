public class Main {

    public static void main(String[] args) {

    BmiService service = new BmiService();
     double weight = 52;
     double hight = 1.56;
     double BMI = service.calculate(weight, hight);

        System.out.println("Иедкс массы тела:" + BMI);
    }
}
