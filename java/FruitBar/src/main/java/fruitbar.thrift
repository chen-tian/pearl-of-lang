namespace java fruitbar.thrift

struct Request {
  1: string name 
  2: i32 count
}

struct Reply {
  1: string result
  2: optional i32 price
}

service FruitBarService
{
  void serve(1:Request req, 2:Reply reply)
} 
