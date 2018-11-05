package com.amtrix.migration;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.amtrix.migration.model.App;
import com.amtrix.migration.repo.AppRepository;

@SpringBootApplication
public class MigrationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MigrationApplication.class, args);
	}

	@Autowired
	AppRepository appRepo;

	public void run(String... args) throws Exception {

		Calendar d = Calendar.getInstance();
		App a = new App("R1", "DUBAI", "Running", "Map1", new Date(2018, 05, 01), new Date(2018, 05, 02));
		App a1 = new App("R1", "ASIA", "Closed", "Map2", null,null);
		App a2 = new App("R1", "DUBAI", "Running", "Ma0p31", null,null);
		App a3 = new App("R2", "EUROPE", "Completed", "Map41", new Date(2018, 05, 05), new Date(2018, 05, 06));
		App a4 = new App("R2", "DUBAI", "Running", "Map51", new Date(2018, 05, 01),null);
		App a5 = new App("R2", "DUBAI", "Completed", "Map61", new Date(2018, 05, 10), new Date(2018, 05, 10));
		App a6 = new App("R3", "EUROPE", "Closed", "Map71", null, null);
		App a7 = new App("R4", "DUBAI", "Completed", "Map81",  new Date(2018, 05, 10), new Date(2018, 05, 20));
		App a8 = new App("R4", "EUROPE", "Running", "Map91", null,null);
		App a9 = new App("R5", "ASIA", "Completed", "Map01",  new Date(2018, 05, 10), new Date(2018, 05, 150));
		App a10 = new App("R6", "EUROPE", "Closed", "Map10", null, null);
		App a11 = new App("R5", "DUBAI", "Closed", "Map100",  null, null);

		List<App> appList = new ArrayList<>();
		appList.add(a1);
		appList.add(a2);
		appList.add(a3);
		appList.add(a4);
		appList.add(a5);
		appList.add(a6);
		appList.add(a7);
		appList.add(a8);
		appList.add(a9);
		appList.add(a10);
		appList.add(a11);

		appRepo.saveAll(appList);

	}
}
