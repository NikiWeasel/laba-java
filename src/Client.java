import java.time.LocalDate;

/**
 * @see Person
 * @author Nikita
 * @since 1.0
 * */
class Client extends Person{
    protected int id;
    protected boolean debtorStatus;
    Client(){
        id = -1;
        debtorStatus = false;
    }
    /**
     * @param name_ Имя
     * @param surname_ Фамилия
     * @param date_ Дата
     * @param id_ ID читателя
     * @param isDebtor_ Задолжник
     * */
    Client(String name_, String surname_, String date_, int id_, boolean isDebtor_){
        name = name_;
        surname = surname_;
        dateOfBirth = LocalDate.parse(date_);
        id = id_;
        debtorStatus = isDebtor_;
    }
    /**
     * @param id_ ID читателя
     * */
    public void setId(int id_){
        id = id_;
    }
    /**
     * @param debtorStatus_ Является ли должником
     * */
    public void setDebtorStatus(boolean debtorStatus_){
        debtorStatus = debtorStatus_;
    }

    /**
     * @return  Дата
     * */
    public int getId(){
        return id;
    }
    /**
     * @return  Является ли должником
     * */
    public boolean getDebtorStatus(){
        return debtorStatus;
    }


    @Override
    public String toString(){
        return "Client: "+this.name +" "+
                this.surname +" "+ this.dateOfBirth+this.id;
    }

}