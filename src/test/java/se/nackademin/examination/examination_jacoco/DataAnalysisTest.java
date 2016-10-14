package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {

	DataAnalysis dataAnalysis = new DataAnalysis();
	@Test
	public void testBuildFinalString1() {
		//DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
				result.contains("The name of the homecity is big and the participant is 30 or older"));

	}
	
	@Test
	public void testBuildFinalString2() {
		//DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silv", "M", "31", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The first name is greater or equals in size to the last name and the participant older than 30' ",
				result.contains("The first name is greater or equals in size to the last name and the participant older than 30"));

	}
	
	@Test
	public void testBuildFinalString3() {
		//DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silvanen", "M", "30", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The first name is smaller or equals in size to the last name and the participant is 30 or younger' ",
				result.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));

	}
	
	@Test
	public void testBuildFinalString4a() {
		//DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silvanen", "M", "30", "Fort"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is small and the participant is 30 or older' ",
				result.contains("The name of the homecity is small and the participant is 30 or older"));

	}
	@Test
	public void testBuildFinalString4b() {
		//DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silvanen", "M", "31", "Fort"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'No analysis was performed' ",
				result.contains("No analysis was performed"));

	}
	@Test
	public void testBuildFinalString5() {
		//DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silvanen", "M", "29", "Fort"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is small and the participant is younger than 30' ",
				result.contains("The name of the homecity is small and the participant is younger than 30"));

	}
	@Test
	public void testBuildFinalString6() {
		//DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "29", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is younger than 30' ",
				result.contains("The name of the homecity is big and the participant is younger than 30"));

	}

}
