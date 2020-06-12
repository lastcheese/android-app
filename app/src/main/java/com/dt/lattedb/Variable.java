package com.dt.lattedb;

public class Variable {
    /*       Database 1       */
    private String user_id;
    private String  user_device_id;
    private String user_name;
    private int user_birthday;
    private int user_sex;
    private String user_email;
    private int user_phone_number;
    private int user_home_number;
    private String user_address1;
    private String user_address2;
    private int user_mail_number;
    private boolean user_message_agree;
    private boolean user_email_agree;

    /*       Database 2       */
    private String user_post_device_id;
    private int user_post_certification_number;
    private boolean user_password_check;

    public Variable() {

    }

    public void setUserInfo(String user_id, String user_device_id, String user_name, int user_birthday, int user_sex, String user_email,
                             int user_phone_number, int user_home_number, String user_address1, String user_address2, int user_mail_number,
                             boolean user_message_agree, boolean user_email_agree) {
        if(user_id != null)
            this.user_id = user_id;
        else
            this.user_id = null;
        if(user_device_id != null)
            this.user_device_id = user_device_id;
        else
            this.user_device_id = null;
        if(user_name != user_name)
            this.user_name = user_name;
        else
            this.user_name = null;
        if(user_birthday != 0)
            this.user_birthday = user_birthday;
        else
            this.user_birthday = 0;
        if(user_sex != 0)
            this.user_sex = user_sex;
        else
            this.user_sex = 0;
        if(user_email != null)
            this.user_email = user_email;
        else
            this.user_email = null;
        if(user_phone_number != 0)
            this.user_phone_number = user_phone_number;
        else
            this.user_phone_number = 0;
        if(user_home_number != 0)
            this.user_home_number = user_home_number;
        else
            this.user_home_number = 0;
        if(user_address1 != null)
            this.user_address1 = user_address1;
        else
            this.user_address1 = null;
        if(user_address2 != null)
            this.user_address2 = user_address2;
        else
            this.user_address2 = null;
        if(user_mail_number != 0)
            this.user_mail_number = user_mail_number;
        else
            this.user_mail_number = 0;
        this.user_message_agree = user_message_agree;
        this.user_email_agree = user_email_agree;
    }

    public String getUserId() {
        return user_id;
    }

    public Boolean getUserMessageAgree() {
        return user_message_agree;
    }

    public Boolean getUserEmailAgree() {
        return user_email_agree;
    }
}
