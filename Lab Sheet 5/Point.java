class Point
{
    protected int x;
    protected int y;

    public Point(int x, int y)
    {
        setPoint(x, y);
    }

    public void setPoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return(x);
    }

    public int getY()
    {
        return(y);
    }

    public String toString()
    {
        return("x = ".concat(String.valueOf(x)).concat(",   y = ").concat(String.valueOf(y)));
    }
}

class Circle extends Point
{
    protected int radius;
    

    public Circle(int x, int y, int radius)
    {
        super(x, y);
        this.radius = radius;
    }

    public void setCircle(int x, int y, int radius)
    {
        setPoint(x, y);
        this.radius = radius;
    }

    public int getradius()
    {
        return(radius);
    }

    public String toString()
    {
        return("x = ".concat(String.valueOf(x)).concat(",   y = ").concat(String.valueOf(y)).concat(",   radius = ").concat(String.valueOf(radius)));
    }

    
}