package szestkam;

import java.util.HashMap;

/**
 * Below code is to consider about Marcus Biel presentation
 * available on YT: https://youtu.be/ffMA1t9OiNs?t=596
 */
class Main {

    private static ColorCode redReference;

    public static void main(String[] args) {
        HashMap<ColorCode, Color> colors = new HashMap<>();

        Color colorRed = new Color(ColorCode.RED,0.2);
        Color colorBlack = new Color(ColorCode.BLACK, 0.9);
        Color colorWhite = new Color(ColorCode.WHITE,0.7);
        Color colorBlue = new Color(ColorCode.BLUE,0.8);

        redReference = ColorCode.RED;
        colors.put(redReference,colorRed);
        colors.put(ColorCode.BLACK, colorBlack);
        colors.put(ColorCode.WHITE,colorWhite);
        colors.put(ColorCode.BLUE, colorBlue);

        redReference = ColorCode.BLUE;

        System.out.println("HashMap size: " + colors.size());
        System.out.println("Key <BLACK>: " + colors.get(ColorCode.BLACK));
        System.out.println("Key <WHITE>: " + colors.get(ColorCode.WHITE));
        System.out.println("Key <BLUE>: " + colors.get(ColorCode.BLUE));

        //in this place I was expected that return BLUE color object from hash map
        System.out.println("Key <redReference>: " + colors.get(redReference));
        //but I'm surprised that return RED because I earlier changed key reference
        System.out.println("Key <RED>: " + colors.get(ColorCode.RED));
        //in this way I understood your presentation where were elephant and hippo
    }
}
