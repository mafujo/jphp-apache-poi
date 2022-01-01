package mafujo.jphp.apache.poi.classes;

import org.apache.poi.xwpf.usermodel.*;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

import java.util.List;

public class WrappXWPFTableCell extends BaseWrapper<XWPFTableCell>
{
    public WrappXWPFTableCell(Environment env, XWPFTableCell wrappedObject) { super(env, wrappedObject); }
    public WrappXWPFTableCell(Environment env, ClassEntity clazz) { super(env, clazz); }

    interface WrappedInterface
    {
        //public List<IBodyElement> getBodyElements();
        public void setParagraph(XWPFParagraph p);
        public List<XWPFParagraph> getParagraphs();
        public XWPFParagraph addParagraph();
        public void addParagraph(XWPFParagraph p);
        public void removeParagraph(int pos);
        //public XWPFParagraph getParagraph(CTP p);
        public XWPFTableRow getTableRow();
        public String getColor();
        public void setColor(String rgbStr);

        public XWPFParagraph getParagraphArray(int pos);

        public XWPFTable getTableArray(int pos);
        public List<XWPFTable> getTables();
        public void insertTable(int pos, XWPFTable table);
        public void removeTable(int pos);
        public String getText();
        public void setText(String text);
        public String getTextRecursively();

        public XWPFDocument getXWPFDocument();
        public double getWidthDecimal();

    }
}
