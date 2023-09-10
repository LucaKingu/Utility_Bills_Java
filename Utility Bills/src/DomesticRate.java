public class DomesticRate extends RateCategory implements CanUtilityCalculator{
    @Override
    public double calculateElectricityBill() {
        double tariff = 0;
        double tax = 0;


        if (getElectricalConsumptionAmount() <= 2000)
        {
            tariff = 0.1365;
            tax = getElectricalConsumptionAmount() * tariff;
        }
        else if (getElectricalConsumptionAmount() <= 6000) {
            tariff = 0.1673;
            tax = 2000 * 0.1365;
            tax += (getElectricalConsumptionAmount() - 2000) * tariff;
        }
        else if (getElectricalConsumptionAmount() <= 10_000)
        {
            tariff = 0.2023;
            tax = 2000 * 0.1365;
            tax += 4000 * 0.1673;
            tax += (getElectricalConsumptionAmount() - 6000) * tariff;
        }
        else if (getElectricalConsumptionAmount() <= 20_000)
        {
            tariff = 0.4180;
            tax = 2000 * 0.1365;
            tax += 4000 * 0.1673;
            tax += 4000 * 0.2023;
            tax += (getElectricalConsumptionAmount() - 10_000) * tariff;
        }
        else
        {
            tariff = 0.6860;
            tax = 2000 * 0.1365;
            tax += 4000 * 0.1673;
            tax += 4000 * 0.2023;
            tax += 10_000 * 0.4180;
            tax += (getElectricalConsumptionAmount() - 20_000) * tariff;
        }
        return tax;
    }

    @Override
    public double calculateWaterBill() {
        double tariff = 0;
        double tax = 0;

        if (getCubicMeters() <= 33) {
            tariff = 2.1850;
            tax = getCubicMeters() * tariff;
        }
        else
        {
            tariff = 5.1395;
            tax += 33 * 2.1850;
            tax += (getCubicMeters() - 33) * tariff;
        }
        return tax;
    }

    public double totalAmount(){
        double electricTotal = calculateElectricityBill();
        double waterTotal = calculateWaterBill();
        double total = waterTotal + electricTotal;
        return total;
    }

}
