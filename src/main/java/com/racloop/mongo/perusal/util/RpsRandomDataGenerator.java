package com.racloop.mongo.perusal.util;

import com.racloop.mongo.perusal.entity.LoanEntity;
import com.racloop.mongo.perusal.entity.RpsEntity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class RpsRandomDataGenerator {
    private static final Random random = new Random();

    public static List<RpsEntity> generateData(int count) {
        List<RpsEntity> entities = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            RpsEntity entity = new RpsEntity();
            entity.setLoan_account_no(getRandomString(17));
            entity.setRps_id( generateId());
            entity.setInstallment_Number(random.nextDouble());
            entity.setSchedule_events(getRandomString(25));
            entity.setSchedule_Date(new Date());
            entity.setDays_between_installments(random.nextDouble());
            entity.setOpening_principal(random.nextDouble());
            entity.setInterest_rate(random.nextDouble());
            entity.setInstallment_amount(random.nextDouble());
            entity.setInstallment_amount_rounded(random.nextDouble());
            entity.setInterest_amount_scheduled(random.nextDouble());
            entity.setInterest_amount_rounded(random.nextDouble());
            entity.setInterest_amount_calculated(random.nextFloat());
            entity.setInterest_amount_received(random.nextDouble());
            entity.setInterest_amount_waived(random.nextDouble());
            entity.setPrincipal_amount_scheduled(random.nextDouble());
            entity.setPrincipal_amount_received(random.nextDouble());
            entity.setPrincipal_amount_writenoff(random.nextFloat());
            entity.setInstallment_received_Date(new Date());
            entity.setPrepayment_amount(random.nextDouble());
            entity.setPrepayment_Date(new Date());
            entity.setClosing_principal(random.nextDouble());
            entity.setInterest_amount_due_unpaid(random.nextDouble());
            entity.setPrincipal_amount_due_unpaid(random.nextDouble());
            entity.setInstallment_amount_diff(random.nextDouble());
            entity.setInterest_amount_diff(random.nextDouble());
            entity.setInterest_amount_diff_cumm(random.nextDouble());
            entity.setDue_generated(true);
            entity.setCreatedBy(getRandomString(25));
            entity.setCreatedDt(new Date());
            entity.setUpDateBy(getRandomString(25));
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
