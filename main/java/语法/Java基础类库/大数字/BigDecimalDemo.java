package 语法.Java基础类库.大数字;

import java.math.BigDecimal;


// 任意精度小数
public class BigDecimalDemo
{

	public static void main(String[] args)
	{
		// 构建时使用字符串更加精确
		BigDecimal decimal = new BigDecimal("0.001");
		// 使用bigDecimal进行常规的数学运算:+-*/
		System.out.println(decimal.add(new BigDecimal("0.0003")));
		System.out.println(decimal.divide(new BigDecimal("0.00001")));
	}

}
