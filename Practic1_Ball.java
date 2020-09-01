package ru.mirea;

public class Practic1_Ball {
    public static class Ball
    {
        private String sport_type;
        private int radius;
        Ball(String sport_type, int radius)
        {
            this.sport_type = sport_type;
            this.radius = radius;
        }
        public void ToString()
        {
            System.out.println(sport_type);
            System.out.println(radius);
        }


    }
    public static void main(String[] args)
    {
        Ball bl;
        bl = new Ball("Football", 11);
        bl.ToString();
    }
}