package ironseige.models;

public enum EnemyType {
    STANDARD_TANK(40, 30f, 34, ""),
    ELITE_TANK(100, 30f, 58, ""),
    BOSS_TANK(2000, 20f, 1125, "");

    private int hitPoint;
    private float moveSpeed;
    private int value;
    private String iconPath;

    EnemyType(int hitPoint, float moveSpeed, int value, String iconPath) {
        this.hitPoint = hitPoint;
        this.moveSpeed = moveSpeed;
        this.value = value;
        this.iconPath = iconPath;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public float getMoveSpeed() {
        return moveSpeed;
    }

    public int getValue() {
        return value;
    }

    public String getIconPath() {
        return iconPath;
    }
}
