public class Thing implements Comparable<Thing>
{
    private int value;
    public Thing()
    {
        this.value = (int) (Math.random()*10000);
    }
   @Override
    public int compareTo(Thing Things)
    {
        return this.value - Things.value;
    }
}
