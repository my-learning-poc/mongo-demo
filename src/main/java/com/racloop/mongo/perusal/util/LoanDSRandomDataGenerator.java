package com.racloop.mongo.perusal.util;

import com.racloop.mongo.perusal.entity.LoanDataStoreEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class LoanDSRandomDataGenerator {

    private static final Random random = new Random();

    public static List<LoanDataStoreEntity> generateData(int count) {
        List<LoanDataStoreEntity> entities = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            LoanDataStoreEntity entity = new LoanDataStoreEntity();
            entity.setLoanNumber(getRandomString(20));
            entity.setAnnualInterestRate(getRandomInterestRate());
            entity.setActive(random.nextBoolean());
            entity.setSanctionAmount(getRandomSanctionAmount());
            entity.setTimePeriodInYear(random.nextInt(10));
            entity.setCreationDate(new Date());

            entities.add(entity);
        }
        return entities;
    }

    private static String getRandomString(int targetStringLength) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
//        int targetStringLength = 10;
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    private static float getRandomInterestRate(){
        float randomFloat = random.nextFloat() * 100;
        return Math.round(randomFloat * 10) / 10f;
    }
    private static double getRandomSanctionAmount(){
        double randomValue = 10000 + (random.nextDouble() * 90000);
        randomValue = Math.round(randomValue * 100.0) / 100.0;
        return randomValue;
    }
}
