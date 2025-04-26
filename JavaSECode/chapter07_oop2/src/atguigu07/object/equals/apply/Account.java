package atguigu07.object.equals.apply;

import java.util.Objects;

/**
 * ClassName: Account
 * Package: atguigu07.object.equals.apply
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/24 22:34
 * @Version 1.0
 */
public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public Account() {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(balance, account.balance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance);
    }
}
