package ex2;

public class Password {
    public String password(String str) {
        String result = "";
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{10,}$";
        char[] input = str.toCharArray();
        if (str.matches(regex)) {
            result = "Mật khẩu mạnh";

        } else if (str.length() < 10) {
            result = "Mật Khẩu yếu";

        } else {
            result = "error";
        }
        return  result;

    }
}
