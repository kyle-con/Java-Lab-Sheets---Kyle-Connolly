public class Rectangle {
    double length;
    double width;

    public void setLength(double length)
    {
        boolean valid = false;
        while(valid == false)
        {
            if (length < 40 && length > 10)
            {
                this.length = length;
                valid = true;
            }
            else
            {
                System.out.println("illegal exception, please try again.");
            }
        }
    }

    public void setWidth(double width)
    {
        if (length < 40 && length > 10)
        {
        this.width = width;
        }
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }
}
