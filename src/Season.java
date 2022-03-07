public enum Season {
    Winter("Белый","Зима"),
    Spring("Зеленый", "Весна"),
    Summer("Красный", "Лето"),
    Autumn("Желтый", "Осень");

    private final String Color;
    private final String nameSeason;

    public String getColor() {
        return Color;
    }

    public String getNameSeason() {
        return nameSeason;
    }

    Season(String Color,String nameSeason) {
        this.Color = Color;
        this.nameSeason=nameSeason;
    }
}
