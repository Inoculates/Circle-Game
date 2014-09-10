package com.example.android.circlegame;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.LruCache;

public class BitmapManager {

    private int canvasHeight = 50;
    private int canvasWidth = 50;
    private final LruCache<String, Bitmap> cache;
    private final Resources res;

    public static Bitmap red;
    public static Bitmap blue;
    public static Bitmap black;
    public static Bitmap darkgreen;
    public static Bitmap gray;
    public static Bitmap lavender;
    public static Bitmap magenta;
    public static Bitmap maroon;
    public static Bitmap midnight;
    public static Bitmap orange;
    public static Bitmap olive;
    public static Bitmap plum;
    public static Bitmap purple;
    public static Bitmap seafoam;
    public static Bitmap teal;
    public static Bitmap turquoise;
    public static Bitmap yellow;
    public static Bitmap white;


    public BitmapManager(Context context, double width, double height) {
        int memorySize = (int) Runtime.getRuntime().maxMemory();
        int cacheSize = memorySize / 4;
        res = context.getResources();
        canvasWidth = (int) width;
        canvasHeight = (int) height;
        BitmapFactory.Options opt = new BitmapFactory.Options();
        opt.inMutable = true;

        cache = new LruCache<String, Bitmap>((int) (cacheSize)) {
            @Override
            protected int sizeOf(String key, Bitmap bitmap) {
                return bitmap.getByteCount() / 1024;
            }
        };
        red = BitmapFactory.decodeResource(res, R.drawable.red_circle, opt);
        blue = BitmapFactory.decodeResource(res, R.drawable.blue_circle, opt);
        black = BitmapFactory.decodeResource(res, R.drawable.black_circle, opt);
        darkgreen = BitmapFactory.decodeResource(res, R.drawable.dark_green_circle, opt);
        gray = BitmapFactory.decodeResource(res, R.drawable.gray_circle, opt);
        lavender = BitmapFactory.decodeResource(res, R.drawable.lavender_circle, opt);
        magenta = BitmapFactory.decodeResource(res, R.drawable.magenta_circle, opt);
        maroon = BitmapFactory.decodeResource(res, R.drawable.maroon_circle, opt);
        midnight = BitmapFactory.decodeResource(res, R.drawable.midnight_circle, opt);
        orange = BitmapFactory.decodeResource(res, R.drawable.orange_circle, opt);
        plum = BitmapFactory.decodeResource(res, R.drawable.plum_circle, opt);
        purple = BitmapFactory.decodeResource(res, R.drawable.purple_circle, opt);
        seafoam = BitmapFactory.decodeResource(res, R.drawable.sea_foam_circle, opt);
        teal = BitmapFactory.decodeResource(res, R.drawable.teal_circle, opt);
        turquoise = BitmapFactory.decodeResource(res, R.drawable.turquoise_circle, opt);
        yellow = BitmapFactory.decodeResource(res, R.drawable.yellow_circle, opt);
        white = BitmapFactory.decodeResource(res, R.drawable.white_circle, opt);
        olive = BitmapFactory.decodeResource(res, R.drawable.olive_circle, opt);

    }

    public void setTitleScreen() {
        cleanLists();
        addBitmapToMemoryCache((0), Bitmap.createScaledBitmap(BitmapFactory.decodeResource(res, R.drawable.titlescreen), canvasWidth, canvasHeight, true));
    }

