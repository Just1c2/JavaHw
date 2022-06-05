package trainning.banksystem;

public class ValidateAccount {
    public final String MOBILE = "0904999999";
    public final String PASSWORD = "Ngo Van Khoai";
    public boolean checkAccount(String mobile, String password) {
        if (mobile.equals(MOBILE)) {
            if (password.equals(PASSWORD)) {
                System.out.println("Đăng nhập thành công");
                return true;
            } else {
                System.out.println("Mặt khẩu sai, vui lòng thử lại");
                return false;
            }
        } else {
            System.out.println("Kiểm tra lại số điện thoại hoặc mật khẩu");
            return false;
        }
    }
}
