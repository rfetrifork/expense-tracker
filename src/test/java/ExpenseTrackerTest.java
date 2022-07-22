import models.Expense;
import models.Person;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

public class ExpenseTrackerTest {
    private ExpenseTrackerService expenseTrackerService = new ExpenseTrackerServiceImpl();
    @Test
    public void Test_AddExpense() {
        Person person = new Person("Jesper");
        Expense expense = new Expense(new BigDecimal(1000.0), "this is fun", person);
                expenseTrackerService.addExpense(expense);

        List<Expense> expenses = expenseTrackerService.getExpenses();
        Assert.assertTrue(expenses.contains(expense));
        Assert.assertEquals(1,expenses.size());
    }

}
