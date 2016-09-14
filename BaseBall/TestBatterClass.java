package BaseBall;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class TestBatterClass {

	@Test

	public void whenAtBats0_1() {
		ArrayList<Integer> basesEarned = new ArrayList<>(Arrays.asList(0, 1));
		BatterClass batter = new BatterClass("Test");

		batter.setBasesEarned(basesEarned);

		String average = batter.getFormatedBattingAverage();
		Assert.assertEquals("0.500", average);
	}

	@Test

	public void whenAtBats0_0() {
		ArrayList<Integer> basesEarned = new ArrayList<>(Arrays.asList(0, 0));
		BatterClass batter = new BatterClass("Test");

		batter.setBasesEarned(basesEarned);

		String average = batter.getFormatedBattingAverage();
		Assert.assertEquals("0.000", average);
	}

	@Test

	public void whenAtBats4_4_4() {
		ArrayList<Integer> basesEarned = new ArrayList<>(Arrays.asList(4, 4, 4));
		BatterClass batter = new BatterClass("Test");

		batter.setBasesEarned(basesEarned);

		String average = batter.getFormatedBattingAverage();
		Assert.assertEquals("1.000", average);
	}

	@Test

	public void whenAtBats0_1_2() {
		ArrayList<Integer> basesEarned = new ArrayList<>(Arrays.asList(0, 1, 2));
		BatterClass batter = new BatterClass("Test");

		batter.setBasesEarned(basesEarned);

		String average = batter.getFormatedBattingAverage();
		Assert.assertEquals("0.667", average);
	}

	@Test

	public void whenAtBats0_0_3_0() {
		ArrayList<Integer> basesEarned = new ArrayList<>(Arrays.asList(0, 0, 3, 0));
		BatterClass batter = new BatterClass("Test");

		batter.setBasesEarned(basesEarned);

		String average = batter.getFormatedBattingAverage();
		Assert.assertEquals("0.250", average);
	}

	@Test

	public void whenAtBats2_2_1_4() {
		ArrayList<Integer> basesEarned = new ArrayList<>(Arrays.asList(2, 2, 1, 4));
		BatterClass batter = new BatterClass("Test");

		batter.setBasesEarned(basesEarned);

		String average = batter.getFormatedBattingAverage();
		Assert.assertEquals("1.000", average);
	}

	@Test

	public void whenAtBats0_1_4_0_2_1_3_0_0() {
		ArrayList<Integer> basesEarned = new ArrayList<>(Arrays.asList(0, 1, 4, 0, 2, 1, 3, 0, 0));
		BatterClass batter = new BatterClass("Test");

		batter.setBasesEarned(basesEarned);

		String average = batter.getFormatedBattingAverage();
		Assert.assertEquals("0.556", average);
	}

	@Test

	public void whenAtBats0() {
		ArrayList<Integer> basesEarned = new ArrayList<>(Arrays.asList(0));
		BatterClass batter = new BatterClass("Test");

		batter.setBasesEarned(basesEarned);

		String average = batter.getFormatedBattingAverage();
		Assert.assertEquals("0.000", average);
	}

	@Test

	public void whenAtBats3() {
		ArrayList<Integer> basesEarned = new ArrayList<>(Arrays.asList(3));
		BatterClass batter = new BatterClass("Test");

		batter.setBasesEarned(basesEarned);

		String average = batter.getFormatedBattingAverage();
		Assert.assertEquals("1.000", average);
	}

	@Test

	public void sluggingAtBats0_0() {
		ArrayList<Integer> basesEarned = new ArrayList<>(Arrays.asList(0, 0));
		BatterClass batter = new BatterClass("Test");

		batter.setBasesEarned(basesEarned);
		String percentage = batter.getFormatedSluggingPercentage();
		Assert.assertEquals("0.000", percentage);
	}

	@Test

	public void sluggingAtBats0_1_2() {
		ArrayList<Integer> basesEarned = new ArrayList<>(Arrays.asList(0, 1, 2));
		BatterClass batter = new BatterClass("Test");

		batter.setBasesEarned(basesEarned);
		String percentage = batter.getFormatedSluggingPercentage();
		Assert.assertEquals("1.000", percentage);
	}
	
	@Test
	public void sluggingAtBats0_1() {
		ArrayList<Integer> basesEarned = new ArrayList<>(Arrays.asList(0, 1));
		BatterClass batter = new BatterClass("Test");

		batter.setBasesEarned(basesEarned);
		String percentage = batter.getFormatedSluggingPercentage();
		Assert.assertEquals("0.500", percentage);
	}
	@Test
	public void sluggingAtBats4_4_4() {
		ArrayList<Integer> basesEarned = new ArrayList<>(Arrays.asList(4,4,4));
		BatterClass batter = new BatterClass("Test");

		batter.setBasesEarned(basesEarned);
		String percentage = batter.getFormatedSluggingPercentage();
		Assert.assertEquals("4.000", percentage);
	}
	
	@Test
	public void sluggingAtBats0_0_3_0() {
		ArrayList<Integer> basesEarned = new ArrayList<>(Arrays.asList(0,0,3,0));
		BatterClass batter = new BatterClass("Test");

		batter.setBasesEarned(basesEarned);
		String percentage = batter.getFormatedSluggingPercentage();
		Assert.assertEquals("0.750", percentage);
	}
	
	@Test
	public void sluggingAtBats2_2_1_4() {
		ArrayList<Integer> basesEarned = new ArrayList<>(Arrays.asList(2,2,1,4));
		BatterClass batter = new BatterClass("Test");

		batter.setBasesEarned(basesEarned);
		String percentage = batter.getFormatedSluggingPercentage();
		Assert.assertEquals("2.250", percentage);
	}
	
	@Test
	public void sluggingAtBats0_1_4_0_2_1_3_0_0() {
		ArrayList<Integer> basesEarned = new ArrayList<>(Arrays.asList(0,1,4,0,2,1,3,0,0));
		BatterClass batter = new BatterClass("Test");

		batter.setBasesEarned(basesEarned);
		String percentage = batter.getFormatedSluggingPercentage();
		Assert.assertEquals("1.222", percentage);
	}
	
	@Test
	public void sluggingAtBats0() {
		ArrayList<Integer> basesEarned = new ArrayList<>(Arrays.asList(0));
		BatterClass batter = new BatterClass("Test");

		batter.setBasesEarned(basesEarned);
		String percentage = batter.getFormatedSluggingPercentage();
		Assert.assertEquals("0.000", percentage);
	}
	
	
	@Test
	public void sluggingAtBats3() {
		ArrayList<Integer> basesEarned = new ArrayList<>(Arrays.asList(3));
		BatterClass batter = new BatterClass("Test");

		batter.setBasesEarned(basesEarned);
		String percentage = batter.getFormatedSluggingPercentage();
		Assert.assertEquals("3.000", percentage);
	}
	
	
	
}
