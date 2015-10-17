(ns ^:figwheel-always launcher.test
  (:require [cljs.test :refer [successful?] :refer-macros [run-tests run-all-tests]]
            [cljs-browser-repl.console-test]
            [cljs-bootstrap.core-test]
            [cljs-bootstrap.repl-test]))

(enable-console-print!)

(defmethod cljs.test/report [:cljs.test/default :end-run-tests] [m]
  (successful? m))

(defn ^:export run
  []
  (run-all-tests #"^cljs.*-test"))