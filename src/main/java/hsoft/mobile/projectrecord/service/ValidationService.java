package hsoft.mobile.projectrecord.service;

import java.util.List;

import hsoft.mobile.projectrecord.model.Validation;
import org.springframework.validation.Errors;


public interface ValidationService {

	/**
	 * 按类型固定长度正则表达式校验数据
	 * @param field 字段名
	 * @param value 字段值
	 * @param type 类型 number：只能数字；letters：只能字母；lettersumber 只能数字加字母；
	 * 				chinese：只能中文字符；char：数字加汉字；validation:任意类型
	 * @param size 长度
	 * @param e Spring from errors使用的校验结果
	 */
	void regex(String field, String value, String type, String size, Errors e);
	
	/**
	 * 按类型长度范围正则表达式校验数据
	 * @param field 字段名
	 * @param value 字段值
	 * @param type 类型 number：只能数字；letters：只能字母；lettersumber 只能数字加字母；
	 * 				chinese：只能中文字符；char：数字加汉字；validation:任意类型
	 * @param min 最小长度
	 * @param max 最大长度
	 * @param e Spring from errors 用校验结果
	 */
	void regex(String field, String value, String type, String min, String max, Errors e);
	
	/**
	 * 按类型固定长度正则表达式校验数据
	 * @param field 字段名
	 * @param value 字段值
	 * @param type 类型 number：只能数字；letters：只能字母；lettersumber 只能数字加字母；
	 * 				chinese：只能中文字符；char：数字加汉字；validation:任意类型
	 * @param size 长度
	 * @param nullable 可以为空的标志
	 * @param validations 使用的校验结果
	 */
	void verifyString(String field, Object value, String type, String size, boolean nullable,
                      List<Validation> validations);
	
	/**
	 * 字符串校验按类型长度范围正则表达式校验数据
	 * @param field 字段名
	 * @param value 字段值
	 * @param type 类型 number：只能数字；letters：只能字母；lettersumber 只能数字加字母；
	 * 				chinese：只能中文字符；char：数字加汉字；validation:任意类型
	 * @param min 最小长度
	 * @param max 最大长度
	 * @param nullable 可以为空的标志
	 * @param validations 使用的校验结果
	 */
	void verifyString(String field, Object value, String type, String min, String max,
                      boolean nullable, List<Validation> validations);
	
	/**
	 * 校验int类型
	 * @param field 字段名
	 * @param value 字段值
	 * @param min 最小值
	 * @param max 最大值
	 * @param nullable 可以为空的标志
	 * @param validations 使用的校验结果
	 */
	void verifyInt(String field, Object value, int min, int max,
                   boolean nullable, List<Validation> validations);

	/**
	 * 校验float类型
	 * @param field 字段名称
	 * @param value 字段值
	 * @param min 最小值
	 * @param max 最大值
	 * @param size 小数点位数
	 * @param nullable 是否可空
	 * @param validations 使用的校验结果
	 */
	void verifyFloat(String field, Object value, float min, float max, int size,
					 boolean nullable, List<Validation> validations);
}
