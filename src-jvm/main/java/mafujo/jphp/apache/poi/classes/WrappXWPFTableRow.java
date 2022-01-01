package mafujo.jphp.apache.poi.classes;

import org.apache.poi.xwpf.usermodel.ICell;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

import java.util.List;

public class WrappXWPFTableRow extends BaseWrapper<XWPFTableRow>
{
    public WrappXWPFTableRow(Environment env, XWPFTableRow wrappedObject) { super(env, wrappedObject); }
    public WrappXWPFTableRow(Environment env, ClassEntity clazz) { super(env, clazz); }

    interface WrappedInterface
    {
        public XWPFTableCell createCell();
        public XWPFTableCell getCell(int pos);
        public void removeCell(int pos);
        public XWPFTableCell addNewTableCell();

        public int getHeight();
        public void setHeight(int height);

        public XWPFTable getTable();
        //public List<ICell> getTableICells();
        public List<XWPFTableCell> getTableCells();
        public boolean isCantSplitRow();
        public void setCantSplitRow(boolean split);
        public boolean isRepeatHeader();

        public void setRepeatHeader(boolean repeat);
    }
}
