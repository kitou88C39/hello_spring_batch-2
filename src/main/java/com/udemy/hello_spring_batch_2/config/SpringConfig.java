package com.udemy.hello_spring_batch_2.config;

import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

// @Configurationアノテーションを付与する
@Configuration
public class SpringConfig {

    // JobLauncher/JobRepository/PlatformTransactionManagerのクラス変数及びコンストラクタによる設定を記載する
    private final JobLauncher jobLauncher;
    private final JobRepository jobRepository;
    private final PlatformTransactionManager transactionManager;

    // @Autowiredアノテーション、@Qualifierアノテーションを使用して、『HelloTasklet1』と名前がついたBeanのインスタンスを自動で注入する
    @Autowired
    @Qualifier("HelloTasklet1")
    private Tasklet helloTasklet1;

    public SpringConfig(JobLauncher jobLauncher, JobRepository jobRepository,
            PlatformTransactionManager transactionManager) {
        this.jobLauncher = jobLauncher;
        this.jobRepository = jobRepository;
        this.transactionManager = transactionManager;

    }
}
