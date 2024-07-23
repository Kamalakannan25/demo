package com.object.util;

import com.object.constant.Constants;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpConnectionUtil {

	public static String getUrl(String baseUrl, String addOnUrl) throws IOException {
		System.out.println("Inside getURL method>>>>>>>>> ");
		HttpGet request = new HttpGet(baseUrl + addOnUrl);
		request.addHeader(Constants.AUTHORIZATION_HEADER,
				"Basic dGVzdEBsaWZlcmF5LmNvbToxMjM0");

		try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
			HttpEntity httpEntity = httpClient.execute(request).getEntity();
			return httpEntity != null ? EntityUtils.toString(httpEntity) : null;
		}
	}
}
