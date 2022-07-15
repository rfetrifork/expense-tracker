import models.Expense;
import models.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ExpenseTrackerTest {
    @Test
    public void Test_AddExpense() {
        Person person = new Person("Jesper");
        Expense expense = new Expense(new BigDecimal(1000.0), "this is fun", person);
        Interface.addExpense(expense);
        ArrayList<Expense> expenses = Interface.getExpenses();
        Assertions.assertEquals(expenses.contains(expense), "nice");
    }

}
