package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height <= 1) {
            return;
        }
        int middle = (int) Math.ceil(height / (double) 2);

        for (int i = 0; i < height; i++) {
            StringBuilder builder = new StringBuilder();
            if (i == 0) {
                builder.append(String.valueOf(8).repeat(height));
            } else {
                if (i < middle) {
                    builder.append(" ".repeat(i)).append("8".repeat(height - (i + i))).append(" ".repeat(i));
                } else {
                    break;
                }
            }
            System.out.println(builder.toString());
        }

        for (int i = middle - 1; i >= 0; i--) {
            StringBuilder builder = new StringBuilder();
            if (i == 0) {
                builder.append(String.valueOf(8).repeat(height));
            } else {
                if (i == middle - 1 && height % 2 != 0) {
                    continue;
                }
                builder.append(" ".repeat(i)).append("8".repeat(height - (i + i))).append(" ".repeat(i));
            }
            System.out.println(builder.toString());
        }


    }
}
