import java.time.LocalDate;

/**
 * @see Object
 * @author Nikita
 * @since 1.0
 * */
class Person{
    protected String name, surname;
    protected LocalDate dateOfBirth;
    @Override
    public String toString(){
        return this.name +" "+ this.surname +" "+ this.dateOfBirth;
    }
    @Override
    public boolean equals(Object other){
        return other instanceof Person;
    }
    /**
     * @param name_ Имя
     * */
    public void setName(String name_){
        name = name_;
    }
    /**
     * @param surname_ Фамилия
     * */
    public void setSurname(String surname_){
        surname = surname_;
    }
    /**
     * @param setDateOfBirth_ Дата рождения
     * */
    public void setDateOfBirth(String setDateOfBirth_) {
        dateOfBirth = LocalDate.parse(setDateOfBirth_);
    }
    /**
     * @return  Имя
     * */
    public String getName(){
        return name;
    }
    /**
     * @return  Фамилия
     * */
    public String getSurname(){
        return surname;
    }
    /**
     * @return  Дата
     * */
    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    Person(){
        name = "Unknown";
        surname = "Unknown";
        dateOfBirth = LocalDate.parse("2018-05-05");
    }
    Person(String name_, String surname_, String date_){
        name = name_;
        surname = surname_;
        dateOfBirth = LocalDate.parse(date_);
    }
}
