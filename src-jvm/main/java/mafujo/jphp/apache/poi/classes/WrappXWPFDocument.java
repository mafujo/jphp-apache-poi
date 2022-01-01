package mafujo.jphp.apache.poi.classes;

import mafujo.jphp.apache.poi.ApachePOIExtension;
import org.apache.poi.xwpf.usermodel.XWPFChart;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.ext.core.classes.stream.Stream;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Reflection.Name("XWPFDocument")
@Reflection.Namespace(ApachePOIExtension.NS)
public class WrappXWPFDocument extends BaseWrapper<XWPFDocument>
{
    public WrappXWPFDocument(Environment env, XWPFDocument wrappedObject) { super(env, wrappedObject); }
    public WrappXWPFDocument(Environment env, ClassEntity clazz) { super(env, clazz); }

    @Reflection.Signature
    public void __construct(File file) throws IOException
    {
        __wrappedObject = new XWPFDocument(new FileInputStream(file));
    }

    interface WrappedInterface
    {
        public List<XWPFParagraph> getParagraphs();
        public List<XWPFTable> getTables();
        public List<XWPFChart> getCharts();
    }
}