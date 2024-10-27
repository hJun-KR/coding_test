use std::io;

fn main() {
    let mut input = String::new();
    io::stdin().read_line(&mut input).expect("Failed to read line");
    let n: i32 = input.trim().parse().expect("Input was not a number");
    
    let mut total = 0;
    
    for _ in 0..n {
        input.clear();
        io::stdin().read_line(&mut input).expect("Failed to read line");
        let a: i32 = input.trim().parse().expect("Input was not a number");
        total += a;
    }
    
    println!("{}", total);
}