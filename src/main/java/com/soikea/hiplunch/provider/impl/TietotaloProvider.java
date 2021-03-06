package com.soikea.hiplunch.provider.impl;

import com.soikea.hiplunch.provider.MenuProvider;
import com.soikea.hiplunch.provider.SodexoProvider;

@MenuProvider
public class TietotaloProvider extends SodexoProvider {

    @Override
    protected String getMessageUrl() {
        return "https://www.sodexo.fi/tietotalo";
    }

    @Override
    public String getName() {
        return "Sodexo Tietotalo";
    }

    @Override
    public String getId() {
        return "tietotalo";
    }

    @Override
    public String getSodexoId() {
        return "123";
    }

    @Override
    public String processFeed() {
        return super.processFeed();
    }
}
