package com.example.nterlien;

public enum ModelObject {



    RED(R.string.ncamera, R.layout.ncamera),
    BLUE(R.string.nmusic, R.layout.nmusic),
    GREEN(R.string.stagenl, R.layout.stagenl);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }
}
