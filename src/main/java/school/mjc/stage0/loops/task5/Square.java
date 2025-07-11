package school.mjc.stage0.loops.task5;

public class Square {

    public void printSquareFrom8s(int sideLength){
        int eight = 8;

        StringBuilder mainString = new StringBuilder();
        StringBuilder otherString = new StringBuilder();

        mainString.append(String.valueOf(eight).repeat(sideLength));

        for (int i = 0; i < sideLength; i++) {
            if (i == 0 || i == sideLength - 1) {
                otherString.append(eight);
            } else {
                otherString.append(" ");
            }
        }

        for (int i = 0; i < sideLength; i++) {
            if (i == 0 || i == sideLength - 1) {
                System.out.println(mainString);
            } else {
                System.out.println(otherString);
            }
        }
    }
}
