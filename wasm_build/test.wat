(module
  (type (;0;) (func (param i32 i32) (result i32)))
  (func $main (type 0) (param i32 i32) (result i32)
    local.get 0
    local.get 1
    i32.const 10
    i32.mul
    i32.add
    i32.const 2
    i32.add)
  (memory (;0;) 2)
  (global $__stack_pointer (mut i32) (i32.const 66560))
  (export "memory" (memory 0))
  (export "main" (func $main)))
