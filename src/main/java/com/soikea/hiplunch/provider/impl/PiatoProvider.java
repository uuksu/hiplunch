package com.soikea.hiplunch.provider.impl;

import com.soikea.hiplunch.provider.SemmaProvider;

public class PiatoProvider extends SemmaProvider {

    @Override
    protected String getMessageUrl() {
        return "https://www.semma.fi/ravintolat2/mattilanniemi/piato/";
    }

    @Override
    public String getName() {
        return "Semma Piato";
    }

    @Override
    public String getId() {
        return "piato";
    }

    @Override
    protected String getSemmaId() {
        return "1408";
    }
}
