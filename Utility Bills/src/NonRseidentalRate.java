public class NonRseidentalRate extends RateCategory implements CanUtilityCalculator {
    @Override
    public double calculateElectricityBill() {
        double tariff = 0;
        double tax = 0;


        if (getElectricalConsumptionAmount() <= 2000)
        {
            tariff = 0.1215;
            tax = getElectricalConsumptionAmount() * tariff;
        }
        else if (getElectricalConsumptionAmount() <= 6000) {
            tariff = 0.1275;
            tax = 2000 * 0.1215;
            tax += (getElectricalConsumptionAmount() - 2000) * tariff;
        }
        else if (getElectricalConsumptionAmount() <= 10_000)
        {
            tariff = 0.1373;
            tax = 2000 * 0.1215;
            tax += 4000 * 0.1275;
            tax += (getElectricalConsumptionAmount() - 4000) * tariff;
        }
        else if (getElectricalConsumptionAmount() <= 20_000)
        {
            tariff = 0.1485;
            tax = 2000 * 0.1215;
            tax += 4000 * 0.1275;
            tax += 4000 * 0.1373;
            tax += (getElectricalConsumptionAmount() - 10_000) * tariff;
        }
        else if (getElectricalConsumptionAmount() <= 60_000)
        {
            tariff = 0.1613;
            tax = 2000 * 0.1215;
            tax += 4000 * 0.1275;
            tax += 4000 * 0.1373;
            tax += 10_000 * 0.1485;
            tax += (getElectricalConsumptionAmount() - 40_000) * tariff;
        }
        else if (getElectricalConsumptionAmount() <= 100_000)
        {
            tariff = 0.1500;
            tax = 2000 * 0.1215;
            tax += 4000 * 0.1275;
            tax += 4000 * 0.1373;
            tax += 10_000 * 0.3420;
            tax += 40_000 * 0.1613;
            tax += (getElectricalConsumptionAmount() - 40_000) * tariff;
        }
        else if (getElectricalConsumptionAmount() <= 1_000_000)
        {
            tariff = 0.1403;
            tax = 2000 * 0.1215;
            tax += 4000 * 0.1275;
            tax += 4000 * 0.1373;
            tax += 10_000 * 0.3420;
            tax += 40_000 * 0.1613;
            tax += 40_000 * 0.1500;
            tax += (getElectricalConsumptionAmount() - 900_000) * tariff;
        }
        else if (getElectricalConsumptionAmount() <= 5_000_000)
        {
            tariff = 0.1275;
            tax = 2000 * 0.1215;
            tax += 4000 * 0.1275;
            tax += 4000 * 0.1373;
            tax += 10_000 * 0.3420;
            tax += 40_000 * 0.1613;
            tax += 40_000 * 0.1500;
            tax += 900_000 * 0.1403;
            tax += (getElectricalConsumptionAmount() - 4_000_000) * tariff;
        }
        else
        {
            tariff = 0.1080;
            tax = 2000 * 0.1215;
            tax += 4000 * 0.1275;
            tax += 4000 * 0.1373;
            tax += 10_000 * 0.3420;
            tax += 40_000 * 0.1613;
            tax += 40_000 * 0.1500;
            tax += 900_000 * 0.1403;
            tax += 4_000_000 * 0.1275;
            tax += (getElectricalConsumptionAmount() - 5_000_000) * tariff;
        }
        return tax;
    }

    @Override
    public double calculateWaterBill() {
        double tariff = 0;
        double tax = 0;

        if (getCubicMeters() <= 168) {
            tariff = 1.9950;
            tax = getCubicMeters() * tariff;
        }
        else if (getCubicMeters() <= 40_000)
        {
            tariff = 2.3750;
            tax += 168 * 1.9950;
            tax += (getCubicMeters() - 168) * tariff;
        }
        else
        {
            tariff = 1.6625;
            tax += 33 * 1.9950;
            tax += 40_000 * 2.3750;
            tax += (getCubicMeters() - 40_000) * tariff;
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
