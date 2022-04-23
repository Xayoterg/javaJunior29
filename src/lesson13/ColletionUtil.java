package lesson13;

import javax.print.attribute.standard.Copies;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ColletionUtil implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> union = new LinkedList<>();
        union.addAll(a);
        union.addAll(b);

        return union;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> intersection = new HashSet<>();




        return intersection;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> unionWithoutDuplicate = new HashSet<>();
        unionWithoutDuplicate.addAll(a);
        unionWithoutDuplicate.addAll(b);
        for (Integer x : b) {
            if (!a.contains(x))
                a.add(x);
        }


        return unionWithoutDuplicate;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> intersectionWithoutDuplicate = new HashSet<>();


        return intersectionWithoutDuplicate;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {



            return null;


        }
    }




