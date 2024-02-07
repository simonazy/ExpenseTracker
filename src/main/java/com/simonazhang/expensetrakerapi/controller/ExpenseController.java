package com.simonazhang.expensetrakerapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simonazhang.expensetrakerapi.entity.Expense;
import com.simonazhang.expensetrakerapi.service.ExpenseService;

import java.util.List; 



@RestController
public class ExpenseController {
    
    @Autowired
    private ExpenseService expenseService;
    
    @GetMapping("/expenses")
    public List<Expense> getAllExpenses(){
        return expenseService.getAllExpenses();
    } 
}
