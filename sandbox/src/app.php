<?php

use php\gui\UXApplication;
use php\gui\UXForm;
use php\io\File;

use mafujo\jphp\apache\poi\XWPFDocument;

UXApplication::launch(function(UXForm $form)
{
    $file = new File("sample-file.docx");

    $docx = new XWPFDocument($file);

    //$paragraphs = $docx->getParagraphs();
    //foreach($paragraphs as $paragraph) { var_dump($paragraph->getText()); }

    $tables = $docx->getTables();
    foreach($tables as $table) { var_dump($table->getText()); }
});