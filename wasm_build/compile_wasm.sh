TERRA_BIN=/home/g/ext_code/terra/bin/terra
WASM2WAT_BIN=~/software/wabt-1.0.24/bin/wasm2wat
WASMLD_BIN=/usr/bin/wasm-ld-12
LLC_BIN=/usr/bin/llc-12
S2WASM_BIN="" #requires binarian
CLANG_BIN=/usr/bin/clang-12

terrabuild() {
  $TERRA_BIN "$1".t
}

cbuild() {
  $CLANG_BIN -emit-llvm --target=wasm32 -Oz "$cfile" -c -o "$bcfile"
}

linktarget() {
  $LLC_BIN -mtriple=wasm32-unknown-unknown -O3 -filetype=obj "$1".ll -o "$1".o
}

generate_wasm() {
  $WASMLD_BIN "$1".o -o "$1".wasm --entry=main
}

generate_wat() {
  $WASM2WAT_BIN "$1".wasm > "$1".wat
}

clean() {
  rm -f "$1".ll "$1".o "$1".bc "$1".wat "$1".wasm
}
clean test
terrabuild test
linktarget test
generate_wasm test
generate_wat test

