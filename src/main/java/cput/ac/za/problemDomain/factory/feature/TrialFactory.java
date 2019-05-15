package cput.ac.za.problemDomain.factory.feature;

import cput.ac.za.problemDomain.domain.feature.Trial;
import cput.ac.za.problemDomain.util.GenID;

public class TrialFactory {

    public static Trial getTrial(String veredict)
    {
        return new Trial.Builder()
                .requestNumber(GenID.generateId())
                .veredict(veredict)
                .build();
    }

}
