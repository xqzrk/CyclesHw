import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/range.csv")
    public void testRange(int x, int y, int expected) {
        SQRService service = new SQRService();
        int actual = service.calcSqr(x, y);
        Assertions.assertEquals(expected, actual);
    }
}
