package tse.lawrence.sudoku.components;

import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import tse.lawrence.sudoku.configs.GUI;
import tse.lawrence.sudoku.utils.LayoutUtils;

public class NumberButton extends Button
{
    private Background idle;
    private Background hovered;
    private Background pressed;

    public NumberButton(String text, Color normal)
    {
        super(text);
        initLayout();
        addEventListener();
        updateBackgroundColor(normal);
        setOnMousePressed(this::onMousePressed);
    }

    public void onMousePressed(MouseEvent event)
    {
        System.out.println(textProperty().get());
    }

    public void updateBackgroundColor(Color normal)
    {
        idle = LayoutUtils.getBackground(normal.brighter(), new CornerRadii(GUI.RADII), null);
        hovered = LayoutUtils.getBackground(normal, new CornerRadii(GUI.RADII), null);
        pressed = LayoutUtils.getBackground(normal.darker(), new CornerRadii(GUI.RADII), null);
        setBackground(idle);
    }

    private void initLayout()
    {
        setCursor(Cursor.HAND);
        setPrefSize(GUI.CELL_SIZE * 2, GUI.CELL_SIZE * 2);
        setFont(Font.font(GUI.FONT_SIZE * 2));
    }

    private void addEventListener()
    {
        pressedProperty().addListener(((observable, oldValue, isPressed) ->
                setBackground(isPressed ? pressed : isHover() ? hovered : idle)
        ));
        hoverProperty().addListener(((observable, oldValue, isHovered) ->
                setBackground(isPressed() ? pressed : isHovered ? hovered : idle)
        ));
    }
}
