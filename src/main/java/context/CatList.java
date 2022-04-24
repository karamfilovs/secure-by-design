package context;

import org.apache.commons.lang3.Validate;

import java.util.ArrayList;
import java.util.List;

public class CatList {
    private List<String> catNames = new ArrayList<>();


    public void addCatName(String name){
        Validate.notNull(name);
        Validate.matchesPattern(name, ".*s.*", "Should contain at least one s");
        Validate.isTrue(!catNames.contains(name));
        catNames.add(name);
    }

    public void removeCatName(){
        Validate.validState(!catNames.isEmpty());
        catNames.remove(0);
    }

    public String nextCatName(){
        Validate.validState(!catNames.isEmpty());
        return catNames.get(0);
    }

    public int size(){
        return catNames.size();
    }



}
