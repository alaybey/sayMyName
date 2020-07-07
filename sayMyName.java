// some blocks

// Just Method
public String sayMyName(){
  return asList(
    '@','z',
    'k','`',
    'x','a',
    'z','d',
    'x','h')
    .stream()
    .filter(c -> c != 122)
    .map(c -> (char) (c+1))
    .map(c -> "" + c)
    .reduce((a,b) -> a+b)
    .get();
}
//return "Alaybeyi";
// some blocks
