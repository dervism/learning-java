package no.dervis.learningjava.labs.basics.objects;

public class Objects {

    public static void main(String[] args) {
        Objects o = new Objects();
        o.printShapes();
        o.printEquipments();
    }


    public void printShapes() {
        handleShapes(new Rectangle());
        handleShapes(new Circle());
    }

    /**
     * Uses polymorphism to handle all type of shapes.
     */
    public void handleShapes(Shape shape) {
        System.out.println("This is a " + shape.draw());

        if (shape instanceof RectangleCalculator) {
            System.out.println(
                    ((RectangleCalculator) shape).calculateSizeOfRectangle());
        }
    }


    public void printEquipments() {
        handleEquipments(new Tent());
        handleEquipments(new Circle());
    }


    /**
     * Uses polymorphism to handle all type of equipmentss.
     */
    public void handleEquipments(Equipment part) {
        System.out.println(part.equipmentName());
    }


}
