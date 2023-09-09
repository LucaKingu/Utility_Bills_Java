import java.util.Scanner;

public class RateCategory {

    private int consumptionAmount = 0;
    private double tariff = 0;

    public int getConsumptionAmount(){
        return consumptionAmount;
    }

    public double getTariff(){
        return tariff;
    }

    public void setConsumptionAmount(int amount){
        consumptionAmount = amount;
    }

    public void setTariff(double tariff) {
        this.tariff = tariff;
    }

}
