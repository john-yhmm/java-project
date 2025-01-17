package ironseige.models;

public enum TurretType {
    SHREDDER(10, 2.5f, 12.5f, 100,  ""),
    DOOM(50, 0.75f, 20f, 350,  ""),
    FROSTIX(8,3.5f,15,250,""),
    KRYPTONITE(5,10f,13.5f,450,"");

    private int atkPower;
    private float atkSpeed;
    private float atkRange;
    private int purchaseCost;
    private String iconPath;

    TurretType(int atkPower, float atkSpeed, float atkRange, int purchaseCost,  String iconPath) {
        this.atkPower = atkPower;
        this.atkSpeed = atkSpeed;
        this.atkRange = atkRange;
        this.purchaseCost = purchaseCost;
        this.iconPath = iconPath;
    }

    public int getAtkPower() {
        return atkPower;
    }

    public float getAtkSpeed() {
        return atkSpeed;
    }

    public float getAtkRange() {
        return atkRange;
    }

    public int getPurchaseCost() {
        return purchaseCost;
    }

    public String getIconPath() {
        return iconPath;
    }
}
