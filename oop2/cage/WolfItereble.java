import java.util.Iterator;
import java.util.List;

public class WolfItereble<Wolf> implements Iterable<Wolf> {

    private List<Wolf> wolfs;

    public WolfItereble(List<Wolf> wolfs) {
        this.wolfs = wolfs;
    }

    @Override
    public Iterator<Wolf> iterator() {
        return new WolfIterator(wolfs);
    }

}
