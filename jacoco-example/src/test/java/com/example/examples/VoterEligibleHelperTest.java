package com.example.examples;

import com.example.dto.Citizen;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VoterEligibleHelperTest {

    @Test
    void shouldReturnEligibleMessage() {
        Citizen citizen = new Citizen("xyz", 18);
        VoterEligibleHelper eligibleHelper = new VoterEligibleHelper();
        String actual = eligibleHelper.checkEligibility(citizen);
        assertThat(actual).isEqualTo("Go for vote");
    }

    @Test
    void shouldReturnNotEligibleMessage() {
        Citizen citizen = new Citizen("xyz", 12);
        VoterEligibleHelper eligibleHelper = new VoterEligibleHelper();
        String actual = eligibleHelper.checkEligibility(citizen);
        assertThat(actual).isEqualTo("You are not eligible to vote");
    }
}