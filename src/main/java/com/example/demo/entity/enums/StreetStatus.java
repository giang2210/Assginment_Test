package com.example.demo.entity.enums;

public enum StreetStatus {
    USING(1), UNDER_CONSTRUCTION(0), UNDER_RENOVATION(-1);

    private int value;

    StreetStatus(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static StreetStatus of(int value){
        for (StreetStatus status:
                StreetStatus.values()
        ) {
            if (status.getValue() == value){
                return status;
            }
        }
        return StreetStatus.UNDER_RENOVATION;
    }
}
