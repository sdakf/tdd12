package pl.sda.tddtraining;

import org.apache.commons.lang3.StringUtils;

public class StringCalculator {

    public static int adding(String data) {

        if (StringUtils.isBlank(data)) {
            return 0;
        }
        return Integer.parseInt(data.trim());
    }
}
