(ns tdd-prime-number.core-test
  (:require [clojure.test :refer :all]
            [tdd-prime-number.core :refer :all]))

(deftest prime-test
  (testing "should got []"
      (is (= [] (prime 1)))
  )
)
