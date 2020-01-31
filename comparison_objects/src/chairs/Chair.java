package chairs;

public class Chair implements Comparable
{
    private int numLegs;
    private String material;
    private boolean backRest;
    private String color;
    private double price;

    public Chair(int numLegs, String material, boolean backRest,
                 String color, double price)
    {
        this.numLegs = numLegs;
        this.material = material;
        this.backRest = backRest;
        this.color = color;
        this.price = price;
    }

    @Override
    public int compareTo(Object other)
    {
        if (other instanceof Chair)
        {
            Chair otherChair = (Chair)other;

            return material.compareTo(otherChair.material);
        }
        throw new IllegalArgumentException("Cannot compare chairs with non-chairs");
    }

    public int getNumLegs()
    {
        return numLegs;
    }

    public String getMaterial()
    {
        return material;
    }

    public boolean isBackRest()
    {
        return backRest;
    }

    public String getColor()
    {
        return color;
    }

    public double getPrice()
    {
        return price;
    }

    @Override
    public String toString()
    {
        return "Chair{" +
                "numLegs=" + numLegs +
                ", material='" + material + '\'' +
                ", backRest=" + backRest +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
