/**
 * Created by luisgarcia on 5/22/17.
 */
public class Euro extends Currency
{
    final double rate = .94;

    public double getRate()
    {
        return rate;
    }

    public char symbol()
    {
        char symbol = '\u20AC';
        return symbol;
    }

}