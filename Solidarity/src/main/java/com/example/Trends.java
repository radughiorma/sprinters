package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Trends {

	@RequestMapping("trends/{keyword}")
	public ModelAndView getTrends(@PathVariable String keyword) throws IOException {
		ModelAndView model = new ModelAndView();

		URL url = new URL("https://ajax.googleapis.com/ajax/services/search/news?v=1.0&q=" + keyword);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

		String output;
		String response = "";
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			response = response + output + "\n";
		}

		conn.disconnect();
		model.setViewName("testt");
		model.addObject("lola", "Lola rulz!");
		model.addObject("response", response);

		return model;

	}
}
