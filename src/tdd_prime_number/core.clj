(ns tdd-prime-number.core
  (:gen-class))

(defn prime [n]

  (loop [n n divisors 2 factors []]
    (if (> n 1)
      (if (zero? (mod n divisors))
        (recur (/ n divisors) divisors (conj factors divisors))
        (recur n (inc divisors) factors)
      )
      factors
    )
  )
)
