package school.mjc.stage0.loops.task5;

public class Square {

    public void printSquareFrom8s(int sideLength) {
        if (sideLength <= 0) {
            return;
        }

        for (int i = 0; i < sideLength; i++) {
            StringBuilder builder = new StringBuilder();
            if (i == 0 || i == sideLength - 1) {
                builder.append(String.valueOf(8).repeat(sideLength));
            } else {
                for (int j = 0; j < sideLength; j++) {
                    if (j == 0 || j == sideLength - 1) {
                        builder.append(8);
                    } else {
                        builder.append(" ");
                    }
                }
            }
            System.out.println(builder.toString());
        }
    }
}
