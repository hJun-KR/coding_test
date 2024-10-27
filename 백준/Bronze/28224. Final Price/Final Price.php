<?php
$n = intval(fgets(STDIN));
$total = 0;

for ($i = 0; $i < $n; $i++) {
    $a = intval(fgets(STDIN));
    $total += $a;
}

echo $total . "\n";
?>