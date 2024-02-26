package tse.lawrence.sudoku.utils;

import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class StyleUtils
{
    public static void setBackground(Region region, Color color)
    {
        region.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
    }

    public static void setBackground(Region region, Color color, CornerRadii radii)
    {
        region.setBackground(new Background(new BackgroundFill(color, radii, Insets.EMPTY)));
    }

    public static void setBorder(Region region, BorderWidths widths)
    {
        region.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, widths)));
    }
}
