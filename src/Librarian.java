import java.time.LocalDate;

/**
 * @see Person
 * @author Nikita
 * @since 1.0
 * */
class Librarian extends Person{
    protected int payment;
    Librarian(){
        payment = 70;
    }
    Librarian(String name_, String surname_, String date_, int payment_){
        name = name_;
        surname = surname_;
        dateOfBirth = LocalDate.parse(date_);
        payment = payment_;
    }

    /**
     * @param payment_ Заработная плата
     * */
    public void setPayment(int payment_){
        payment = payment_;
    }
    /**
     * @return  Зарплата
     * */
    public int getPayment(){
        return payment;
    }

    @Override
    public String toString(){
        return this.name +" "+ this.surname +" "+ this.dateOfBirth+"Payment: "+this.payment;
    }

}
