{:remove-surrounding-whitespace?  true
 :remove-trailing-whitespace?     true
 :remove-consecutive-blank-lines? false
 :insert-missing-whitespace?      false
 :indents                         ^:replace {#"^\w" [[:inner 0]]}
 :test-code
 (concat [2]
   (map (fn [] inc (* % 2))
     (filter (fn [] aget sieved %)
       (range 1 hn))))}
