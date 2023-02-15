package Homework3.data;

public class Exception {

    Data data = new Data();
    public void checkDataOnCountOfMembers(String[] strArr, int count) {
        if(strArr.length > count) throw new StringIndexOutOfBoundsException();
        if(strArr.length < count) throw new IndexOutOfBoundsException();
    }

    public void checkDataOnSurnameFormat(String[] strArr) {
        if(data.getSurname(strArr) == null) throw new IllegalArgumentException();
    }

    public void checkDataOnPatronymicsFormat (String[] strArray) {
        if(data.getPatronymics(strArray) == null) throw new IllegalArgumentException();
    }

    public void checkDataOnGenderFormat (String[] strArray) {
        if(data.getGender(strArray) == null) throw new IllegalArgumentException();
    }

    public void checkDataOnBirthDateFormat(String[] strArr) {
        if(data.getBirthDate(strArr) == null) throw  new NumberFormatException();
    }

    public void checkDataOnTelephoneNumberFormat(String[] strArr) {
        if(data.getTelephoneNumber(strArr) == null) throw  new NumberFormatException();
    }

    public void checkDataOnNameFormat(String[] strArr) {
        if(data.getName(strArr) == null) throw new IllegalArgumentException();
    }
}