public class StringsBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // // char at index 0 -> charAt()
        // System.out.println(sb.charAt(0));

        // // set char at index 0 -> setCharAt(index, 'letter')
        // sb.setCharAt(0,'P');
        // System.out.println(sb);

        // // insert()
        // sb.insert(2, 'n');
        // System.out.println(sb);

        // // delete(start, end)
        // sb.delete(2,3);
        // System.out.println(sb);

        // // append()
        // sb.append(' ');
        // sb.append('S');
        // System.out.println(sb);

        // // length()
        // System.out.println(sb.length());

        // reverse a string
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
