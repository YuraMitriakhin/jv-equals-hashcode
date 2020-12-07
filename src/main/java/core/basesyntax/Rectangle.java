package core.basesyntax;

import java.util.Objects;

public class Rectangle {
    private Integer width;
    private Integer length;
    private String color;

    public Rectangle(Integer width, Integer length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(width, rectangle.width)
                && Objects.equals(length, rectangle.length)
                && Objects.equals(color, rectangle.color);
    }

    @Override
    public int hashCode() {
        int results = 17;
        results = 31 * results + (width == null ? 0 : width.hashCode());
        results = 31 * results + (length == null ? 0 : length.hashCode());
        results = 31 * results + (color == null ? 0 : color.hashCode());
        return results;
    }
}
