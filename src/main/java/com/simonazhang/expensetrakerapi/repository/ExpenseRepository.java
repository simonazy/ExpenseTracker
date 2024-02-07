package com.simonazhang.expensetrakerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simonazhang.expensetrakerapi.entity.Expense;

/*
By extending JpaRepository, your ExpenseRepository inherits a set of CRUD (Create, Read, Update, Delete) methods for managing Expense entities. 
Spring Data JPA will automatically provide implementations for these methods, and you can use them directly in your code without having to write 
the actual implementation.
For example, you can use methods like save, findById, findAll, delete, etc., to perform common operations on the Expense entities.
*/ 

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    
}
