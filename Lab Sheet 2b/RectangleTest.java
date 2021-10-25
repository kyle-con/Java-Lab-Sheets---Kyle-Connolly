public class RectangleTest
{
    public static void main(String[] args)
    {
        Rectangle rectA = new Rectangle();

        rectA.setLength(15);
        rectA.setWidth(19);
        System.out.println(rectA.toString());
        System.out.println();
        System.out.println("Area = " + rectA.getArea());
        System.out.println("Perimiter = " + rectA.getPerimiter());
        System.out.println();
        rectA.printRectangle();

    }
}
