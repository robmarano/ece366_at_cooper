package edu.cooper.ece366.tutorials;

/**
 * Hello world!
 *
 */
public class App
{
    protected int appField;

    public int getAppField() {
        return this.appField;
    }

    protected void setAppField(int x) {
        this.appField = x;
    }

    public App(int x) {
        this.setAppField(x);
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
