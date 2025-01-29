(ns tdd-prime-number.core
  (:gen-class))

(defn prime [n]
  (if (> n 1)
    [n]
    []
  )
)