    private void setABackground(int i)
    {
        cleanLists();
        switch (i)
        {
            case 0:
                addBitmapToMemoryCache((0), Bitmap.createScaledBitmap(BitmapFactory.decodeResource(res, R.drawable.background1), canvasWidth, canvasHeight, true));
                break;
            case 1:
                addBitmapToMemoryCache((0), Bitmap.createScaledBitmap(BitmapFactory.decodeResource(res, R.drawable.background2), canvasWidth, canvasHeight, true));
                break;
            case 2:
                addBitmapToMemoryCache((0), Bitmap.createScaledBitmap(BitmapFactory.decodeResource(res, R.drawable.background3), canvasWidth, canvasHeight, true));
                break;
            case 3:
                addBitmapToMemoryCache((0), Bitmap.createScaledBitmap(BitmapFactory.decodeResource(res, R.drawable.background4), canvasWidth, canvasHeight, true));
                break;
            case 4:
                addBitmapToMemoryCache((0), Bitmap.createScaledBitmap(BitmapFactory.decodeResource(res, R.drawable.background5), canvasWidth, canvasHeight, true));
                break;
            case 5:
                addBitmapToMemoryCache((0), Bitmap.createScaledBitmap(BitmapFactory.decodeResource(res, R.drawable.background6), canvasWidth, canvasHeight, true));
                break;
            case 6:
                addBitmapToMemoryCache((0), Bitmap.createScaledBitmap(BitmapFactory.decodeResource(res, R.drawable.background7), canvasWidth, canvasHeight, true));
                break;
            case 7:
                addBitmapToMemoryCache((0), Bitmap.createScaledBitmap(BitmapFactory.decodeResource(res, R.drawable.background8), canvasWidth, canvasHeight, true));
                break;
            case 8:
                addBitmapToMemoryCache((0), Bitmap.createScaledBitmap(BitmapFactory.decodeResource(res, R.drawable.background9), canvasWidth, canvasHeight, true));
                break;
            case 9:
                addBitmapToMemoryCache((0), Bitmap.createScaledBitmap(BitmapFactory.decodeResource(res, R.drawable.background10), canvasWidth, canvasHeight, true));
                break;
        }
    }

    private void setACircle(int i)
    {
        cleanLists();
        switch (i)
        {
            case 0:
                addBitmapToMemoryCache((0), red);
                break;
            case 1:
                addBitmapToMemoryCache((0), blue);
                break;
            case 2:
                addBitmapToMemoryCache((0), black);
                break;
            case 3:
                addBitmapToMemoryCache((0), darkgreen);
                break;
            case 4:
                addBitmapToMemoryCache((0), gray);
                break;
            case 5:
                addBitmapToMemoryCache((0), lavender);
                break;
            case 6:
                addBitmapToMemoryCache((0), magenta);
                break;
            case 7:
                addBitmapToMemoryCache((0), maroon);
                break;
            case 8:
                addBitmapToMemoryCache((0), midnight);
                break;
            case 9:
                addBitmapToMemoryCache((0), orange);
                break;
            case 10:
                addBitmapToMemoryCache((0), plum);
                break;
            case 11:
                addBitmapToMemoryCache((0), purple);
                break;
            case 12:
                addBitmapToMemoryCache((0), seafoam);
                break;
            case 13:
                addBitmapToMemoryCache((0), teal);
                break;
            case 14:
                addBitmapToMemoryCache((0), turquoise);
                break;
            case 15:
                addBitmapToMemoryCache((0), white);
                break;
            case 16:
                addBitmapToMemoryCache((0), yellow);
                break;
            case 17:
                addBitmapToMemoryCache((0), olive);
                break;
        }
    }

    public Bitmap getTitleScreen() {
        setTitleScreen();
        return getBitmap(0);
    }

    public Bitmap getBackground() {
        int random = (int) (Math.random() * 10);
        setABackground(random);
        return getBitmap(0);
    }

    public Bitmap getCircle() {
        int random = (int) (Math.random() * 18);
        setACircle(random);
        return getBitmap(0);
    }

    private void cleanLists() {
        removeBitmap(0);
    }

    private void addBitmapToMemoryCache(int key, Bitmap bitmap) {
        cache.put(Integer.toString(key), bitmap);
    }

    private void removeBitmap(int key) {
        cache.remove(Integer.toString(key));
    }

    private Bitmap getBitmap(int key) {
        return cache.get(Integer.toString(key));
    }




}


