public enum Season {
    Winter("Белый"),
    Spring("Зеленый"),
    Summer("Крансый"),
    autumn("Желтый");

    private String Color;

    public String getColor() {
        return Color;
    }

    Season(String Color) {
        this.Color = Color;
    }
}
