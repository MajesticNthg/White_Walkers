public class Level1 {
    public static boolean white_walkers(String village) {
        String copy = new String(village);
        copy = copy.replaceAll("[^=0-9]", "");
        int flag = 0;

        for (int x = 0; x < copy.length(); x++) {
            if (copy.charAt(x) != '=') {
                flag = calculation(copy, x, flag);
            }
            if (flag == 2) return false;
        }

        if (flag == 1) return true;
        return false;
    }
    public static int calculation (String copy, int x, int flag) {
        int start = Character.getNumericValue(copy.charAt(x));
        int end = 0;
        int amt = 0;

        for (int i = x + 1; i < copy.length(); i++) {
            if (copy.charAt(i) == '=') amt++;
            if (copy.charAt(i) != '=') {
                end = Character.getNumericValue(copy.charAt(i));
                break;
            }
        }

        if (start + end == 10 && amt == 3) flag = 1;
        if (start + end == 10 && amt != 3) flag = 2;
        return flag;
    }
}

