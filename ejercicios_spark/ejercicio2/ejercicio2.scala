val aux=spark.read.json("/user/bigdata/ejercicios_spark/ejercicio2/employee.json")
aux.show()
res0.registerTempTable("employeeTemp")
aux2=spark.sql("select * from employeeTemp")
aux2.show()
aux2.write.json("/user/bigdata/ejercicios_spark/ejercicio2/out/exam.json")
