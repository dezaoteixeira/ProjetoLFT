/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.node;

import projetolft.analysis.*;

@SuppressWarnings("nls")
public final class TAspa extends Token
{
    public TAspa()
    {
        super.setText("\'");
    }

    public TAspa(int line, int pos)
    {
        super.setText("\'");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAspa(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAspa(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAspa text.");
    }
}
