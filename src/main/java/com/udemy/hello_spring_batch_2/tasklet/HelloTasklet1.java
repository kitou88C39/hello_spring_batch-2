package com.udemy.hello_spring_batch_2.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.stereotype.Component;

//@Componentアノテーションによって、Spring Beanとして登録される

@Component("Hello Tasklet1")
// StepScopeアノテーションによって、インスタンスをステップごとに生成・破棄する
@StepScope
// Tasklet インターフェイスexecuteメソッドを実装する
public class HelloTasklet1 implements Tasklet {

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        System.out.println("Hello Tasklet1!!!");
        // RepeatStatus.FINISHEDは、executeメソッドが正常終了したことを示す
        return RepeatStatus.FINISHED;
    }
}
