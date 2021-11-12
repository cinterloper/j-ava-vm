terra main(a:int, b:int)
  var c = a+2 #3
  var d = b*10 #20
  return c+d #23
end
local m = { main=main }
terralib.saveobj("test.o",m)
terralib.saveobj("test.bc",m)
terralib.saveobj("test.ll",m)

