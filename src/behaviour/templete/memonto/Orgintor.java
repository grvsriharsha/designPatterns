package behaviour.templete.memonto;

/**
 * Created by admins on 8/18/17.
 */
public class Orgintor  {

    public int getContent() {
        return content;
    }

    private int content;
    public Orgintor(int content)
    {
        this.content=content;
    }

    public void undoSave(Object object)
    {
        Memeto memeto=(Memeto)object;
        this.content=memeto.content;

    }

    public Object save()
    {
        return new Memeto(this.content); //deep copy
    }

    private class Memeto
    {
        private int content;

        Memeto(int content)
        {
            this.content=content;
        }
    }

}
