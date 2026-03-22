package Library_Management_System;

class Book extends LibraryItem implements Reservable{
    private boolean isAvailable = true;
    private String borrowerName;

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 14; // 14 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            this.borrowerName = borrowerName;
            isAvailable = false;
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book not available");
        }
    }

    @Override
    public void checkAvailability() {
        System.out.println("Available: " + isAvailable);
    }
}
