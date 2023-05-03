package com.racloop.mongo.perusal.util;

import com.racloop.mongo.perusal.entity.TransactionEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class TransactionRandomDataGenerator {
    private static final Random random = new Random();

    public static List<TransactionEntity> generateData(int count) {
        List<TransactionEntity> entities = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            TransactionEntity entity = new TransactionEntity();
            entity.setLoan_account_no(getRandomString(17));
            entity.setTransaction_id( generateId());
            entity.setTransaction_type(getRandomString(25));
            entity.setTransaction_desc(getRandomString(50));
            entity.setTransaction_ref_id(getRandomString(17));
            entity.setTransaction_Date(new Date());
            entity.setTransaction_value_Date(new Date());
            entity.setTransaction_amount(random.nextDouble());
            entity.setTransaction_code(random.nextDouble());
            entity.setTransaction_remarks(getRandomString(50));
            entity.setTransaction_status(getRandomString(25));
            entity.setOutstanding_principal(random.nextDouble());
            entity.setOutstanding_principal_paid(random.nextFloat());
            entity.setDue_amount(random.nextDouble());
            entity.setDue_amount_principal(random.nextDouble());
            entity.setDue_amount_interest(random.nextDouble());
            entity.setDue_amount_other_charges(random.nextDouble());
            entity.setDue_amount_overdue_penal(random.nextFloat());
            entity.setDue_amount_paid(random.nextDouble());
            entity.setDue_amount_principal_paid(random.nextDouble());
            entity.setDue_amount_interest_paid(random.nextDouble());
            entity.setDue_amount_overdue_penal_paid(random.nextDouble());
            entity.setDue_amount_other_charges(random.nextDouble());
            entity.setExcess_amount(random.nextDouble());
            entity.setTotal_outstanding(random.nextDouble());
            entity.setOld_link_transaction_id(random.nextDouble());
            entity.setCreatedBy(getRandomString(25));
            entity.setCreatedDt(new Date());
            entity.setUpDateBy(getRandomString(25));
            entity.setUpDateDt(new Date());
            entities.add(entity);
        }

        return entities;
    }

    private static String getRandomString( int targetStringLength) {
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

    public static String generateId() {
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
        String id = idBuilder.toString();
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
