import org.example.Apdex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApdexTest {

    private Apdex apdex;

    @BeforeEach
    public void arrage(){
        this.apdex = new Apdex();
    }

    @Test
    public void validarApdexExelente(){
        //arrage
        //Apdex apdex = new Apdex();
        //act
        float result = apdex.calcular(90,10, 100);
        //assert
        assertEquals(0.95, result, 0.01);
    }

}
