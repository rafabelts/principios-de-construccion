let i = 1;

console.log("CON FOR");

const multiply = (j) => {
  for (j; j < 11; j++) {
    console.log(`${i} X ${j} = ${i * j}`);
  }
};

for (i; i < 11; i++) {
  let j = 1;
  multiply(j);
  console.log("\n");
}

console.log("CON WHILE");

// WHILE
let k = 1;

while (k < 11) {
  let l = 1;

  while (l < 11) {
    console.log(`${k} X ${l} = ${k * l}`);

    l++;
  }

  k++;
  console.log("\n");
}
