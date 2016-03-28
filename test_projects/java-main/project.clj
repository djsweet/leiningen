(defproject java-main "0.1.0-SNAPSHOT"
  :java-source-paths ["src/java"]
  :dependencies [[org.clojure/clojure "1.8.0"]] ;; lein run errors if not there.
  :main my.java.Main
  ;; Possibly trigger a bug where javac class files end up in a different target directory
  ;; as a result of javac altering the target path
  :target-path "target/%s")
