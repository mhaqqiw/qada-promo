package com.qada.service.model;

public class Promo {
  private String promoCode;
  private String promoOrg;
  private int promoType;
  private String startDate;
  private String endDate;
  private String promoLink;
  private String promoDesc;

  public String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  public String getPromoOrg() { return promoOrg; }

  public void setPromoOrg(String promoOrg) { this.promoOrg = promoOrg; }

  public int getPromoType() { return promoType; }

  public void setPromoType(int promoType) { this.promoType = promoType; }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public String getPromoLink() {
    return promoLink;
  }

  public void setPromoLink(String promoLink) {
    this.promoLink = promoLink;
  }

  public String getPromoDesc() {
    return promoDesc;
  }

  public void setPromoDesc(String promoDesc) {
    this.promoDesc = promoDesc;
  }
}
