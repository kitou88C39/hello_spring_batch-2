package com.udemy.hello_spring_batch_2.config;

import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

public class SpringConfig {

    // @Configurationアノテーションを付与する
    @Configuration
    private final JobLauncher jobLauncher;
    private final JobRepository jobRepository;
    private final PlatformTransactionManager transactionManager;

    public SpringConfig(JobLauncher jobLauncher, JobRepository jobRepository,
            PlatformTransactionManager transactionManager) {
        this.jobLauncher = jobLauncher;
        this.jobRepository = jobRepository;
        this.transactionManager = transactionManager;

    }
}
