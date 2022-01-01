<?php
namespace mafujo\jphp\apache\poi;

class XWPFTable
{
    public function getText() {}
    public function addNewCol() {}
    public function createRow() : XWPFTableRow {}
    public function getRow() : XWPFTableRow {}

    public function getWidth() {}
    public function setWidth($width) {}
    public function getNumberOfRows() {}
}