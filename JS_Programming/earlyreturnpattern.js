
function getDiscount(age) 
{
  if (age < 18) return "Minor - not eligible";
  if (age >= 60) return "Senior discount";
  return "Adult - no discount";
}