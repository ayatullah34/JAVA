public class Main {

    public static void main(String[] args) {

        AccountManager accountManager=new AccountManager();

        System.out.println("HESAP= "+accountManager.getBalance());
        accountManager.deposit(100);
        System.out.println("HESAP= "+accountManager.getBalance());

        try {
            accountManager.withdraw(90);
        }catch(BalanceInsufficentException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("HESAP= " + accountManager.getBalance());

        try{
            accountManager.withdraw(20);
        }catch(BalanceInsufficentException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("HESAP= "+accountManager.getBalance());


    }
}
