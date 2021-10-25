public class Rectangle {
    double length = 1;
    double width = 1;

    public void setLength(double length)
    {
        //cant draw half an "*" for Q3 so i dont allow decimals
        if (length <= 40 && length > 10 && length % 1 == 0)
        {
            this.length = length;
        }
        else
        {
            System.out.println("illegal exception, please try again.");
        }
    }

    public void setWidth(double width)
    {
        if ((width <= 40 && width > 10) && width % 1 == 0)
        {
            this.width = width;
        }
        else
        {
            System.out.println("illegal exception, please try again.");
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

    public String toString()
    {
        String s = "";
        s = s.concat("Length = ").concat(Double.toString(length)).concat(", Width = ").concat(Double.toString(width));
        return(s);
    }
    public double getArea()
    {
        double area = length * width;
        return(area);
    }

    public double getPerimiter()
    {
        double perimiter = (2*length) + (2*width);
        return(perimiter);
    }

    public void printRectangle()
    {
        int l = (int)length;
        int w = (int)width;
        for(int i = 0; i < l; i++)
        {
            for(int j = 0; j < w; j++)
            {
                if(i == 0 || i == l - 1)
                {
                    System.out.print("*");
                }
                else
                {
                    if(j == 0 || j == w - 1)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
