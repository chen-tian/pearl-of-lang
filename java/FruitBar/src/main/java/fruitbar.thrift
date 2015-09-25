namespace java fruitbar.thrift

struct Request {
  1: string name 
  2: i32 count
}

struct Reply {
  1: string result
  2: i32 price
}

service FruitBarService
{
  Reply buyFruit(1:Request req)
} 
