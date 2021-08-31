package ex3;

public class Number {
    public String monthOfYear(int month, int year) {
        String result = "";
        for (int i = 1; i < month; i++) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    result = 31 + " day ";
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    result = 30 + " day  ";
                    break;
                case 2:
                    result += month % 4 == 0 ? 29 : 28+" day";
                    break;
                default:
                    break;

            }
        }
        return  result;
    }
}
