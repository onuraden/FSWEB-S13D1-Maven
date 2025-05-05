package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(area(5.0, 4.0));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(isBarking) {
            if (clock < 0 || clock > 23) return false;
            return switch (clock) {
                case 0, 1, 2, 3, 4, 5, 6, 7, 20, 21, 22, 23 -> true;
                default -> false;
            };
        } else
            return false;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if(firstAge >= 13 && firstAge <= 19) {
            return true;
        } else if(secondAge >= 13 && secondAge <= 19) {
            return true;
        } else if(thirdAge >= 13 && thirdAge <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if(isSummer) {
            if(temp >= 25 && temp <=45) {
                return true;
            } else {
                return false;
            }
        } else {
            if(temp >= 25 && temp <=35) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static double area(double width, double height) {
        if(width > 0 && height > 0) {
            return width*height;
        } else {
            return -1;
        }
    }

    public static double area(double radius) {
        if(radius > 0) {
            return radius*radius*Math.PI;
        } else {
            return -1;
        }
    }
}
