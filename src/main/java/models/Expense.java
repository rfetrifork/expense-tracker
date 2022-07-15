package models;

import java.math.BigDecimal;

public class Expense {
    private BigDecimal amount;
    private String description;
    private Person fromPerson;

    public Expense(BigDecimal amount, String description, Person fromPerson) {
        this.amount = amount;
        this.description = description;
        this.fromPerson = fromPerson;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Person getFromMember() {
        return fromPerson;
    }

    public void setFromMember(Person fromPerson) {
        this.fromPerson = fromPerson;
    }
}
