package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int eightLength = 8;

        int middleNum = (int) Math.ceil(sideLength / (double) 2);

        for (int i = 1; i <= sideLength; i++) {
            StringBuilder crossString = new StringBuilder();
            if (i == middleNum) {
                crossString.append(String.valueOf(eightLength).repeat(sideLength));
            } else {
                for (int j = 1; j <= sideLength; j++) {
                    if (j == middleNum) {
                        crossString.append(eightLength);
                    } else {
                        crossString.append(" ");
                    }
                }
            }
            System.out.println(crossString);
        }
    }
}
