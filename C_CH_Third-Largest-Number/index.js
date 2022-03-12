var numberList = [20,84,75,90,10,61,57,32,100];
console.log(FindThirdLargestNumber(numberList));


function FindThirdLargestNumber(numberslist){

    let output = [];

    for (let x = 0; x < numberslist.length; x++) {
        for (let y = 0; y < numberslist.length - 1; y++) {
            if (numberslist[y] > numberslist[y + 1]) {
                let tempMax = numberslist[y];
                numberslist[y] = numberslist[y + 1];
                numberslist[y + 1] = tempMax;
            }
        }
        output[x] = numberslist[x];
    }
    //return output[output.length-3];

    console.log("List of Numbers : ", numberList);

    console.log("Third Largest Number is : ", output[output.length-3]);
    
}
