import com.cg.exception.InsufficientBalanceException;
import com.cg.modal.Account;
import com.cg.modal.Transaction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account(786,9000);
		try
		{
			Transaction.withdraw(a1,4001);
		}
		catch(InsufficientBalanceException ex)
		{
			System.out.println("less amount");
		}
	}

}
