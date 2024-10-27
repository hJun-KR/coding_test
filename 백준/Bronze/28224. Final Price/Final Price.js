const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let total = 0;
let count = 0;

rl.question('', (n) => {
  const num = parseInt(n);
  
  rl.on('line', (input) => {
    total += parseInt(input);
    count++;
    
    if (count === num) {
      console.log(total);
      rl.close();
    }
  });
});