package com.wen.demo3;

/**
 * @ClassName Demo6
 * @Description 多态--主要用来计算一个人每月的税收支出
 *  呵9
 * @Author wenBo
 * @Date 2020/3/28 13:19
 */
public class Demo6 {
    public static void main(String[] args) {
        //给一个有普通收入、工资收入、和享受国务院特殊津贴的小程序算税
        Income[] incomes=new Income[]{
           new Income(3000),
           new Salary(7500),
           new StateCounciSpecialAllowance(15000)
        };
        System.out.println(totalTax(incomes));
    }
    public static double totalTax(Income... incomes){
        double total=0;
        for (Income income:incomes){
            total=total+income.getIncome();
        }
        return total;
    }
}

class Income{
    protected double income;

    public Income(double income) {
        this.income=income;
    }

    public double getIncome() {
        return income * 0.1;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}

class Salary extends Income{
    public Salary(double income) {
        super(income);
    }

    @Override
    public double getIncome() {
        if (income<=5000){
            return 0;
        }
        return (income-5000)*0.2;
    }
}

class StateCounciSpecialAllowance extends Income{
    public StateCounciSpecialAllowance(double income) {
        super(income);
    }

    @Override
    public double getIncome() {
        return 0;
    }
}
