package com.vimi.lai.tasklet;

import java.util.Map;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.configuration.JobLocator;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.NoSuchJobException;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.scheduling.quartz.QuartzJobBean;


public class JobLauncherDetails extends QuartzJobBean {
	  static final String JOB_NAME = "jobName";

	  private JobLocator jobLocator;

	  private JobLauncher jobLauncher;

	public void setJobLocator(JobLocator jobLocator) {
		this.jobLocator = jobLocator;
	}

	public void setJobLauncher(JobLauncher jobLauncher) {
		this.jobLauncher = jobLauncher;
	}


	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		@SuppressWarnings("unchecked")
		Map<String, Object> jobDataMap = arg0.getMergedJobDataMap();

		String jobName = (String) jobDataMap.get(JOB_NAME);
		JobParametersBuilder builder = new JobParametersBuilder();
		JobParameters jobParameters =builder.toJobParameters(); ;
		try {
			jobLauncher.run(jobLocator.getJob(jobName), jobParameters);
		} catch (JobExecutionAlreadyRunningException | JobRestartException
				| JobInstanceAlreadyCompleteException
				| JobParametersInvalidException | NoSuchJobException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
