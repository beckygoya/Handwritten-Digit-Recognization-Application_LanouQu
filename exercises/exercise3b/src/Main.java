import java.io.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Rectangle(), new Square(), new Triangle()};

        for (Shape shape : shapes) {
            System.out.println("Serialization and Deserialization of " + shape.getName());
            String filename = shape.getName() + ".ser";

            // Serialization
            try {
                // Saving of object in a file
                FileOutputStream file = new FileOutputStream(filename);
                ObjectOutputStream out = new ObjectOutputStream(file);
                // Method for serialization of object
                out.writeObject(shape);

                out.close();
                file.close();

                System.out.println("Object has been serialized");
            } catch (IOException ex) {
                System.out.println("IOException is caught");
            }

            try {
                // Reading the object from a file
                FileInputStream file = new FileInputStream(filename);
                ObjectInputStream in = new ObjectInputStream(file);

                // Method for deserialization of object
                Shape myShape = (Shape) in.readObject();

                in.close();
                file.close();

                System.out.println("Object has been deserialized ");
                System.out.println("Name = " + myShape.getName());
            } catch (IOException ex) {
                System.out.println("IOException is caught");
            } catch (ClassNotFoundException ex) {
                System.out.println("ClassNotFoundException is caught");
            }

        }
    }
}
