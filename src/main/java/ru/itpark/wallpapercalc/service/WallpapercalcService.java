package ru.itpark.wallpapercalc.service;

import org.springframework.stereotype.Service;

@Service
public class WallpapercalcService {

    public  double calculate (double roomHeight, double roomLength, double roomWidth) {

        double roomPerimeter = 2 * (roomLength + roomWidth);

        double wallpaperWidth = 1.06;
        int wallpaperLendth = 10;

        int canvasQuantity = (int)(roomPerimeter / wallpaperWidth) + 1;
        int canvasInRoll = (int) (wallpaperLendth / (roomHeight + 0.1));

        int result = (canvasQuantity + (canvasInRoll - 1)) / canvasInRoll;
        return result;
    }
}
