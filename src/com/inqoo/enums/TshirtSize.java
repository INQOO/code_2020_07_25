package com.inqoo.enums;

enum TshirtSize {
    S(48),
    M(50),
    L(54),
    XL(58),
    XXL(62);

    private int chestWidth;

    TshirtSize(int chestWidth) {
        this.chestWidth = chestWidth;
    }

    static TshirtSize getSmallestSize() {
        return S;
    }

    static TshirtSize getBiggestSize() {
        return XXL;
    }

    int getChestWidth() {
        return chestWidth;
    }
}
