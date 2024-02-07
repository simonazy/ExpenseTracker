package com.simonazhang.expensetrakerapi.service;

import java.util.List;
import com.simonazhang.expensetrakerapi.entity.Expense;

public interface ExpenseService {
    List<Expense> getAllExpenses();
}
