package mafujo.jphp.apache.poi.classes;

import mafujo.jphp.apache.poi.ApachePOIExtension;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTbl;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("XWPFTable")
@Reflection.Namespace(ApachePOIExtension.NS)
public class WrappXWPFTable extends BaseWrapper<XWPFTable>
{
    public WrappXWPFTable(Environment env, XWPFTable wrappedObject) { super(env, wrappedObject); }
    public WrappXWPFTable(Environment env, ClassEntity clazz) { super(env, clazz); }

    interface WrappedInterface
    {
        //public CTTbl getCTTbl();

        public String getText();
        public void addNewCol();
        public XWPFTableRow createRow();
        public XWPFTableRow getRow(int pos);

        public int getWidth();
        public void setWidth(int width);
        public int getNumberOfRows();
    }
}
