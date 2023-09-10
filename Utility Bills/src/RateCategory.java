public class RateCategory {

    private double electricalConsumptionAmount = 0;
    private double electricalTariff = 0;
    private double cubicMeters = 0;
    private double waterTariff = 0;


    public double getElectricalConsumptionAmount(){
        return electricalConsumptionAmount;
    }

    public void setElectricalConsumptionAmount(double amount){
        electricalConsumptionAmount = amount;
    }

    public double getElectricalTariff(){
        return electricalTariff;
    }

    public void setElectricalTariff(double tariff) {
        this.electricalTariff = tariff;
    }

    public double getWaterTariff() {
        return waterTariff;
    }

    public void setWaterTariff(double waterTariff) {
        this.waterTariff = waterTariff;
    }

    public double getCubicMeters() {
        return cubicMeters;
    }

    public void setCubicMeters(double cubicMeters) {
        this.cubicMeters = cubicMeters;
    }
}
