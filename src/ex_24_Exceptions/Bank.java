package ex_24_Exceptions;

public class Bank {
    private String currency;
    private Integer amount;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Bank(String currency, Integer amount)
    {
        this.currency=currency;
        this.amount=amount;
    }

    public Integer add(Bank bankname)
    {
        if(bankname.currency.equalsIgnoreCase("INR")){
            return bankname.amount + this.amount;
        }
        else{
            try
            {
                throw new CustomException("Currency mismatch ,can't add");
            }
            catch(CustomException e)
            {
                throw new RuntimeException(e);
            }
        }
    }

}

class CustomException extends Exception{
    CustomException(String msg)
    {
        super(msg);
    }

}