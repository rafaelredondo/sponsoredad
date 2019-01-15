package com.rafaelredondo.sponsoredad.schema;

import java.util.ArrayList;
import java.util.List;

public class SponsoredKeyword {

    private String keyword;

    private List<SponsoredOffer> offers = new ArrayList<>();

    public SponsoredKeyword(String keyword) {
        this.keyword = keyword;
    }

    public SponsoredKeyword addSponserdOffer(SponsoredOffer offer) {
        offers.add(offer);
        return this;
    }

    public String getKeyword() {
        return keyword;
    }

    public List<SponsoredOffer> getOffers() {
        return offers;
    }
}
