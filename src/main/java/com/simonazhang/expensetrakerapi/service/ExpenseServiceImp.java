package com.simonazhang.expensetrakerapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simonazhang.expensetrakerapi.entity.Expense;
import com.simonazhang.expensetrakerapi.repository.ExpenseRepository;

/*
 * injection is a way to provide the necessary dependencies (objects or services) to a component(such as a class or a method) , 
 * making it loosely coupled and more modular. 
 * rather than having the component create or find the dependency itself. 
 */

@Service
public class ExpenseServiceImp implements ExpenseService {
    
    /*
     * The @Autowired annotation tells Spring to automatically inject an instance of ExpenseRepository when creating an instance of ExpenseService.
     */
    @Autowired
    private ExpenseRepository expenseRepo;
    
    @Override
    public List<Expense> getAllExpenses(){
        return expenseRepo.findAll();
    }
}
