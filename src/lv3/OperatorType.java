package lv3;

public enum OperatorType {
    PLUS("+"),
    SUB("-"),
    MULTI("*"),
    DIVIDE("/");

    private final String operate;

    OperatorType(String operate) {
        this.operate = operate;
    }

    public String getOperate() {
        return operate;
    }

    public static OperatorType fromStringToOperatorType(String operate) {
            for (OperatorType value : OperatorType.values()) {
                if (value.getOperate().equals(operate)) {
                    return value;
                }
            }
        return null;
    }
}
