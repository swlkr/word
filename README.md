# word

A zero dependency way to switch between plural, singular, camel case, snake case and kebab case

## How Do I Use This?

[swlkr/word "0.1.0"]

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
