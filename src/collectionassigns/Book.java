package collectionassigns;

public class Book {

         Integer bid;
         String  bname;
         String bauthor;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public Book(Integer bid, String bname, String bauthor){
             this.bid = bid;
             this.bname = bname;
             this.bauthor = bauthor;

    }
}
