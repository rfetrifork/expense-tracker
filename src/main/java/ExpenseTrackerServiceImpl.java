import models.Expense;

import java.util.ArrayList;
import java.util.List;

public class ExpenseTrackerServiceImpl implements ExpenseTrackerService{

    private List<Expense> expenses = new ArrayList<>();
    @Override
    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    @Override
    public List<Expense> getExpenses() {
        return expenses;
    }

}
