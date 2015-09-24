#!/bin/bash

dir=$(cd $(dirname $0); pwd)

rm -rf $dir/fruitbar/thrift
thrift --gen java -out $dir $dir/fruitbar.thrift
