(ns tdd-prime-number.core-test
  (:require [clojure.test :refer :all]
            [tdd-prime-number.core :refer :all]))

(deftest prime-test
  (testing "should got []"
      (is (= [] (prime 1)))
  )

  (testing "should got [2]"
      (is (= [2] (prime 2)))
  )

  (testing "should got [3]"
      (is (= [3] (prime 3)))
  )
)
