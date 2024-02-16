public class Main {
    public static void main(String[] args) {
        double salary = 73000;
        double rent = 1500;
        double rentInsurance = 80;
        double internet = 50;
        double groceries = 250;
        double dataPlan = 50;
        double commutingCosts = 300;
        double savingsAccount = 0;
        double tv = 0;
        double extra = 0;
        double monthlyStudentLoan = 0;
        int months = 0;
        while (savingsAccount < 150000) {
            months++;
            if (months % 12 == 0) {
                salary = salary + salary * (((Math.random() * 3) + 5) /100);
                rent *= 1 + (((Math.random() * 3) + 3) / 100);
                rentInsurance *= 1 + (((Math.random() * 3) + 3) / 100);
                internet *= 1 + (((Math.random() * 3) + 3) / 100);
                groceries *= 1 + (( (Math.random() * 3) + 3) / 100);
                dataPlan *= 1 + (( (Math.random() * 3) + 3) / 100);
                commutingCosts *= 1 + (( (Math.random() * 3) + 3) / 100);
                tv *= 1 + (( (Math.random() * 3) + 3) / 100);
                extra *= 1 + (( (Math.random() * 3) + 3) / 100);
            }
            savingsAccount += (salary * 0.45)/12;
            savingsAccount -= rent;
            savingsAccount -= rentInsurance;
            savingsAccount -= internet;
            savingsAccount -= groceries;
            savingsAccount -= dataPlan;
            savingsAccount-= commutingCosts;
            savingsAccount -= tv;
            savingsAccount -= extra;
            savingsAccount -= monthlyStudentLoan;
            if ((int) (Math.random() * 5) + 1 == 1) {
                savingsAccount -= 150;
            }
        }
        System.out.println(months);
    }
}