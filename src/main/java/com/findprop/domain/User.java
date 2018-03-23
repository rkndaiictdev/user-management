package com.findprop.domain;

import com.findprop.common.annotation.ColumnAnnotation;
import org.apache.commons.lang.builder.ToStringBuilder;

public class User {

    @ColumnAnnotation(name = "user_name")
    private String userName;

    @ColumnAnnotation(name = "email_id")
    private String emailId;

    @ColumnAnnotation(name = "phone_number")
    private String phoneNumber;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("userName", userName)
                .append("emailId", emailId)
                .append("phoneNumber", phoneNumber)
                .toString();
    }
}
