package ch01.programming_exercises;

public class Ex0110 {
    public static void main(String[] args) {
        double runningDistanceInKilometers = 15;
        double timeInKilometers = 3030;
        double anHourInSeconds = 60*60;
        double runningDistanceInKilometersPerHour = (anHourInSeconds*runningDistanceInKilometers)/timeInKilometers;
        double milesPerHour = runningDistanceInKilometersPerHour/1.6;
        double runningDistanceInMiles = (milesPerHour*timeInKilometers)/anHourInSeconds;
        System.out.printf("""
                %-6s  %-10s  %-10s
                %-6s  %-10.2f  %-10.2f
                %-6s  %-10.2f  %-10.2f 
                ""","Time","Kilometers","Miles",timeInKilometers, runningDistanceInKilometers, runningDistanceInMiles  ,anHourInSeconds,runningDistanceInKilometersPerHour,milesPerHour);
    }
}
