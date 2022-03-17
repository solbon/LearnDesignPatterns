package pl.malpiszon.iterator;

public class BrowseHistory {
    //    private List<String> urls = new ArrayList<>();
    private String[] urls = new String[10];
    private int count;

    public void push(String url) {
        urls[count++] = url;
    }

    public String pop() {
        return urls[--count];
    }

    public Iterator createIterator() {
//        return new ListIterator(this);
        return new ArrayIterator(this);
    }

//    public class ListIterator implements Iterator {
//
//        private BrowseHistory history;
//        private int index;
//
//        public ListIterator(BrowseHistory history) {
//            this.history = history;
//        }
//
//        @Override
//        public void next() {
//            index++;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return (index < history.urls.size());
//        }
//
//        @Override
//        public String current() {
//            return history.urls.get(index);
//        }
//    }

    public class ArrayIterator implements Iterator {

        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public String current() {
            return history.urls[index];
        }
    }


}
