<?php
echo "====String menggunakan singga quote==== \n";
echo 'Name : ';
echo 'Eko Kurniawan Khannedy ' ;

echo "\n";

echo "====String menggunakan double quote==== \n";
echo "Name : ";
echo "Eko\t Kurniawan\t Khannedy\n" ;


echo "====String menggunakan heredoc==== \n";
echo <<<EKO
Selamat belajar PHP
sekarang, kita belajar tipe data string
ini adalah cara ke-3 membuat string
bisa menggunakan heredoc

EKO;

echo "====String menggunakan nowdoc==== \n";
echo <<<'EKO'
Selamat belajar PHP
sekarang, kita belajar tipe data string
ini adalah cara ke-3 membuat string
bisa menggunakan nowdoc
EKO;