package com.racloop.mongo.perusal.util;

import com.racloop.mongo.perusal.entity.AccountingEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class AccountingRandomDataGenerator {
    private static final Random random = new Random();

    public static List<AccountingEntity> generateData(int count) {
        List<AccountingEntity> entities = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            AccountingEntity entity = new AccountingEntity();
            entity.setLoan_account_no(getRandomString(20));
            entity.setAccounting_id(generateId());
            entity.setLinked_transaction_id(random.nextDouble());
            entity.setAccounting_event(getRandomString(15));
            entity.setAccounting_Date(new Date());
            entity.setValue_Date(new Date());
            entity.setTransaction_type(getRandomString(15));
            entity.setTransaction_desc(getRandomString(50));
            entity.setLedger_code(getRandomString(50));
            entity.setUser_branch(getRandomString(50));
            entity.setAccounting_branch(getRandomString(50));
            entity.setAccounting_code(getRandomString(50));
            entity.setAmount(random.nextInt(100));
            entity.setOld_link_transaction_id(random.nextInt(100));
            entity.setCreatedBy(getRandomString(30));
            entity.setCreatedDt(new Date());
            entity.setUpdateBy(getRandomString(30));
            entity.setUpDateDt(new Date());

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
    public static Long generateId() {
        // Generate the first 16 digits randomly
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            sb.append(rand.nextInt(10));
        }
        String first16Digits = sb.toString();

        // Calculate the last digit as the check digit using the Luhn algorithm
        int checkDigit = getLuhnCheckDigit(first16Digits);

        // Combine the first 16 digits and the check digit to form the complete 17-digit ID
        StringBuilder idBuilder = new StringBuilder(first16Digits);
        idBuilder.append(checkDigit);
        Long id = Long.valueOf(idBuilder.toString());
        return id;
    }

    public static int getLuhnCheckDigit(String digits) {
        // Luhn algorithm implementation to calculate the check digit
        int[] digitsArray = new int[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            digitsArray[i] = Character.getNumericValue(digits.charAt(i));
        }
        for (int i = digitsArray.length - 2; i >= 0; i -= 2) {
            int doubledDigit = digitsArray[i] * 2;
            digitsArray[i] = doubledDigit % 10 + doubledDigit / 10;
        }
        int sum = 0;
        for (int digit : digitsArray) {
            sum += digit;
        }
        int checkDigit = (10 - sum % 10) % 10;
        return checkDigit;
    }
}
