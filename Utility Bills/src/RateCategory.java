public class RateCategory {

    private int electricalConsumptionAmount = 0;
    private double electricalTariff = 0;

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

}
