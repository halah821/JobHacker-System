package Task3.ch11;

public abstract class GeometricObject {
    String color;
    Boolean isFilled;

    public GeometricObject() {
        this.color = "BLACK";
        this.isFilled = true;
    }
    public GeometricObject(String color, Boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return isFilled;
    }

    public void setFilled(Boolean filled) {
        isFilled = filled;
    }

    public  String toString(){
        return "GeometricObject : " + color + " isFilled = " + isFilled ;
    }
}
