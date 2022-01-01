package mafujo.jphp.apache.poi;


import mafujo.jphp.apache.poi.classes.*;
import org.apache.poi.xwpf.usermodel.*;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

public class ApachePOIExtension extends Extension
{
    public static final String NS = "mafujo\\jphp\\apache\\poi";

    @Override
    public Status getStatus() { return Status.EXPERIMENTAL; }

    @Override
    public void onRegister(CompileScope compileScope)
    {
        // document...
        registerWrapperClass(compileScope, XWPFDocument.class, WrappXWPFDocument.class);
        //to-do: XWPFRun

        // text...
        registerWrapperClass(compileScope, XWPFParagraph.class, WrappXWPFParagraph.class);

        // tables...
        registerWrapperClass(compileScope, XWPFTable.class, WrappXWPFTable.class);

        registerWrapperClass(compileScope, XWPFTableCell.class, WrappXWPFTableCell.class);
        registerWrapperClass(compileScope, XWPFTableRow.class, WrappXWPFTableRow.class);

        // charts...
        registerWrapperClass(compileScope, XWPFChart.class, WrappXWPFChart.class);



    }
}
