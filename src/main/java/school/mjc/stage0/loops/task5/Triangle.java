package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
       StringBuilder builder = new StringBuilder();
       builder.append(String.valueOf(" ").repeat(cathetusLength));

       for (int i = 0; i < cathetusLength; i++) {
           builder.setCharAt(i, '8');
           System.out.println(builder.toString());

       }

    }
}
