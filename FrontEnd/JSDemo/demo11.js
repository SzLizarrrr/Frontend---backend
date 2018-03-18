//ES6 var const let
const c = [];
for(var i = 0; i <= 2; i++) {
    c[i] = function() { return i*2 };
}

console.log(c[0]()); // 6
console.log(c[1]()); // 6
console.log(c[2]()); // 6

const b = [];
for(let j = 0; j <= 2; j++) {
    b[j] = function() { return j*2 };
}

console.log(b[0]()); // 0
console.log(b[1]()); // 2
console.log(b[2]()); // 4

//ES6 pass default paramter
function f() {
    // var a = Array.prototype.slice.call(arguments)
    var a = Object.values(arguments)
    var sum = 0
    a.forEach(function(item){
        sum +=item*1
    })
    return sum
}

console.log(f(1,2,3))

