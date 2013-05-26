(ns hello-ring.core-test
  (:require [clojure.test :refer :all]
            [hello-ring.core :refer :all]))

(deftest a-test
  (let [req {}
        resp (app req)]
    (is (= 200 (:status resp)))
    (is (= "Hello, world" (:body resp)))))

(deftest test-mapper
  (let [m {:name "Jack" :age 34}
        name (:name m)
        age (:age m)]
    (is (= "Jack" name))
    (is (= 34 age))))
