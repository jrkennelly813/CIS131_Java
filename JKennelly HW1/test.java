package src;

public class test {
/*

Sample Test Plan for a Program that Calculates The Cost of a Stay in a Parking Garage

Program input:
    Day of the Week (in the format "MON,TUE,WED,THU,FRI,SAT,SUN")
    Vehicles arrival time (24-Hour Format)
    Vehicles departure time (24-Hour Format)

Calculated intermediate values
    conversion of arrival time in minutes
        arival = (Time % 100) + (Time / 100) * 60;
    conversion of departure time in minutes
        departure = (departTime % 100) + (departTime / 100) * 60;
    calculation of stay duration time in minutes
        durration = departure - arrival;
    calculation of the number of 15 min intervals of duration
        numOfIntervals = durTime / 15

Program output:
    Day of the Week
    Parking Duration
    Rate
    Amount Charged

Validation rules:
    Duration cannot be less than zero.
    If the number of intervals results in a remainder the interval needs to be incremented.
    The amount charged cannot exceed $15.00

Calculation of results: 
    parkCharge = (numOfIntervals * rate)

Test Cases

M - F 745 1000 465 600 135 9 1.25 11.25 15 11.25

M - F 700 1200 420 720 300 20 1.25 25 15 15

M - F 1130 1600 690 960 270 18 1.25 22.5 15 15

M - F 1305 1500 785 900 115 8 1.25 10 15 10

M - F 1420 1500 860 900 40 3 1.25 3.75 15 3.75

M - F 750 1715 470 1035 565 38 1.25 47.5 15 15

M - F 1730 1900 1050 1140 90 6 1.25 7.5 15 7.5

M - F 1755 1905 1075 1145 70 5 1.25 6.25 15 6.25

S & S 1400 1920 840 1160 320 22 0.5 11 15 11

S & S 940 1425 580 865 285 19 0.5 9.5 15 9.5

*/
}
