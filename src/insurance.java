import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class insurance {
    private String validity;
    private String price;
    private String number;

    public insurance(String validity, String price, String number) {
        if (validity.isBlank() || validity.isEmpty()) {
            this.validity = "Не указано";
        } else {
            this.validity = validity;
        }
        if (price.isBlank() || price.isEmpty()) {
            this.price = "Не указано";
        } else {
            this.price = price;
        }
        if (number.isBlank() || number.isEmpty()) {
            this.number = "Не указано";
        } else {
            this.number = number;
        }

    }

    public String obj(insurance insurance){
        String obj1 = insurance.getNumber() + " " + insurance.getPrice() + " " + insurance.getValidity();
        return obj1;
    }


    public void checkExpirationDate(String validity) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy ");
        String data = validity;
        Date dataAll = formatter.parse(data);
        Date dateNew = new Date();

        if (dataAll.after(dateNew)){
            System.out.println("Нужно срочно менять страховку");
        }
    }

    public void checkNumber(String number){
        int count = 0;
        for (char i : number.toCharArray()){
            count++;
        }
        if (count != 9){
            System.out.println("Номер страховки некорректный!");
        }
    }

    public String getValidity() {
        return validity;
    }

    public String getPrice() {
        return price;
    }

    public String getNumber() {
        return number;
    }
}
