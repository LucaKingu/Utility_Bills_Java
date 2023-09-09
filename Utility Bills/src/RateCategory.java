public class RateCategory {

    private int consumptionAmount = 0;

    public RateCategory(int consumptionAmount)
    {
        this.consumptionAmount = consumptionAmount;
    }


    public float consumptionTariff(float tariff)
    {
            return consumptionAmount * tariff;
    }
}
