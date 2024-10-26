<?php

fscanf(STDIN, "%d %d", $N, $M);

if ($N < $M) {
    echo $M - $N;
} else {
    echo $N - $M;
}