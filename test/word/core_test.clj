(ns word.core-test
  (:require [clojure.test :refer :all]
            [word.core :as word]))

(deftest plural-test
  (testing "aardvark"
    (is (= "aardvarks" (word/plural "aardvark"))))
  (testing "virus"
    (is (= "viruses" (word/plural "virus"))))
  (testing "octopus"
    (is (= "octopi" (word/plural "octopus")))))

(deftest singular-test
  (testing "quizzes"
    (is (= "quiz" (word/singular "quizzes"))))

  (testing "queries"
    (is (= "query" (word/singular "queries"))))

  (testing "shoes"
    (is (= "shoe" (word/singular "shoes"))))

  (testing "keys"
    (is (= "key" (word/singular "keys"))))

  (testing "places"
    (is (= "place" (word/singular "places"))))

  (testing "watches"
    (is (= "watch" (word/singular "watches"))))

  (testing "photos"
    (is (= "photo" (word/singular "photos"))))

  (testing "users"
    (is (= "user" (word/singular "users"))))

  (testing "viruses"
    (is (= "virus" (word/singular "viruses"))))

  (testing "octopuses"
    (is (= "octopus" (word/singular "octopuses"))))
  (testing "octopi"
    (is (= "octopus" (word/singular "octopi"))))

  (testing "add-exception"
    (let [_ (word/add-exception "moose")]
      (is (= "moose" (word/plural "moose")))))

  (testing "remove-exception"
    (let [_ (word/add-exception "moose")
          _ (word/remove-exception "moose")]
      (is (= false (word/exception? "moose")))))

  (testing "Paris should be uncountable"
    (is (= "Paris" (word/singular "Paris")))))

(deftest kebab
  (testing "created_at"
    (is (= "created-at" (word/kebab "created_at"))))

  (testing "keyword created_at"
    (is (= :created-at (word/kebab :created_at)))))

(deftest snake
  (testing "created-at"
    (is (= "created_at" (word/snake "created-at"))))

  (testing "keyword created-at"
    (is (= :created_at (word/snake :created-at)))))


