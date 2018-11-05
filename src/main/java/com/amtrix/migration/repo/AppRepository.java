package com.amtrix.migration.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amtrix.migration.model.App;

public interface AppRepository extends JpaRepository<App, Long> {

	
	
}
