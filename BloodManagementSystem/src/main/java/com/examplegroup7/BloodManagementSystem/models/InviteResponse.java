package com.examplegroup7.BloodManagementSystem.models;

public class InviteResponse {
    private String eventId;
    private String userId;
    private String eventType;
    private boolean donationStatus;
    private int acceptance;
    private String RejectionMessage;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public boolean isDonationStatus() {
        return donationStatus;
    }

    public void setDonationStatus(boolean donationStatus) {
        this.donationStatus = donationStatus;
    }

    public int getAcceptance() {
        return acceptance;
    }

    public void setAcceptance(int acceptance) {
        this.acceptance = acceptance;
    }

    public String getRejectionMessage() {
        return RejectionMessage;
    }

    public void setRejectionMessage(String rejectionMessage) {
        RejectionMessage = rejectionMessage;
    }


    @Override
    public String toString() {
        return "InviteResponse{" +
                "eventId='" + eventId + '\'' +
                ", userId='" + userId + '\'' +
                ", eventType='" + eventType + '\'' +
                ", donationStatus=" + donationStatus +
                ", acceptance=" + acceptance +
                ", RejectionMessage='" + RejectionMessage + '\'' +
                '}';
    }
}
