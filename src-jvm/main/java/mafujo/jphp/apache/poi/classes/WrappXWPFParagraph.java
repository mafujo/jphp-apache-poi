package mafujo.jphp.apache.poi.classes;

import mafujo.jphp.apache.poi.ApachePOIExtension;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("XWPFParagraph")
@Reflection.Namespace(ApachePOIExtension.NS)
public class WrappXWPFParagraph extends BaseWrapper<XWPFParagraph>
{
    public WrappXWPFParagraph(Environment env, XWPFParagraph wrappedObject) { super(env, wrappedObject); }
    public WrappXWPFParagraph(Environment env, ClassEntity clazz) { super(env, clazz); }

    interface WrappedInterface
    {
        public String getText();
    }
}
