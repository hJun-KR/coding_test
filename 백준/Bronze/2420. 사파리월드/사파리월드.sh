#!/bin/bash

read N M

if [ $N -lt $M ]; then
    echo $((M - N))
else
    echo $((N - M))
fi