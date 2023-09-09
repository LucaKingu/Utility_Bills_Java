import java.util.Scanner;

public class ResidentalRate extends RateCategory implements CanElectricalCalculator{


    @Override
    public double calculateElectricity() {

        double tariff;


        if(getConsumptionAmount() >= 0 && getConsumptionAmount() <= 2000)
        {
            tariff = 0.1047;
        }
        else if(getConsumptionAmount() >= 2001 && getConsumptionAmount() <= 6000)
        {
            tariff = 0.1298;
        }
        else if(getConsumptionAmount() >= 6001 && getConsumptionAmount() <= 10_000)
        {
            tariff = 0.1607;
        }
        else if(getConsumptionAmount() >= 10_001 && getConsumptionAmount() <= 20_000)
        {
            tariff = 0.3420;
        }
        else
        {
            tariff = 0.6076;
        }
        setTariff(tariff);
        double total = getConsumptionAmount() * tariff;
        return total;
    }
}
