package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Evgeny Baranov (evgeni.baranov@gmail.com)
* @version 1.0
* @since 0.1
*/

public class CalculateTest {
	/**
	* Test echo.
	*/
	@Test
public void whenTakeNameThenThreeEchoPlusName(){
	String input = "Evgeny Baranov";
	String expect = "Echo, echo, echo : Evgeny Baranov";
	Calculate calc = new Calculate();
	String result = calc.echo(input);
	assertThat(result, is(expect));
}

}