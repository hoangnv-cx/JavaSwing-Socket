/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_mini_chat.Util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hoang
 */
public class FormatDate {
    public String getDate(Date date) {
		 SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		 String strDate = formatter.format(date);
		 return strDate;
	}
}
