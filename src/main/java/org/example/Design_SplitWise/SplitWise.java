package org.example.Design_SplitWise;

import org.example.Design_SplitWise.Expense.ExpenseSplitType;
import org.example.Design_SplitWise.Expense.Split.Split;
import org.example.Design_SplitWise.Group.Group;
import org.example.Design_SplitWise.Group.GroupController;
import org.example.Design_SplitWise.User.User;
import org.example.Design_SplitWise.User.UserController;

import java.util.ArrayList;
import java.util.List;

public class SplitWise {
    UserController userController;
    GroupController groupController;
    BalanceSheetController balanceSheetController;

    SplitWise(){
        userController=new UserController();
        groupController=new GroupController();
        balanceSheetController=new BalanceSheetController();
    }

    public void demo(){
        setUpUserAndGroup();
        Group group=groupController.getGroup("G1001");
        group.addMember(userController.getUser("U2001"));
        group.addMember(userController.getUser("U3001"));

        List<Split> splits=new ArrayList<>();
        Split split1=new Split(userController.getUser("U1001"),300);
        Split split2=new Split(userController.getUser("U2001"),300);
        Split split3=new Split(userController.getUser("U3001"),300);
        splits.add(split1);
        splits.add(split2);
        splits.add(split3);
        group.createExpense("Exp1001","Lunch",500,splits, ExpenseSplitType.UNEQUAL,userController.getUser("U2001"));

        List<Split> splits2=new ArrayList<>();
        Split splits2_1=new Split(userController.getUser("U1001"),400);
        Split splits2_2=new Split(userController.getUser("U2001"),100);
        splits2.add(splits2_1);
        splits2.add(splits2_2);
        group.createExpense("Exp1002","Lunch",500,splits2,ExpenseSplitType.UNEQUAL,userController.getUser("U2001"));

        for(User user:userController.getUsersList()){
            balanceSheetController.showBalanceSheetOfUser(user);
        }
    }

    public void setUpUserAndGroup(){
        //onboard user to splitwise app
        addUsersToSplitwiseApp();

        User user1=userController.getUser("U1001");
        groupController.createNewGroup("G1001","Outing with Friends",user1);
    }

    private void addUsersToSplitwiseApp(){
        User user1=new User("U1001","User1");
        User user2=new User("U2001","User2");
        User user3=new User("U3001","User3");

        userController.addUser(user1);
        userController.addUser(user2);
        userController.addUser(user3);

    }
}
