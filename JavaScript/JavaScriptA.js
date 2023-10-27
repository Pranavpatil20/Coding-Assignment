// Take a sentence as a input and reverse every word in that sentence.
const string = "This is a sunny day";

let revStr = string.split(' ')
                    .map(word=>word.split('').reverse().join(''))
                    .join(' ');

console.log(revStr);
