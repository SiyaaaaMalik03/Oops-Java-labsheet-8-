import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class AccountBeanListener {
    private double balance;
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        double oldBalance = this.balance;
        this.balance = newBalance;
        support.firePropertyChange("balance", oldBalance, newBalance);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public static void main(String[] args) {
        AccountBeanListener account = new AccountBeanListener();

        account.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent event) {
                System.out.println("Balance changed from " +
                    event.getOldValue() + " to " + event.getNewValue());
            }
        });

        account.setBalance(5000);
        account.setBalance(7500);
    }
}
