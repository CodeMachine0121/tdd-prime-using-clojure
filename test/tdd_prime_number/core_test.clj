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

  (testing "should got [2 2]"
      (is (= [2 2] (prime 4)))
  )

  (testing "should got [5]"
      (is (= [5] (prime 5)))
  )

  (testing "should got [2 3]"
      (is (= [2 3] (prime 6)))
  )

  (testing "should got [7]"
      (is (= [7] (prime 7)))
  )

  (testing "should got [2 2 2]"
      (is (= [2 2 2] (prime 8)))
  )
)
