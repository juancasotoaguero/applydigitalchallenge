package com.challengeApply.retriveArticlesApi.utils;

import com.challengeApply.retriveArticlesApi.utils.Utils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class UtilsTest {

    @Test
    public void testGetMonthNumberValidMonth() {
        Integer monthNumber = Utils.getMonthNumber("January");
        assertNotNull(monthNumber);
        assertEquals(1, monthNumber.intValue());
    }

    @Test
    public void testGetMonthNumberInvalidMonth() {
        Integer monthNumber = Utils.getMonthNumber("InvalidMonth");
        assertNull(monthNumber);
    }

    @Test
    public void testGetMonthNumberCaseInsensitive() {
        Integer monthNumber = Utils.getMonthNumber("february");
        assertNotNull(monthNumber);
        assertEquals(2, monthNumber.intValue());
    }
}