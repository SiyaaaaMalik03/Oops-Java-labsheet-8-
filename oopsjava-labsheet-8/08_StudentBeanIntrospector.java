import java.beans.PropertyChangeSupport;

public class AccountBeanUpdate {
    private double balance;
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        double oldBalance = balance;
        balance = newBalance;
        support.firePropertyChange("balance", oldBalance, newBalance);
    }

    public void addPropertyChangeListener(java.beans.PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public static void main(String[] args) {
        AccountBeanUpdate account = new AccountBeanUpdate();

        account.addPropertyChangeListener(event ->
            System.out.println("Property Change Event: balance changed from "
                    + event.getOldValue() + " to " + event.getNewValue()));

        System.out.println("Initial Balance: " + account.getBalance());

        account.setBalance(10000);
        account.setBalance(12500);

        System.out.println("Final Balance: " + account.getBalance());
    }
}
