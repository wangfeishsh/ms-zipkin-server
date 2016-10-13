package com.bao;

import com.bao.zipkin.storage.mysql.MySQLStorage;
import org.jooq.impl.DefaultExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadataProviders;
import org.springframework.context.annotation.Bean;
import zipkin.server.EnableZipkinServer;
import zipkin.storage.InMemoryStorage;
import zipkin.storage.StorageComponent;
import zipkin.storage.jdbc.JDBCStorage;

import javax.sql.DataSource;
import java.util.concurrent.Executor;

@SpringBootApplication
@EnableZipkinServer
//@EnableZipkinStreamServer
public class MsZipkinServerApplication {

	@Autowired
	DataSource dataSource;

	@Bean
	public StorageComponent storageComponent(){
		return MySQLStorage.builder().datasource(dataSource).executor(new DefaultExecutor()).build();
//		return MySQLStorage.builder().build();
	}

	public static void main(String[] args) {
		SpringApplication.run(MsZipkinServerApplication.class, args);
	}
}
