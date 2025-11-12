package com.xworkz.keyboard.dto;

public class LibraryDto {
    private int totalBooks;
    private long libraryId;
    private float openHours;
    private double areaSize;
    private char categoryCode;
    private boolean isDigital;

    private String libraryName;
    private Integer staffCount;
    private Float membershipFee;
    private Double annualBudget;
    private Boolean hasCafeteria;
    private Character ratingGrade;
    private Long registrationCode;

    public LibraryDto(int totalBooks, long libraryId, float openHours, double areaSize, char categoryCode, boolean isDigital,
                      String libraryName, Integer staffCount, Float membershipFee, Double annualBudget,
                      Boolean hasCafeteria, Character ratingGrade, Long registrationCode) {

        this.totalBooks = totalBooks;
        this.libraryId = libraryId;
        this.openHours = openHours;
        this.areaSize = areaSize;
        this.categoryCode = categoryCode;
        this.isDigital = isDigital;
        this.libraryName = libraryName;
        this.staffCount = staffCount;
        this.membershipFee = membershipFee;
        this.annualBudget = annualBudget;
        this.hasCafeteria = hasCafeteria;
        this.ratingGrade = ratingGrade;
        this.registrationCode = registrationCode;
    }

    public void setTotalBooks(int totalBooks) {
        this.totalBooks = totalBooks;
    }

    public int getTotalBooks() {
        return totalBooks;
    }

    public void setLibraryId(long libraryId) {
        this.libraryId = libraryId;
    }

    public long getLibraryId() {
        return libraryId;
    }

    public void setOpenHours(float openHours) {
        this.openHours = openHours;
    }

    public float getOpenHours() {
        return openHours;
    }

    public void setAreaSize(double areaSize) {
        this.areaSize = areaSize;
    }

    public double getAreaSize() {
        return areaSize;
    }

    public void setCategoryCode(char categoryCode) {
        this.categoryCode = categoryCode;
    }

    public char getCategoryCode() {
        return categoryCode;
    }

    public void setDigital(boolean isDigital) {
        this.isDigital = isDigital;
    }

    public boolean isDigital() {
        return isDigital;
    }

    public void setAnnualBudget(Double annualBudget) {
        this.annualBudget = annualBudget;

    }

    public Double getAnnualBudget() {
        return annualBudget;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setStaffCount(Integer staffCount) {
        this.staffCount = staffCount;
    }

    public Integer getStaffCount() {
        return staffCount;
    }

    public void setMembershipFee(Float membershipFee) {
        this.membershipFee = membershipFee;
    }

    public Float getMembershipFee() {
        return membershipFee;
    }

    public void setHasCafeteria(Boolean hasCafeteria) {
        this.hasCafeteria = hasCafeteria;
    }

    public Boolean getHasCafeteria() {
        return hasCafeteria;
    }

    public void setRatingGrade(Character ratingGrade) {
        this.ratingGrade = ratingGrade;
    }

    public Character getRatingGrade() {
        return ratingGrade;
    }

    public void setRegistrationCode(Long registrationCode) {
        this.registrationCode = registrationCode;
    }

    public Long getRegistrationCode() {
        return registrationCode;
    }

    @Override
    public String toString() {
        return "Library[totalBooks = " + totalBooks + ",libraryId = " + libraryId + ",open hours = " + openHours + ",area size = " + areaSize + ",category code =" + categoryCode + "," +
                "isDigital = " + isDigital+",libraryName ="+libraryName+",staffCount = "+staffCount+",membershipFree = "+membershipFee+",annualBudget = "+annualBudget+",hasCafeteria = "+hasCafeteria+",rating Grade ="+ratingGrade+",registration code ="+registrationCode+"]";
    }

    public int hashCode() {
        int primenumber = 13;
        int result = 1;
        result = primenumber * result + totalBooks;
        result = primenumber * result + staffCount;

        result = primenumber * result + ((libraryName== null) ? null : libraryName.hashCode());

        return result;


    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(this instanceof Object)) {
            return false;
        }
        LibraryDto libraryDto = (LibraryDto) obj;
        return this.totalBooks== libraryDto.totalBooks && (this.libraryName == null ? libraryDto.libraryName == null : this.libraryName.equals(libraryDto.libraryName));
    }

}
