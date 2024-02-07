package com.simonazhang.expensetrakerapi.entity;

import java.math.BigDecimal;
import java.sql.Date;

import org.hibernate.validator.constraints.ru.INN;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbl_expenses") 
public class Expense {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "expense_name")
    private String name;
    
    private String description;
    
    @Column(name = "expense_amount")
    private BigDecimal amount;
    
    private String category;
    private Date date;
}
