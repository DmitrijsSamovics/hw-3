class ATM {
    public int countBanknotes(int sum) {
        int countOfBanknotes = 0;
        int check = 72;
        if (sum>500) {
            countOfBanknotes += sum / 500;
        }
        if (sum>200) {
            countOfBanknotes+=sum%500/200;
        }
        if (sum>100) {
            countOfBanknotes+=sum%500%200/100;
        }
        if (sum>50) {
            countOfBanknotes+=sum%500%200%100/50;
            check = check%500%200%100;
        }
        if (sum>20) {
            countOfBanknotes+=sum%500%200%100%50/20;
        }
        if (sum>10) {
            countOfBanknotes+=sum%500%200%100%50%20/10;
        }
        if (sum>5) {
            countOfBanknotes+=sum%500%200%100%50%20%10/5;
        }
        if (sum>2) {
            countOfBanknotes+=sum%500%200%100%50%20%10%5/2;
        }
        if (sum%500%200%100%50%20%10%5%2==1) {
            countOfBanknotes+=1;
        }
        return countOfBanknotes;
    }
}
