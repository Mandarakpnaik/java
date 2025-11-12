package com.xworkz.keyboard.dto;

public class BookDto {
    private int totalPages;
    private long isbnNumber;
    private float price;
    private double weight;
    private char bookType;
    private boolean isAvailable;



    private String author;

    private Integer publicationYear;
    private Float rating;
    private Double discount;
    private Boolean isEbook;
    private Character category;
    private Long accessionNumber;
    public BookDto( int totalPages, long isbnNumber, float price, double weight, char bookType, boolean isAvailable,
                String author, Integer publicationYear, Float rating, Double discount, Boolean isEbook, Character category, Long accessionNumber) {

        this.totalPages = totalPages;
        this.isbnNumber = isbnNumber;
        this.price = price;
        this.weight = weight;
        this.bookType = bookType;
        this.isAvailable = isAvailable;
        this.author = author;
        this.publicationYear = publicationYear;
        this.rating = rating;
        this.discount = discount;
        this.isEbook = isEbook;
        this.category = category;
        this.accessionNumber = accessionNumber;
    }



    public void setTotalPages(int totalPages)
    {
        this.totalPages=totalPages;
    }
    public int getTotalPages()
    {
        return totalPages;
    }
    public void setIsbnNumber(long isbnNumber)
    {
        this.isbnNumber=isbnNumber;
    }
    public long getIsbnNumber()
    {
        return isbnNumber;
    }
    public void setPrice(float price)
    {
        this.price=price;
    }
    public float getPrice()
    {
        return price;
    }
    public void setWeight(double weight)
    {
        this.weight=weight;
    }
    public double getWeight()
    {
        return weight;
    }
    public void setBookType(char bookType)
    {
        this.bookType=bookType;
    }
    public char getBookType()
    {
        return bookType;
    }
    public void setAvailable(boolean isAvailable)
    {
        this.isAvailable=isAvailable;
    }
    public boolean isAvailable()
    {
        return isAvailable;
    }
    public void setAuthor(String author)
    {
        this.author=author;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setPublicationYear(Integer publicationYear)
    {
        this.publicationYear=publicationYear;
    }
    public  Integer getPublicationYear()
    {
        return publicationYear;
    }
    public void setRating(Float rating)
    {
        this.rating=rating;
    }
    public Float getRating()
    {
        return  rating;
    }
    public void setDiscount(Double discount)
    {
        this.discount=discount;
    }
    public Double getDiscount()
    {
        return discount;
    }
    public void setIsEbook(Boolean isEbook)
    {
        this.isEbook=isEbook;
    }
    public Boolean getIsEbook()
    {
        return isEbook;
    }
    public void setCategory(Character category)
    {
        this.category=category;
    }
    public Character getCategory()
    {
        return category;
    }
    public void setAccessionNumber(Long accessionNumber)
    {
        this.accessionNumber=accessionNumber;

    }
    public Long getAccessionNumber()
    {
        return  accessionNumber;
    }

    @Override
    public String toString() {
        return "Library[totalPages = " + totalPages + ",isbnNumber = " + isbnNumber + ",price= " + price + ",weight = " + weight + ",book type =" + bookType + "," +
                "isAvailable = " + isAvailable+",author ="+author+",publication year= "+publicationYear+",rating = "+rating+",discount = "+discount+",isEbook= "+isEbook+",category ="+category+",accession number ="+accessionNumber+"]";
    }

    public int hashCode() {
        int primenumber = 13;
        int result = 1;
        result = primenumber * result + totalPages;
        result = primenumber * result + publicationYear;

        result = primenumber * result + ((author== null) ? null : author.hashCode());

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
        BookDto bookDto = (BookDto) obj;
        return this.totalPages== bookDto.totalPages && (this.author == null ? bookDto.author == null : this.author.equals(bookDto.author));
    }

}
