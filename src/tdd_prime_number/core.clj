(ns tdd-prime-number.core
  (:gen-class))

(defn prime [n]

  (loop [n n divisors 2 factors []]
    (if (> n 1)
      (if (zero? (mod n divisors))
        (recur (/ divisors n) divisors (conj divisors factors))
        (recur n (inc divisors) factors)
      )
      factors
    )
  )
)
