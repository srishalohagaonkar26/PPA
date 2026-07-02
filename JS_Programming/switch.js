let x = 11;

switch(x)
{
    case 11 : 
        console.log("Matched number 11");
        break;

    case "11" : 
        console.log("Matched string 11");
        break;
    
    default : 
        console.log("No match");
}