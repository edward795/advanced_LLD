package org.example.Design_SplitWise.Group;

import org.example.Design_SplitWise.Expense.Expense;
import org.example.Design_SplitWise.Expense.ExpenseController;
import org.example.Design_SplitWise.Expense.ExpenseSplitType;
import org.example.Design_SplitWise.Expense.Split.Split;
import org.example.Design_SplitWise.User.User;

import java.util.ArrayList;
import java.util.List;

public class Group {
    String groupId;
    String groupName;
    List<User> groupMembers;
    List<Expense> expenseList;
    ExpenseController expenseController;

    Group(){
        groupMembers=new ArrayList<>();
        expenseList=new ArrayList<>();
        expenseController=new ExpenseController();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void addMember(User member){
        groupMembers.add(member);
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<User> getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(List<User> groupMembers) {
        this.groupMembers = groupMembers;
    }

    public List<Expense> getExpenseList() {
        return expenseList;
    }

    public void setExpenseList(List<Expense> expenseList) {
        this.expenseList = expenseList;
    }

    public ExpenseController getExpenseController() {
        return expenseController;
    }

    public void setExpenseController(ExpenseController expenseController) {
        this.expenseController = expenseController;
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser){
        Expense expense=expenseController.createExpense(expenseId,
                description,
                expenseAmount,
                splitDetails,
                splitType,
                paidByUser);
        expenseList.add(expense);
        return expense;
    }
}
