// JS Promise

// callback function
setTimeout(function() {
	console.log("This is a callback function.");
}, 100);
console.log("After callback function");

function task1() {
	console.log("Executing task1");
}

function task2() {
	console.log("Executing task2");
}

function task3() {
	console.log("Executing task3");
}

// 500 -> task1 -> 700 -> task2 -> 1000 -> task3
// callback hells.
setTimeout(function() {
	task1();
	setTimeout(function() {
		task2();
		setTimeout(function(){
			task3();
		}, 1000);
	}, 700);
}, 500);
