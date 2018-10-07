package pl.sda.tddtraining;

import org.apache.commons.lang3.StringUtils;

public class StringCalculator {

    public static int adding(String data) {

        if (StringUtils.isBlank(data)) {
            return 0;
        }
        if (data.contains(",")) {
            String[] splitted = data.split(",");
            int sum = 0;
            for (String s : splitted) {
                if (StringUtils.isNotBlank(s)) {
                    sum = sum + Integer.parseInt(s.trim());
                }
            }
            return sum;
        }

        return Integer.parseInt(data.trim());

    }

}
