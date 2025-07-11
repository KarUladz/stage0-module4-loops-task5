package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height) {
        if (length <= 0 || height <= 0) {
            return;
        }

        for (int i = 0; i < height; i++) {
            StringBuilder builder = new StringBuilder();

            if (i == 0 || i == height - 1) {
                builder.append("8".repeat(length));
            } else {
                for (int j = 0; j < length; j++) {
                    if (j == 0 || j == length - 1) {
                        builder.append(8);
                    } else {
                        builder.append(" ");
                    }
                }
            }
            System.out.println(builder);
        }

    }
}
