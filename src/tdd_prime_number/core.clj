(ns tdd-prime-number.core
  (:gen-class))

(defn prime [n]
  (if (> n 1)
    (if (= 0 (mod n 2))
      (cons 2 (prime(/ n 2)))
      (if (= 0 (mod n 3))
        (cons 3 (prime(/ n 3)))
        [n]
      )
    )
    []
  )
)
