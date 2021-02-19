package com.examplegroup7.BloodManagementSystem.ResponseBody;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpcomingDrives_RespBody {
    private String name;
    private Integer contact;
    private Timestamp startTimestamp;
    private Timestamp endTimestamp;
    private String address;
    private String state;
    private String district;
    private Integer pincode;
    private List<String> bloodGroups;
}
