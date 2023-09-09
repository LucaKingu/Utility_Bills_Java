public class RateCategory {

    private int electricalConsumptionAmount = 0;
    private double electricalTariff = 0;
    private int cubicMeters = 0;
    private double waterTariff = 0;


    public int getElectricalConsumptionAmount(){
        return electricalConsumptionAmount;
    }

    public double getElectricalTariff(){
        return electricalTariff;
    }

    public void setElectricalConsumptionAmount(int amount){
        electricalConsumptionAmount = amount;
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

    public int getCubicMeters() {
        return cubicMeters;
    }

    public void setCubicMeters(int cubicMeters) {
        this.cubicMeters = cubicMeters;
    }
}
