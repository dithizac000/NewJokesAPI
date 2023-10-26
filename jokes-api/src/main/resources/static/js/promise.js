// divide number
let promise = new Promise(function (resolve, reject)
{
    // inside the executor stored in the promise
    let num = promt("Enter a numerator");
    let den = promt("Enter a denominator");

    // conver to number
    num = parseFloat(num);
    den = parseFloat(den);


    //check point
    if(Number.isNaN(nun) || NumberisNan(den)) {
        throw Error("Not a number!");
    }
    if(den == 0) {
        reject("Cannot divide by zero")
    } else {
        let result = num / den;

        // report success using the first parameter (which is a function)
        result("Result is " + result);
    }

});

promise
    .then(function (success) {
        console.log("Promised successful");
        console.log(success);
}, function(failure){
        console.log("Promise failed...");
        console.log(failure)
}).catch(function(error) {
        console.log("something went wrong");
        console.log(error);
});