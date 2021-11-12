; ModuleID = 'terra'
source_filename = "terra"
target datalayout = "e-m:e-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

; Function Attrs: norecurse nounwind readnone willreturn
define dso_local i32 @main(i32 %0, i32 %1) local_unnamed_addr #0 {
entry:
  %2 = add i32 %0, 2
  %3 = mul i32 %1, 10
  %4 = add i32 %2, %3
  ret i32 %4
}

attributes #0 = { norecurse nounwind readnone willreturn }
