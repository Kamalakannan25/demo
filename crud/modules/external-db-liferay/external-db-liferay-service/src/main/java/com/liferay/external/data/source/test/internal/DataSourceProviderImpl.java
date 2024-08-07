package com.liferay.external.data.source.test.internal;

import com.liferay.portal.kernel.dao.jdbc.DataSourceFactoryUtil;
import com.liferay.portal.kernel.dao.jdbc.DataSourceProvider;

import java.util.Properties;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Component;

@Component(
	    immediate = true,
	    property = {
	        "data.source.name=extDataSource"
	    },
	    service = DataSourceProvider.class
	)

public class DataSourceProviderImpl implements DataSourceProvider {

	@Override
	public DataSource getDataSource() {
		try {
			System.out.println("Inside Data Source method....");
			
			Properties properties = new Properties();
            properties.setProperty("jdbc.ext.driverClassName", "com.mysql.cj.jdbc.Driver");
            properties.setProperty("jdbc.ext.password", "root");
            properties.setProperty("jdbc.ext.url", "jdbc:mysql://localhost/dxpseconddb?characterEncoding=UTF-8&dontTrackOpenResources=true&holdResultsOpenOverStatementClose=true&serverTimezone=GMT&useFastDateParsing=false&useUnicode=true");
            properties.setProperty("jdbc.ext.username", "root");
            return DataSourceFactoryUtil.initDataSource(properties);
		//	return DataSourceFactoryUtil.initDataSource(PropsUtil.getProperties("jdbc.ext.", true));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
