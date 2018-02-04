package alex.zhurylo;

public class TeslaCar {
    private static final int CHARGE = 1;
    private static final int MAX_CHARGE = 85;
    private int electroCharge = 0;

    public int getElectroCharge() {
        return electroCharge;
    }

    public void chargeTesla() {
        if (electroCharge >= MAX_CHARGE) return;
        this.electroCharge += CHARGE;
    }

    public void deschargeTesla() {
        if (electroCharge <= 0) return;
        this.electroCharge -= CHARGE;
    }
}
