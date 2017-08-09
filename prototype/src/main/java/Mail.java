/**
 * Created by yangyibo on 17/6/26.
 */
public class Mail implements Cloneable {
    private String receiver;
    private String subject;
    private String appellation;
    private String contxt;
    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.contxt = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }
    //用原型实例制定创建对象的种类，并且通过拷贝这些原型创建新的对象。
    @Override
    public Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) { // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return mail;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContxt() {
        return contxt;
    }

    public void setContxt(String contxt) {
        this.contxt = contxt;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

//    public Mail clone() {
//        Mail mail = null;
//        try {
//            mail = (Mail) super.clone();
//        } catch (CloneNotSupportedException e) { // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        return mail;
//    }
}
