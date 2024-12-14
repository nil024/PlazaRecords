package com.TollPlazaRecords.Model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ReqPay", namespace = "http://npci.org/etc/schema/")
public class ReqPay {

    private Head head;
    private Txn txn;
    private Plaza plaza;
    private Vehicle vehicle;
    private Payment payment;


    @XmlElement(name = "Head")
    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }
    
    @XmlElement(name = "Txn")
    public Txn getTxn() {
        return txn;
    }

    public void setTxn(Txn txn) {
        this.txn = txn;
    }

    @XmlElement(name = "Plaza")
    public Plaza getPlaza() {
        return plaza;
    }

    public void setPlaza(Plaza plaza) {
        this.plaza = plaza;
    }
    
    
    @XmlElement(name = "Vehicle")
    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    
    @XmlElement(name = "Payment")
    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
	


	// Inner class to map the Head element
    public static class Head {
        private String msgId;
        private String orgId;
        private String ts;

        @XmlAttribute(name = "msgId")
        public String getMsgId() {
            return msgId;
        }

        public void setMsgId(String msgId) {
            this.msgId = msgId;
        }

        @XmlAttribute(name = "orgId")
        public String getOrgId() {
            return orgId;
        }

        public void setOrgId(String orgId) {
            this.orgId = orgId;
        }

        @XmlAttribute(name = "ts")
        public String getTs() {
            return ts;
        }

        public void setTs(String ts) {
            this.ts = ts;
        }
    }
    
 
 // Inner class to map the Txn element
    public static class Txn {
        private String txnId;
        private String txnType;
        private String txnTs;

        @XmlAttribute(name = "id")
        public String getTxnId() {
            return txnId;
        }

        public void setTxnId(String txnId) {
            this.txnId = txnId;
        }

        @XmlAttribute(name = "type")
        public String getTxnType() {
            return txnType;
        }

        public void setTxnType(String txnType) {
            this.txnType = txnType;
        }

        @XmlAttribute(name = "ts")
        public String getTxnTs() {
            return txnTs;
        }

        public void setTxnTs(String txnTs) {
            this.txnTs = txnTs;
        }
    }
    
    
 // Inner class to map the Plaza element
    public static class Plaza {
        private String plazaId;
        private String plazaGeocode;
        private String plazaName;
        private String plazaSubtype;
        private String plazaType;
        private List<Lane> lanes;  // List of Lane elements

        @XmlAttribute(name = "id")
        public String getPlazaId() {
            return plazaId;
        }

        public void setPlazaId(String plazaId) {
            this.plazaId = plazaId;
        }

        @XmlAttribute(name = "geoCode")
        public String getPlazaGeocode() {
            return plazaGeocode;
        }

        public void setPlazaGeocode(String plazaGeocode) {
            this.plazaGeocode = plazaGeocode;
        }

        @XmlAttribute(name = "name")
        public String getPlazaName() {
            return plazaName;
        }

        public void setPlazaName(String plazaName) {
            this.plazaName = plazaName;
        }

        @XmlAttribute(name = "subtype")
        public String getPlazaSubtype() {
            return plazaSubtype;
        }

        public void setPlazaSubtype(String plazaSubtype) {
            this.plazaSubtype = plazaSubtype;
        }

        @XmlAttribute(name = "type")
        public String getPlazaType() {
            return plazaType;
        }

        public void setPlazaType(String plazaType) {
            this.plazaType = plazaType;
        }

        @XmlElement(name = "Lane")
        public List<Lane> getLanes() {
            return lanes;
        }

        public void setLanes(List<Lane> lanes) {
            this.lanes = lanes;
        }

        // Inner class to map the Lane element
        public static class Lane {
            private String laneId;
            private String laneDirection;
            private String laneReaderId;
            private String laneStatus;
            private String laneMode;
            private String laneType;

            @XmlAttribute(name = "id")
            public String getLaneId() {
                return laneId;
            }

            public void setLaneId(String laneId) {
                this.laneId = laneId;
            }

            @XmlAttribute(name = "direction")
            public String getLaneDirection() {
                return laneDirection;
            }

            public void setLaneDirection(String laneDirection) {
                this.laneDirection = laneDirection;
            }

            @XmlAttribute(name = "readerId")
            public String getLaneReaderId() {
                return laneReaderId;
            }

            public void setLaneReaderId(String laneReaderId) {
                this.laneReaderId = laneReaderId;
            }

            @XmlAttribute(name = "Status")
            public String getLaneStatus() {
                return laneStatus;
            }

            public void setLaneStatus(String laneStatus) {
                this.laneStatus = laneStatus;
            }

            @XmlAttribute(name = "Mode")
            public String getLaneMode() {
                return laneMode;
            }

            public void setLaneMode(String laneMode) {
                this.laneMode = laneMode;
            }

            @XmlAttribute(name = "laneType")
            public String getLaneType() {
                return laneType;
            }

            public void setLaneType(String laneType) {
                this.laneType = laneType;
            }
        }
    }
    
    public static class Vehicle {
        private String TID;
        private String tagId;
        private String wim;

        @XmlAttribute(name = "TID")
        public String getTID() {
            return TID;
        }

        public void setTID(String TID) {
            this.TID = TID;
        }

        @XmlAttribute(name = "tagId")
        public String getTagId() {
            return tagId;
        }

        public void setTagId(String tagId) {
            this.tagId = tagId;
        }

        @XmlAttribute(name = "wim")
        public String getWim() {
            return wim;
        }

        public void setWim(String wim) {
            this.wim = wim;
        }
    }
    
    
    //payment class
    public static class Payment {
        private Amount amount;

        @XmlElement(name = "Amount")
        public Amount getAmount() {
            return amount;
        }

        public void setAmount(Amount amount) {
            this.amount = amount;
        }

        public static class Amount {
            private String curr;
            private String value;
            private String priceMode;
            private String paymentMode;
            private String isOverWeightCharged;

            @XmlAttribute(name = "curr")
            public String getCurr() {
                return curr;
            }

            public void setCurr(String curr) {
                this.curr = curr;
            }

            @XmlAttribute(name = "value")
            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }

            @XmlAttribute(name = "PriceMode")
            public String getPriceMode() {
                return priceMode;
            }

            public void setPriceMode(String priceMode) {
                this.priceMode = priceMode;
            }

            @XmlAttribute(name = "PaymentMode")
            public String getPaymentMode() {
                return paymentMode;
            }

            public void setPaymentMode(String paymentMode) {
                this.paymentMode = paymentMode;
            }

            @XmlAttribute(name = "IsOverWeightCharged")
            public String getIsOverWeightCharged() {
                return isOverWeightCharged;
            }

            public void setIsOverWeightCharged(String isOverWeightCharged) {
                this.isOverWeightCharged = isOverWeightCharged;
            }
        }
    }


}
