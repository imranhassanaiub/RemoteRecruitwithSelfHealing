package com.remoterecruit.pages;

public class JobPostCreationPage {
	public static class JobPostCreationModule {
		public static final String YourjobpostTab = "//div[normalize-space()='Your job posts']";
		public static final String AddJobBtn ="//div[@class='cursor-pointer w-[42px] md:w-12 h-[42px] md:h-12 bg-green-100 rounded-full flex justify-center items-center shrink-0']";
		public static final String JobpostTitle ="//input[@id='title']";
		public static final String LanguageRequired ="//input[@id='headlessui-combobox-input-13']";
		public static final String JobType ="//input[@id='headlessui-combobox-input-14']";
		public static final String HourlyRate ="//input[@id='exactHourlyRate']";
		public static final String AnnualRate ="//input[@id='exactAnnualSalary']";
		public static final String JobSkillTag ="//input[@id='headlessui-combobox-input-17']";
		public static final String JobDescription ="//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']";
		public static final String PostJobBtn ="//button[@aria-label='Post job,false button']";
	}
}
