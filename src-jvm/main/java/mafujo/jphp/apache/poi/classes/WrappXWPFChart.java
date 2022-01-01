package mafujo.jphp.apache.poi.classes;

import org.apache.poi.xwpf.usermodel.XWPFChart;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

public class WrappXWPFChart extends BaseWrapper<XWPFChart>
{
    public WrappXWPFChart(Environment env, XWPFChart wrappedObject) { super(env, wrappedObject); }
    public WrappXWPFChart(Environment env, ClassEntity clazz) { super(env, clazz); }

    interface WrappedInterface
    {
        public void setChartHeight(long height);
        public void setChartWidth(long width);
        public long getChartHeight();
        public long getChartWidth();
        public void setChartBoundingBox(long width, long height);
        public void setChartTopMargin(long margin);
        public long getChartTopMargin(long margin);
        public void setChartBottomMargin(long margin);
        public long getChartBottomMargin(long margin);
        public void setChartLeftMargin(long margin);
        public long getChartLeftMargin(long margin);
        public void setChartRightMargin(long margin);
        public long getChartRightMargin(long margin);
        public void setChartMargin(long top, long right, long bottom, long left);
    }
}
