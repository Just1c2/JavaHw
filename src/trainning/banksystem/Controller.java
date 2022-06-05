package trainning.banksystem;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private static long balanceNumber = 1000000;
    List<TransactionHistory> listHistory = new ArrayList<TransactionHistory>();
    List<BeneficiaryNumList> listBene = new ArrayList<>();

    public long getBalanceNumber() {
        return balanceNumber;
    }

    public static long transfer(long money) {

        if (money < 50000) {
            System.out.println("Số tiền chuyển tối thiểu là ");
        } else if (money > balanceNumber) {
            System.out.println("Số dư trong tài khoản không đủ");
        } else {
            System.out.println("Chuyển thành công");
            balanceNumber = balanceNumber - money;
        }
        return balanceNumber;
    }

    public void actionTransfer() {
        System.out.println("Nhập số tài khoản thụ hưởng: ");
        String beneficiaryAccount = new Scanner(System.in).nextLine();
        System.out.println("Nhập tin nhắn muốn chuyển kèm: ");
        String description = new Scanner(System.in).nextLine();
        System.out.println("Nhập số tiền muốn chuyển: ");
        long money = new Scanner(System.in).nextInt();
        transfer(money);
        TransactionHistory t = new TransactionHistory(beneficiaryAccount, description, money);
        listHistory.add(t);
    }

    public void getHistory() {
        for (TransactionHistory s: listHistory) {
            s.printHistory();
        }
    }

    public void addBeNum() {
        System.out.println("ID của số tài khoản: ");
        int idBenefic = new Scanner(System.in).nextInt();
        System.out.println("Số tài khoản bạn muốn tạo: ");
        String beneficNum = new Scanner(System.in).nextLine();
        System.out.println("Tên chủ tài khoản: ");
        String beneficName = new Scanner(System.in).nextLine();
        BeneficiaryNumList b = new BeneficiaryNumList(idBenefic, beneficNum, beneficName);
        listBene.add(b);
    }

    public static String formatMoney(long money) {
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");

        return formatter.format(money);
    }
}
