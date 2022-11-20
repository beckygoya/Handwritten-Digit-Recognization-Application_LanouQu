import java.io.*;

abstract class Shape implements java.io.Serializable {

    public abstract String getName();

    public abstract void calculateArea();

    public abstract void calculatePerimeter();

}
