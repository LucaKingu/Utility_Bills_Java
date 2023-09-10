public class ResidentalRate extends RateCategory implements CanUtilityCalculator {


    @Override
    public double calculateElectricityBill() {

        double tariff = 0;
        double tax = 0;


        if (getElectricalConsumptionAmount() <= 2000)
        {
            tariff = 0.1047;
            tax = getElectricalConsumptionAmount() * tariff;
        }
        else if (getElectricalConsumptionAmount() <= 6000) {
            tariff = 0.1298;
            tax = 2000 * 0.1047;
            tax += (getElectricalConsumptionAmount() - 2000) * tariff;
        }
        else if (getElectricalConsumptionAmount() <= 10_000)
        {
            tariff = 0.1607;
            tax = 2000 * 0.1047;
            tax += 4000 * 0.1298;
            tax += (getElectricalConsumptionAmount() - 6000) * tariff;
        }
        else if (getElectricalConsumptionAmount() <= 20_000)
        {
            tariff = 0.3420;
            tax = 2000 * 0.1047;
            tax += 4000 * 0.1298;
            tax += 4000 * 0.1607;
            tax += (getElectricalConsumptionAmount() - 10_000) * tariff;
        }
        else
        {
            tariff = 0.6076;
            tax = 2000 * 0.1047;
            tax += 4000 * 0.1298;
            tax += 4000 * 0.1607;
            tax += 10_000 * 0.3420;
            tax += (getElectricalConsumptionAmount() - 20_000) * tariff;
        }
        return tax;
    }

    @Override
    public double calculateWaterBill() {
        double tariff = 0;
        double tax = 0;

        if (getCubicMeters() <= 33) {
            tariff = 1.3965;
            tax = getCubicMeters() * tariff;
        }
        else if (getCubicMeters() > 33)
        {
            tariff = 5.1395;
            tax += 33 * 1.3965;
            tax += (getCubicMeters() - 33) * tariff;
        }
        return tax;
    }
}
