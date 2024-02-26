package tse.lawrence.sudoku.components;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import tse.lawrence.sudoku.utils.StyleUtils;

public class Cell extends StackPane
{
    private final IntegerProperty digit = new SimpleIntegerProperty(0);
    private final IntegerProperty row = new SimpleIntegerProperty(0);
    private final IntegerProperty column = new SimpleIntegerProperty(0);

    public Cell()
    {
        initLayout();
        initComponents();
    }

    public IntegerProperty digitProperty()
    {
        return digit;
    }

    public IntegerProperty rowProperty()
    {
        return row;
    }

    public IntegerProperty columnProperty()
    {
        return column;
    }

    private void initLayout()
    {
        StyleUtils.setBackground(this, Color.WHITE);
        StyleUtils.setBorder(this, BorderWidths.DEFAULT);
    }

    private void initComponents()
    {
        setOnMouseClicked(event -> System.out.printf("%s, %s\n", getWidth(), getHeight()));
    }
}
