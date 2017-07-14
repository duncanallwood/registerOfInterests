package com.register.data;

import java.util.HashSet;
import java.util.Set;

public class Politician {
    private final String name;
    private final String party;
    private final String url;
    private final String rawInterestDetails;
    private Set<InterestDetail> interestDetails;

    public Politician(String name, String party, String url, String rawInterestDetails, Set<InterestDetail> interestDetails) {
        this.name = name;
        this.party = party;
        this.url = url;
        this.rawInterestDetails = rawInterestDetails;
        this.interestDetails = interestDetails;
    }

    public Politician(String name, String party, String url, String rawInterestDetails) {
        this.name = name;
        this.party = party;
        this.url = url;
        this.rawInterestDetails = rawInterestDetails;
    }

    public String getName() {
        return name;
    }

    public String getParty() {
        return party;
    }

    public String getUrl() {
        return url;
    }

    public Set<InterestDetail> getInterestDetails() {
        return interestDetails;
    }

    public void addInterestDetail(InterestDetail detail) {
        if(this.interestDetails == null)
            this.interestDetails = new HashSet<InterestDetail>();
        this.interestDetails.add(detail);
    }
}
