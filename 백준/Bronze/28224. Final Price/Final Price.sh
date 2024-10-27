#!/bin/bash

read n
total=0

for ((i = 0; i < n; i++)); do
    read a
    total=$((total + a))
done

echo $total