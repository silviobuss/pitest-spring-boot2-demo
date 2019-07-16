package com.example.demo.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class MyServiceValidatorTest {

    @InjectMocks
    private MyServiceValidator myServiceValidator;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void fiftyReturnsTrue() {
        assertThat(myServiceValidator.isValid(50)).isTrue();
    }

    @Test
    public void twoHundredReturnsFalse() {
        assertThat(myServiceValidator.isValid(200)).isFalse();
    }

    @Test
    public void minus10ReturnsTrue() {
        assertThat(myServiceValidator.isValid(-10)).isFalse();
    }

    @Test
    public void hundredReturnsTrue() {
        assertThat(myServiceValidator.isValid(100)).isTrue();
    }

    @Test
    public void zeroReturnsFalse() {
        assertThat(myServiceValidator.isValid(0)).isFalse();
    }
}
