package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onPayServ;
	
	public ContractService() {
	}
	
	public ContractService(OnlinePaymentService onPayServ) {
		this.onPayServ = onPayServ;
	} 
	
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            Date date = addDate(contract.getDate(), i);
            double updatedQuota = basicQuota + onPayServ.interest(basicQuota, i);
            double fullQuota =  updatedQuota + onPayServ.paymentFee(updatedQuota);
            contract.addInstallment(new Installment(date, fullQuota));
        }
	}

	public Date addDate(Date date, int inst) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, inst);
		return cal.getTime();
	}
}
