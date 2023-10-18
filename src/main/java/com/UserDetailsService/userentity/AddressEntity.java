package com.UserDetailsService.userentity;
import javax.persistence.*;


@Entity
@Table(name="address_data")
public class AddressEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ADDRESS_ID")
    private Long addressId;


    @Column(name="LANE1")
    private String lane1;

    @Column(name="LANE2")
    private String lane2;

    @Column(name="STREET_NAME")
    private String streetName;

    @Column(name="DOOR_NO")
    private String doorNo;

    @Column(name="STATE")
    private String state;

    @Column(name="PINCODE")
    private String pincode;


    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }


    public String getLane1() {
        return lane1;
    }

    public void setLane1(String lane1) {
        this.lane1 = lane1;
    }

    public String getLane2() {
        return lane2;
    }

    public void setLane2(String lane2) {
        this.lane2 = lane2;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }



}
