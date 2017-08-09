package more;

import java.util.ArrayList;

/**
 * Created by yangyibo on 17/7/17.
 */
public class MoreCopy implements Cloneable {
    //定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    public MoreCopy clone() {
        MoreCopy moreCopy = null;
        try {
            moreCopy = (MoreCopy) super.clone();
            //深拷贝,包括拷贝对象内部的数组、引用对象等
            this.arrayList = (ArrayList<String>)this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return moreCopy;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    //  arrayList
    public ArrayList<String> getValue() {
        return this.arrayList;

    }
}
