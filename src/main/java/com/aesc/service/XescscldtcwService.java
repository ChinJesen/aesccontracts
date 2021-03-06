/**  
 * Project Name:aescContract  
 * File Name:XescscldtcwService.java  
 * Package Name:com.aesc.service  
 * Date:2017年8月17日下午1:33:38  
 * Copyright (c) 2017, smolky7@gmail.com All Rights Reserved.  
 *  
*/  
  
package com.aesc.service;

import java.util.List;

import com.aesc.pojo.Xescscldtcw;

/**  
 * ClassName:XescscldtcwService <br/>  
 * Function:  ADD FUNCTION. <br/>  
 * Reason:    ADD REASON. <br/>  
 * Date:     2017年8月17日 下午1:33:38 <br/>  
 * @author   Dawn Chen  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */
public interface XescscldtcwService {

  /**
   * 方法名称: saveXescscdxtcw ；
   * 方法描述:  :   ；
   * 返回类型: void ；
   * 作者：Dawn Chen  ；
   * 时间：2017年8月17日 下午1:34:59；
   * @throws
   */
  void saveXescscdxtcw(Xescscldtcw xescscldtcw);

  /**
   * 方法名称: queryXescscldtcw ；
   * 方法描述:  :   ；
   * 返回类型: List<Xescscldtcw> ；
   * 作者：Dawn Chen  ；
   * 时间：2017年8月17日 下午1:35:03；
   * @throws
   */
  List<Xescscldtcw> queryXescscldtcw();

  /**
   * 方法名称: queryXescscldtcwById ；
   * 方法描述:  :   ；
   * 返回类型: Xescscldtcw ；
   * 作者：Dawn Chen  ；
   * 时间：2017年8月17日 下午1:35:07；
   * @throws
   */
  Xescscldtcw queryXescscldtcwById(int contract_id);

  /**
   * 方法名称: updateXescscldtcw ；
   * 方法描述:  :   ；
   * 返回类型: boolean ；
   * 作者：Dawn Chen  ；
   * 时间：2017年11月9日 下午9:06:10；
   * @throws
   */
  boolean updateXescscldtcw(Xescscldtcw xescscldtcw);

}
