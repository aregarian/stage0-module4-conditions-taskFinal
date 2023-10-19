package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        int hehe;
        if (firstSide + secondSide <= thirdSide || firstSide + thirdSide <= secondSide || secondSide + thirdSide <= firstSide) {
            hehe = 0;
        } else {
          hehe = 1;
        }
        switch (hehe) {
            case (1):
                System.out.println("this is a valid triangle");
                break;
            default:
                System.out.println("it's not a triangle");
        }

    }
}
