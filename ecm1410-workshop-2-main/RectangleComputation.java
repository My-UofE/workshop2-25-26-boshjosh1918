public class RectangleComputation {
    public static void main(String[] args) {
        float height = Integer.parseInt(args[0]);
        float width = Integer.parseInt(args[1]);

        Boolean isSquare = Math.abs(1 - height/width) < 0.01;
        String shape = (isSquare) ? "square" : "rectangle";

        System.out.println("shape: " + shape);
        System.out.println("area: " + width * height);
        System.out.println("perimiter: " + 2*(width+height));
    }
}
