package com.example.examples;

import com.example.dto.Citizen;

public class VoterEligibleHelper {

    public String checkEligibility(Citizen citizen){
        if (citizen.age() >= 18){
            return "Go for vote";
        } else {
            return "You are not eligible to vote";
        }
    }

}
