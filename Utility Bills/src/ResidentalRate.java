import java.util.Scanner;

public class ResidentalRate extends RateCategory implements CanElectricalCalculator{

private double total = getConsumptionAmount() * getTariff();
    @Override
    public double calculateElectricity() {

        if(getConsumptionAmount() <= 0 && getConsumptionAmount() >= 2000)
        {
            setTariff(0.1047);
        }
        else if(getConsumptionAmount() <= 2001 && getConsumptionAmount() >= 6000)
        {
            setTariff(0.1298);
        }
        else if(getConsumptionAmount() <= 6001 && getConsumptionAmount() >= 10_000)
        {
            setTariff(0.1607);
        }
        else if(getConsumptionAmount() <= 10_001 && getConsumptionAmount() >= 20_000)
        {
            setTariff(0.3420);
        }
        else
        {
            setTariff(0.6076);
        }
        return total;
    }
}
