package com.vimi.lai.com.vimi.lai;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class CSVApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext context;  
        JobParametersBuilder jobPara = new JobParametersBuilder();  //设置文件路径参数  
        context = new FileSystemXmlApplicationContext(new String[]{"classpath:csv-content.xml"});  
        String jobName = "ioSampleJob";  
        Job job = (Job)context.getBean(jobName);  
        JobLauncher launcher = (JobLauncher)context.getBean("jobLauncher");  
        JobExecution result = null;  
        try {  
          result = launcher.run(job, jobPara.toJobParameters());  
        } catch (JobExecutionAlreadyRunningException e) {  
            e.printStackTrace();  
        } catch (JobRestartException e) {  
            e.printStackTrace();  
        } catch (JobInstanceAlreadyCompleteException e) {  
            e.printStackTrace();  
        } catch (JobParametersInvalidException e) {  
            e.printStackTrace();  
        }  
        ExitStatus es = result.getExitStatus();  
        if(es.getExitCode().equals(ExitStatus.COMPLETED.getExitCode())) //任务正常完成  
        {  
            System.out.println("任务正常完成");  
        }  
        else  
        {  
            System.out.println("任务失败");  
        }  
    }
}
