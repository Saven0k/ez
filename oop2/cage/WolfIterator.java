import java.util.Iterator;
import java.util.List;
import java.util.Iterator;

public class WolfIterator<Wolf> implements Iterator<Wolf> {
    private final List<Wolf> wolfs;
    private int cursor;

    public WolfIterator(List<Wolf> wolfs) {
        this.wolfs = wolfs;
    }

    @Override
    public boolean hasNext() {
        return cursor + 1 < wolfs.size();
    }

    @Override
    public Wolf next() {
        return wolfs.get(cursor++);
    }
}
