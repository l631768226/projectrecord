package hsoft.mobile.projectrecord.service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import hsoft.mobile.projectrecord.model.Validation;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;


@Service
public class ValidationServiceImpl implements ValidationService{
	
	/**
	 * 按类型固定长度正则表达式校验数据
	 * @param field 字段名
	 * @param value 字段值
	 * @param type 类型 number：只能数字；letters：只能字母；letters.number 只能数字加字母；
	 * 				chinese：只能中文字符；char：数字加汉字；validation:任意类型
	 * @param size 长度
	 * @return 正确返回true，错误返回false
	 */
	private boolean regex(String field, String value, String type, String size){
		String st_regex = "";
		switch(type){
			case "number" :
				st_regex = "^\\d{"+size+"}$";
				break;
			case "letters":
				st_regex = "^[A-Za-z]{"+size+"}";
				break;
			case "letters.number":
				st_regex = "^\\w{"+size+"}";
				break;
			case "chinese":
				st_regex = "^[\\u4e00-\\u9fa5]{"+size+"}";
				break;
			case "char":
				st_regex = "^[\\u4e00-\\u9fa5\\w{"+size+"}]";
				break;
			case "validation":
				st_regex = "^.{"+size+"}";
				break;
		}
		return regex(value, st_regex);
	}
	
	/**
	 * 按类型固定长度正则表达式校验数据
	 * @param field 字段名
	 * @param value 字段值
	 * @param type 类型 number.n：只能数字；letters.n：只能字母；letters.number.n 只能数字加字母；
	 * 				chinese.n：只能中文字符；char.n：数字加汉字；validation.n:任意类型
	 * @param min 最小长度
	 * @param max 最大长度
	 * @return 正确返回true，错误返回false
	 */
	private boolean regex(String field, String value, String type, String min, String max){
		String st_regex = "";
		switch(type){
			case "number" :
				st_regex = "^\\d{"+min+","+max+"}$";
				break;
			case "letters":
				st_regex = "^[A-Za-z]{"+min+","+max+"}";
				break;
			case "letters.number":
				st_regex = "^\\w{"+min+","+max+"}";
				break;
			case "chinese":
				st_regex = "^[\\u4e00-\\u9fa5]{"+min+","+max+"}";
				break;
			case "char":
				st_regex = "^[\\u4e00-\\u9fa5\\w]{"+min+","+max+"}";
				break;
			case "validation":
				st_regex = "^.{"+min+","+max+"}";
				break;
		}
		return regex(value, st_regex);
	}
	
	/**
	 * 执行正则表达式校验
	 * @param value 值
	 * @param st_regex 表达式
	 * @return 正确返回true， 错误返回false
	 */
	private boolean regex(String value, String st_regex){
		Pattern pattern = Pattern.compile(st_regex);
		Matcher matcher = pattern.matcher(value);
		return matcher.matches();
	}

	@Override
	public void regex(String field, String value, String type, String size, Errors e) {
		String[] errorarg = {size};
		if(regex(field,value,type,size) == false){
			e.rejectValue(field, type, errorarg, "");
		}
	}

	@Override
	public void regex(String field, String value, String type, String min, String max, Errors e) {
		String[] errorarg = {min , max};
		if(regex(field, value, type, min, max) == false){
			e.rejectValue(field, type, errorarg, "");
		}
	}

	@Override
	public void verifyString(String field, Object value, String type, String size, boolean nullable,
			List<Validation> validations) {
		if(value == null || "".equals(value.toString().trim())){
			if(!nullable){
				validations.add(new Validation(field , "必须填写"));
			}
		}else{
			if(regex(field, value.toString(), type, size) == false){
				String st_message = "";
				switch(type){
				case "number" :
					st_message = "只能输入"+size+"位数字";
					break;
				case "letters":
					st_message = "只能输入"+size+"位字母";
					break;
				case "letters.number":
					st_message = "只能输入"+size+"位的数字和字母";
					break;
				case "chinese":
					st_message = "只能输入"+size+"个汉字";
					break;
				case "char":
					st_message = "只能输入"+size+"个文字";
					break;
				case "validation":
					st_message = "只能输入"+size+"位文字";
					break;
				}
				validations.add(new Validation(field , st_message));
			}
		}
	}

	@Override
	public void verifyString(String field, Object value, String type, String min, String max, boolean nullable,
			List<Validation> validations) {
		if(value == null || "".equals(value.toString().trim())){
			if(!nullable){
				validations.add(new Validation(field , "必须填写"));
			}
		}else{
			if(regex(field, value.toString(), type, min, max) == false){
				String st_message = "";
				switch(type){
				case "number" :
					st_message = "只能输入"+min+"到"+max+"位数字";
					break;
				case "letters":
					st_message = "只能输入"+min+"到"+max+"位字母";
					break;
				case "letters.number":
					st_message = "只能输入"+min+"到"+max+"位的数字和字母";
					break;
				case "chinese":
					st_message = "只能输入"+min+"到"+max+"个汉字";
					break;
				case "char":
					st_message = "只能输入"+min+"到"+max+"个文字";
					break;
				case "validation":
					st_message = "只能输入"+min+"到"+max+"位文字";
					break;
				}
				validations.add(new Validation(field , st_message));
			}
		}
	}

	@Override
	public void verifyInt(String field, Object value, int min, int max, boolean nullable,
			List<Validation> validations) {
		if(value == null || "".equals(value.toString().trim())){
			if(!nullable){
				validations.add(new Validation(field , "必须填写"));
			}
		}else{
			String st_data = value.toString();
			String st_regEx = "^-?[0-9]\\d*$";
			Pattern p =Pattern.compile(st_regEx);
			Matcher m = p.matcher(st_data);
			if(!m.matches()){
				validations.add(new Validation(field, "只能输入介于"+min+"到"+max+"之间的整数"));
			}else{
				value = Integer.parseInt(st_data);
				if((int)value < min || (int)value > max){
					validations.add(new Validation(field, "只能输入介于"+min+"到"+max+"之间的整数"));
				}
			}
		}
	}

	@Override
	public void verifyFloat(String field, Object value, float min, float max, int size,
							boolean nullable, List<Validation> validations) {
		if(value == null || "".equals(value.toString().trim())){
			if(!nullable){
				validations.add(new Validation(field,"必须填写"));
			}
		}else{
			if(size < 0){
				validations.add(new Validation(field, "校验函数使用错误，请检查代码"));
			}else{
				String st_data = value.toString();
				String st_regEx = "^(-?\\d+)(\\.\\d{0,"+ size +"})?$";
				Pattern p =Pattern.compile(st_regEx);
				Matcher m = p.matcher(st_data);
				if(!m.matches()){
					validations.add(new Validation(field, "只能输入至多" + size + "位的浮点数"));
				}else{
					value = Float.parseFloat(st_data);
					if((float)value < min || (float)value > max){
						validations.add(new Validation(field,
								"只能输入介于" + min + "到" + max + "之间的浮点数"));
					}
				}
			}
		}
	}

}
