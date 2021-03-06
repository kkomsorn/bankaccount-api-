package th.ac.ku.bankaccount.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int customerId;
    private String type;
    private Double balance;
    private Double depositOrWithdraw;

    public Double getDepositOrWithdraw() {
        return depositOrWithdraw;
    }

    public void setDepositOrWithdraw(Double depositOrWithdraw) {
        this.depositOrWithdraw = depositOrWithdraw;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public double depositOrWithdraw(){
        return balance+=depositOrWithdraw;
    }
    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", type='" + type + '\'' +
                ", balance=" + balance +
                ", depositOrWithdraw=" + depositOrWithdraw +
                '}';
    }
}
