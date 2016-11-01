package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	/**
	 * 判断传入的日期类型的字符串是不是"yyyy-MM-dd"格式
	 * @param date
	 */
	public static boolean checkDateFormat(String str){
		try {
			if(null == str || "".equals(str)){
				return false;
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = (Date)sdf.parse(str);
			if(str.equals(sdf.format(date))){
				return true;
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}

}
