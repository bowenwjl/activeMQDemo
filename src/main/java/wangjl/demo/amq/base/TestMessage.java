package wangjl.demo.amq.base;

import java.io.Serializable;

public class TestMessage implements Serializable
{
    private static final long serialVersionUID = 1L;

    private long beginTime;
    private String attr1;
    private String attr2;
    private String attr3;
    private String attr4;
    private String attr5;
    private String attr6;
    private String attr7;
    private String attr8;
    private String attr9;
    private String attr10;
    private String traceNum;
    private String respCode;
    private String respMsg;

    public long getBeginTime()
    {
        return beginTime;
    }

    public void setBeginTime(long beginTime)
    {
        this.beginTime = beginTime;
    }

    public String getTraceNum()
    {
        return traceNum;
    }

    public void setTraceNum(String traceNum)
    {
        this.traceNum = traceNum;
    }

    public String getRespCode()
    {
        return respCode;
    }

    public void setRespCode(String respCode)
    {
        this.respCode = respCode;
    }

    public String getRespMsg()
    {
        return respMsg;
    }

    public void setRespMsg(String respMsg)
    {
        this.respMsg = respMsg;
    }

    public String getAttr1()
    {
        return attr1;
    }

    public void setAttr1(String attr1)
    {
        this.attr1 = attr1;
    }

    public String getAttr2()
    {
        return attr2;
    }

    public void setAttr2(String attr2)
    {
        this.attr2 = attr2;
    }

    public String getAttr3()
    {
        return attr3;
    }

    public void setAttr3(String attr3)
    {
        this.attr3 = attr3;
    }

    public String getAttr4()
    {
        return attr4;
    }

    public void setAttr4(String attr4)
    {
        this.attr4 = attr4;
    }

    public String getAttr5()
    {
        return attr5;
    }

    public void setAttr5(String attr5)
    {
        this.attr5 = attr5;
    }

    public String getAttr6()
    {
        return attr6;
    }

    public void setAttr6(String attr6)
    {
        this.attr6 = attr6;
    }

    public String getAttr7()
    {
        return attr7;
    }

    public void setAttr7(String attr7)
    {
        this.attr7 = attr7;
    }

    public String getAttr8()
    {
        return attr8;
    }

    public void setAttr8(String attr8)
    {
        this.attr8 = attr8;
    }

    public String getAttr9()
    {
        return attr9;
    }

    public void setAttr9(String attr9)
    {
        this.attr9 = attr9;
    }

    public String getAttr10()
    {
        return attr10;
    }

    public void setAttr10(String attr10)
    {
        this.attr10 = attr10;
    }

    @Override
    public String toString()
    {
        return "TestMessage [attr1=" + attr1 + ", attr2=" + attr2 + ", attr3=" + attr3 + ", attr4=" + attr4
                + ", attr5=" + attr5 + ", attr6=" + attr6 + ", attr7=" + attr7 + ", attr8=" + attr8 + ", attr9="
                + attr9 + ", attr10=" + attr10 + "]";
    }

}
