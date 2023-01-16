import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();

        int x = 100;
        int y = 9801;


        System.out.println(service.calcSqr(x, y));

    }
}
