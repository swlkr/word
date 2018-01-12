# word

A zero dependency way to switch between plural, singular, snake and kebab case

## Install

lein: `[swlkr/word "0.1.0"]`

deps: `{swlkr/word {:mvn/version "0.1.0"}}`


## How Do I Use This?


```clojure
(ns how-to-use
  (:require [word.core :as word]))

(word/plural "customer") ; => users
(word/singular "customers") ; => user

(word/kebab "hello_world") ; => hello-world
(word/snake "hello-world") ; => hello_world

; works on keywords too!

(word/kebab :hello_world) ; => :hello-world
(word/snake :hello-world) ; => :hello_world
```
