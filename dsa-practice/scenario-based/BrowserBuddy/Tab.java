public class Tab {

    private HistoryNode current;

    public void visit(String url) {
        HistoryNode node = new HistoryNode(url);
        if (current == null) {
            current = node;
            return;
        }
        current.next = node;
        node.prev = current;
        current = node;
    }

    public void goBack() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    public void goForward() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    public String getCurrentPage() {
        return current == null ? null : current.url;
    }
}
