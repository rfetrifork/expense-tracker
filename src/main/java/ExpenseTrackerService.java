import models.Expense;

import java.util.List;

public interface ExpenseTrackerService {
    public void addExpense(Expense expense);

    List<Expense> getExpenses();
}