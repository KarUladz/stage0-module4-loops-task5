package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        if (sideLength <= 0) {
            return;
        }

        int middleNum = (int) Math.ceil(sideLength / (double) 2);

        for (int i = 1; i <= sideLength; i++) {
            StringBuilder crossString = new StringBuilder();
            if (i == middleNum) {
                crossString.append(String.valueOf(8).repeat(sideLength));
            } else {
                for (int j = 1; j <= sideLength; j++) {
                    if (j == middleNum) {
                        crossString.append(8);
                    } else {
                        crossString.append(" ");
                    }
                }
            }
            System.out.println(crossString);
        }
    }
}
