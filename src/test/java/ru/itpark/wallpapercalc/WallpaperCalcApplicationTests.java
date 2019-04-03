package ru.itpark.wallpapercalc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.itpark.wallpapercalc.service.WallpaperCalcService;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WallpaperCalcApplicationTests {

    @Test
    public void contextLoads() {
        WallpaperCalcService service = new WallpaperCalcService();
        int result = (int)service.calculate(3.59, 9.83, 4.35);
        assertEquals(14,result);
    }

}
