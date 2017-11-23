package szestkam;

final class  Color {
    private ColorCode cCode;
    private double alpha;

    Color(ColorCode cCode, double alpha) {
        this.cCode = cCode;
        this.alpha = alpha;
    }

    Color updateCodeColor(ColorCode newCode) {
        return new Color(newCode, this.alpha);
    }

    Color getColor(){
        return new Color(this.cCode,this.alpha);
    }

    @Override
    public boolean equals(Object obj) {
        if (!obj.getClass().isAssignableFrom(Color.class)) {
            return false;
        }

        Color otherColor = (Color) obj;

        return this.cCode == otherColor.cCode && this.alpha == otherColor.alpha;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result *= cCode.hashCode();
        result *= alpha;
        return result;
    }

    @Override
    public String toString() {
        return "Color code: " + this.cCode + " with alpha: " + this.alpha;
    }
}
