package com.sentiment.bean;

import java.io.Serializable;
import java.util.Map;

import javax.faces.bean.ManagedBean;

import org.primefaces.model.chart.PieChartModel;

import com.sentiment.hz.client.HZClient;

@ManagedBean(name = "sentimentBean")
public class SentimentBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PieChartModel chart1997200;
	private PieChartModel chart20012004;
	private PieChartModel chart20052008;
	private PieChartModel chart20092012;

	public SentimentBean() {
		createPieModel19972000();
		createPieModel20012004();
		createPieModel20052008();
		createPieModel20092012();
	}
	

	public PieChartModel getChart1997200() {
		return chart1997200;
	}



	public void setChart1997200(PieChartModel chart1997200) {
		this.chart1997200 = chart1997200;
	}



	public PieChartModel getChart20012004() {
		return chart20012004;
	}



	public void setChart20012004(PieChartModel chart20012004) {
		this.chart20012004 = chart20012004;
	}



	public PieChartModel getChart20052008() {
		return chart20052008;
	}



	public void setChart20052008(PieChartModel chart20052008) {
		this.chart20052008 = chart20052008;
	}



	public PieChartModel getChart20092012() {
		return chart20092012;
	}



	public void setChart20092012(PieChartModel chart20092012) {
		this.chart20092012 = chart20092012;
	}



	private void createPieModel19972000() {
		chart1997200 = new PieChartModel();
		int positive=0;
		int negative=0;

		Map<String, String> map = HZClient.load19972000Map();
		for(String key: map.keySet()){
			if(map.get(key).contains("positive"))
				positive++;
			else
				negative++;
		}
		chart1997200.set("Negative", negative);
		chart1997200.set("Positive", positive);
	}

	private void createPieModel20012004() {
		chart20012004 = new PieChartModel();
		int positive=0;
		int negative=0;

		Map<String, String> map = HZClient.load20012004Map();
		for(String key: map.keySet()){
			if(map.get(key).contains("positive"))
				positive++;
			else
				negative++;
		}
		chart20012004.set("Negative", negative);
		chart20012004.set("Positive", positive);
	}
	
	private void createPieModel20052008() {
		chart20052008 = new PieChartModel();
		int positive=0;
		int negative=0;

		Map<String, String> map = HZClient.load20052008Map();
		for(String key: map.keySet()){
			if(map.get(key).contains("positive"))
				positive++;
			else
				negative++;
		}
		chart20052008.set("Negative", negative);
		chart20052008.set("Positive", positive);
	}
	
	private void createPieModel20092012() {
		chart20092012 = new PieChartModel();
		int positive=0;
		int negative=0;

		Map<String, String> map = HZClient.load20092012Map();
		for(String key: map.keySet()){
			if(map.get(key).contains("positive"))
				positive++;
			else
				negative++;
		}
		chart20092012.set("Negative", negative);
		chart20092012.set("Positive", positive);
	}
}
