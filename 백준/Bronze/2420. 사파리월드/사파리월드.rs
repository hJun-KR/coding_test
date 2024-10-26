use std::io;

fn main() {
    let mut input = String::new();
    io::stdin().read_line(&mut input).expect("Failed to read input");

    let numbers: Vec<i64> = input
        .trim()
        .split_whitespace()
        .map(|x| x.parse().unwrap())
        .collect();

    let N = numbers[0];
    let M = numbers[1];

    if N < M {
        println!("{}", M - N);
    } else {
        println!("{}", N - M);
    }
}