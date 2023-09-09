public class ResidentalRate extends RateCategory implements CanElectricalCalculator {


    @Override
    public double calculateElectricityBill() {

        double tariff = 0;


        if (getElectricalConsumptionAmount() >= 0 && getElectricalConsumptionAmount() <= 2000) {
            tariff = 0.1047;
        } else if (getElectricalConsumptionAmount() >= 2001 && getElectricalConsumptionAmount() <= 6000) {
            tariff = 0.1298;
        } else if (getElectricalConsumptionAmount() >= 6001 && getElectricalConsumptionAmount() <= 10_000) {
            tariff = 0.1607;
        } else if (getElectricalConsumptionAmount() >= 10_001 && getElectricalConsumptionAmount() <= 20_000) {
            tariff = 0.3420;
        } else {
            tariff = 0.6076;
        }
        setElectricalTariff(tariff);
        double total = getElectricalConsumptionAmount() * tariff;
        return total;
    }

    @Override
    public double calculateWaterBill() {
        double tariff = 0;

        if (getCubicMeters() <= 33) {
            tariff = 1.3965;
        } else if (getCubicMeters() > 33) {
            tariff = 5.1395;
        }
        setWaterTariff(tariff);
        double total = getCubicMeters() * getWaterTariff();
        return total;
    }
}
