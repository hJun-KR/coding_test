const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('', (input) => {
    const [N, M] = input.split(' ').map(Number);

    if (N < M) {
        console.log(M - N);
    } else {
        console.log(N - M);
    }

    rl.close();
});