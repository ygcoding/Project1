public class Book {

        private String title;
        private int pages;
        public Book(String n, int a){
            title = n;
            pages = a;
        }
        public void setPages(int pages) {
            this.pages = pages;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public String getTitle(String title){
            return title;
        }
        public int getPages() {
            return pages;
        }
        public String toString(){
            return "Title: " + this.title + ", Amount of pages: " + this.pages;
        }
        public void parity(){
            if(pages % 2 == 0){
            System.out.println("Amount of pages in " + this.title + " book is even");
        }
            if(pages % 2 == 1){
                System.out.println("Amount of pages in " + this.title + " book is odd");
            }
    }
}
