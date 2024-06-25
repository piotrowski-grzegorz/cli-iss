package api;


import java.util.List;

public class PeopleInSpaceResponse {
    String message;
    List<People> people;
    int number;

    @Override
    public String toString() {
        return "message=" + message + '\n'+
                "crew: "+ '\n' + people + '\n'+
                "number=" + number + '\n'+
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<People> getPeople() {
        return people;
    }

    public void setPeople(List<People> people) {
        this.people = people;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


}
