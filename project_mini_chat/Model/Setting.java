/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_mini_chat.Model;

import java.util.Date;

/**
 *
 * @author hoang
 */
public class Setting {
    private String ip;
    private String name;
    private int port;
    private String Messsage;
    private Date dateMess;
    
    

    public String getMesssage() {
        return Messsage;
    }

    public void setMesssage(String Messsage) {
        this.Messsage = Messsage;
    }

    public Setting(String ip, String name, int port, String Messsage) {
        this.ip = ip;
        this.name = name;
        this.port = port;
        this.Messsage = Messsage;
    }

    public Setting(String ip, String name, int port) {
        this.ip = ip;
        this.name = name;
        this.port = port;
    }

    public Setting() {
    }

    public Date getDateMess() {
        return dateMess;
    }

    public void setDateMess(Date dateMess) {
        this.dateMess = dateMess;
    }

    

    
    
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    
    
    
    
}
