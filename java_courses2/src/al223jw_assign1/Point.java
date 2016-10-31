package al223jw_assign1;

public class Point {

    int x = 0;
    int y = 0;

    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int GetX()
    {
        return x;
    }

    public int GetY()
    {
        return y;
    }

    public String toString()
    {
        return "(" + this.x + ", " + this.y + ")";
    }

    public void move (int x, int y)
    {
        this.x += x;
        this.y += y;
    }

    public void moveToXY (int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point p2)
    {
        return Math.sqrt(Math.pow((p2.GetX() - x), 2) + Math.pow((p2.GetY() - y), 2));
    }

    public boolean isEqualTo(Point p2)
    {
        boolean value;

        int x1 = p2.GetX();
        int y1 = p2.GetY();

        if(this.x == x1 && this.y == y1 )
        {
            value = true;
        }
        else
        {
            value = false;
        }
        return value;
    }
}
