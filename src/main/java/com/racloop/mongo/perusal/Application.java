package com.racloop.mongo.perusal;

import com.racloop.mongo.perusal.entity.*;
import com.racloop.mongo.perusal.repository.*;
import com.racloop.mongo.perusal.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Application {
	@Autowired
	private LoanRepository loanRepository;
	@Autowired
	private RpsRepository rpsRepository;
	@Autowired
	private TransactionRepository transactionRepository;
	@Autowired
	private AccountingRepository accountingRepository;
	@Autowired
	private LoanDSRepository loanDSRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/*

		Disable comment to Genrate data in MongodB for Collection "Loan"

	*/

//	@Bean
//	public CommandLineRunner loanInsertData() {
//		return args -> {
//			for (int i = 0; i < 10; i++) {
//				List<LoanEntity> entities = LoanRandomDataGenerator.generateData(99999);
//				loanRepository.saveAll(entities);
//
//			}
//
//		};
//	}

	/*

		Disable comment to Generate data in MongodB for Collection "Rps"

	*/

//		@Bean
//	public CommandLineRunner rpsInsertData() {
//			return args -> {
//				for (int i = 0; i < 100; i++) {
//					List<RpsEntity> entities = RpsRandomDataGenerator.generateData(99999);
//					rpsRepository.saveAll(entities);
//
//				}
//
//			};
//		}

	/*

		Disable comment to Generate data in MongodB for Collection "Transaction"

	*/
//	@Bean
//	public CommandLineRunner TransactionInsertData() {
//		return args -> {
//			for (int i = 0; i < 100; i++) {
//				List<TransactionEntity> entities = TransactionRandomDataGenerator.generateData(99999);
//				transactionRepository.saveAll(entities);
//
//			}
//
//		};
//
//	}

		/*

		Disable comment to Generate data in MongodB for Collection "Transaction"

	*/

//	@Bean
//	public CommandLineRunner AccountingInsertData() {
//		return args -> {
//			for (int i = 0; i < 100; i++) {
//				List<AccountingEntity> entities = AccountingRandomDataGenerator.generateData(99999);
//				accountingRepository.saveAll(entities);
//
//			}
//
//		};
//
//	}

		/*

		Disable comment to Generate data in MongodB for Collection "loan_ds"

	*/

	/*@Bean
	public CommandLineRunner AccountingInsertData() {
		return args -> {
			for (int i = 0; i < 100; i++) {
				List<LoanDataStoreEntity> entities = LoanDSRandomDataGenerator.generateData(99999);
				loanDSRepository.saveAll(entities);

			}

		};

	}*/

}
